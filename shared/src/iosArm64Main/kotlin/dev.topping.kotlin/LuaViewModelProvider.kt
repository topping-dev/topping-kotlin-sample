package dev.topping.kotlin

import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef

actual open class LuaViewModelProvider : KTInterface
{
   var luaViewModelProvider: cocoapods.Topping.LuaViewModelProvider? = null

    actual companion object {
        actual fun Of(fragment: LuaFragment): LuaViewModelProvider {
            val prov = LuaViewModelProvider()
            val nat = cocoapods.Topping.LuaViewModelProvider.OfFragment(fragment.GetNativeObject() as cocoapods.Topping.LuaFragment)
            prov.SetNativeObject(nat)
            return prov
        }

        actual fun Of(form: LuaForm): LuaViewModelProvider {
            val prov = LuaViewModelProvider()
            val nat = cocoapods.Topping.LuaViewModelProvider.OfForm(form.GetNativeObject() as cocoapods.Topping.LuaForm)
            prov.SetNativeObject(nat)
            return prov
        }
    }

    actual fun Get(key: String): LuaViewModel {
        return KTWrap.Wrap(luaViewModelProvider?.Get(key)) as LuaViewModel
    }

    actual inline fun <reified T:Any> Get(key: String, obj: T): T {
        return (luaViewModelProvider?.Get(key, StableRef.create(obj).asCPointer()) as COpaquePointer).asStableRef<T>().get()
    }

    open override fun GetNativeObject(): Any?
    {
        return luaViewModelProvider
    }
    open override fun SetNativeObject(par :Any?)
    {
        luaViewModelProvider = par as cocoapods.Topping.LuaViewModelProvider?
    }
}
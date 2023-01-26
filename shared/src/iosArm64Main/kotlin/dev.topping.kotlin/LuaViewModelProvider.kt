package dev.topping.kotlin

import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef

actual open class LuaViewModelProvider : KTInterface
{
   var luaViewModelProvider: cocoapods.Topping.LuaViewModelProvider? = null

    actual companion object {
        actual fun of(fragment: LuaFragment): LuaViewModelProvider {
            val prov = LuaViewModelProvider()
            val nat = cocoapods.Topping.LuaViewModelProvider.ofFragment(fragment.GetNativeObject() as cocoapods.Topping.LuaFragment)
            prov.SetNativeObject(nat)
            return prov
        }

        actual fun of(form: LuaForm): LuaViewModelProvider {
            val prov = LuaViewModelProvider()
            val nat = cocoapods.Topping.LuaViewModelProvider.ofForm(form.GetNativeObject() as cocoapods.Topping.LuaForm)
            prov.SetNativeObject(nat)
            return prov
        }
    }

    actual fun get(key: String): LuaViewModel {
        return KTWrap.Wrap(luaViewModelProvider?.get(key)) as LuaViewModel
    }

    actual inline fun <reified T:Any> get(key: String, obj: T): T {
        return (luaViewModelProvider?.get(key, StableRef.create(obj).asCPointer()) as COpaquePointer).asStableRef<T>().get()
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
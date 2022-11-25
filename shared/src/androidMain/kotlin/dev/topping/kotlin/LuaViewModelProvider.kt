package dev.topping.kotlin

actual open class LuaViewModelProvider : KTInterface
{
   var luaViewModelProvider: dev.topping.android.LuaViewModelProvider? = null

    actual companion object {
        actual fun OfFragment(fragment: LuaFragment): LuaViewModelProvider {
            val prov = LuaViewModelProvider()
            val nat = dev.topping.android.LuaViewModelProvider.OfFragment(fragment.GetNativeObject() as dev.topping.android.LuaFragment)
            prov.SetNativeObject(nat)
            return prov
        }

        actual fun OfForm(form: LuaForm): LuaViewModelProvider {
            val prov = LuaViewModelProvider()
            val nat = dev.topping.android.LuaViewModelProvider.OfForm(form.GetNativeObject() as dev.topping.android.LuaForm)
            prov.SetNativeObject(nat)
            return prov
        }
    }

    actual fun Get(tag: String): LuaViewModel {
        return KTWrap.Wrap(luaViewModelProvider?.Get(tag)) as LuaViewModel
    }

    open override fun GetNativeObject(): Any?
    {
        return luaViewModelProvider
    }
    open override fun SetNativeObject(par :Any?)
    {
        luaViewModelProvider = par as dev.topping.android.LuaViewModelProvider?
    }
}
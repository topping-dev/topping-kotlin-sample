package dev.topping.kotlin

actual open class LuaViewModelProvider : KTInterface
{
   var luaViewModelProvider: cocoapods.Topping.LuaViewModelProvider? = null

    actual companion object {
        actual fun OfFragment(fragment: LuaFragment): LuaViewModelProvider {
            val prov = LuaViewModelProvider()
            val nat = cocoapods.Topping.LuaViewModelProvider.OfFragment(fragment.GetNativeObject() as cocoapods.Topping.LuaFragment)
            prov.SetNativeObject(nat)
            return prov
        }

        actual fun OfForm(form: LuaForm): LuaViewModelProvider {
            val prov = LuaViewModelProvider()
            val nat = cocoapods.Topping.LuaViewModelProvider.OfForm(form.GetNativeObject() as cocoapods.Topping.LuaForm)
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
        luaViewModelProvider = par as cocoapods.Topping.LuaViewModelProvider?
    }
}
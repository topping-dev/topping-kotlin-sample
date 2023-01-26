package dev.topping.kotlin

actual open class LuaViewModelProvider : KTInterface
{
   var luaViewModelProvider: dev.topping.android.LuaViewModelProvider? = null

    actual companion object {
        actual fun of(fragment: LuaFragment): LuaViewModelProvider {
            val prov = LuaViewModelProvider()
            val nat = dev.topping.android.LuaViewModelProvider.ofFragment(fragment.GetNativeObject() as dev.topping.android.LuaFragment)
            prov.SetNativeObject(nat)
            return prov
        }

        actual fun of(form: LuaForm): LuaViewModelProvider {
            val prov = LuaViewModelProvider()
            val nat = dev.topping.android.LuaViewModelProvider.ofForm(form.GetNativeObject() as dev.topping.android.LuaForm)
            prov.SetNativeObject(nat)
            return prov
        }
    }

    actual fun get(key: String): LuaViewModel {
        return KTWrap.Wrap(luaViewModelProvider?.get(key)) as LuaViewModel
    }

    actual inline fun <reified T:Any> get(key: String, obj: T): T {
        return obj
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
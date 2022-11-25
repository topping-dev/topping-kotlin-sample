package dev.topping.kotlin

actual open class LuaViewModel : KTInterface
{
   var luaViewModel: dev.topping.android.LuaViewModel? = null

    actual fun SetObject(key: String, obj: Any)
    {
        luaViewModel?.SetObject(key, obj)
    }

    actual fun GetObject(key: String) : Any?
    {
        return luaViewModel?.GetObject(key)
    }

    open override fun GetNativeObject(): Any?
    {
        return luaViewModel
    }
    open override fun SetNativeObject(par :Any?)
    {
        luaViewModel = par as dev.topping.android.LuaViewModel?
    }
}
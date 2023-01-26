package dev.topping.kotlin

actual open class LuaViewModel : KTInterface
{
   var luaViewModel: dev.topping.android.LuaViewModel? = null

    actual val viewModelScope: LuaCoroutineScope
        get() = KTWrap.Wrap(luaViewModel?.viewModelScope) as LuaCoroutineScope

    actual fun setObject(key: String, obj: Any?)
    {
        luaViewModel?.setObject(key, obj)
    }

    actual fun getObject(key: String) : Any?
    {
        return luaViewModel?.getObject(key)
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
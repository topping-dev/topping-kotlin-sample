package dev.topping.kotlin

actual open class LuaViewModel : KTInterface
{
   var luaViewModel: cocoapods.Topping.LuaViewModel? = null
    val objectMap = mutableMapOf<String, Any?>()
    protected actual val viewModelScope: LuaCoroutineScope
        get() = KTWrap.Wrap(luaViewModel?.getViewModelScope()) as LuaCoroutineScope

    actual fun setObject(key: String, obj: Any?)
    {
        objectMap[key] = obj
    }

    actual fun getObject(key: String) : Any?
    {
        return objectMap[key]
    }

    open override fun GetNativeObject(): Any?
    {
        return luaViewModel
    }
    open override fun SetNativeObject(par :Any?)
    {
        luaViewModel = par as cocoapods.Topping.LuaViewModel?
    }
}
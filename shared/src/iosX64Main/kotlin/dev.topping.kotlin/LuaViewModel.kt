package dev.topping.kotlin

actual open class LuaViewModel : KTInterface
{
   var luaViewModel: cocoapods.Topping.LuaViewModel? = null
    val objectMap = mutableMapOf<String, Any>()

    actual fun SetObject(key: String, obj: Any)
    {
        objectMap[key] = obj
    }

    actual fun GetObject(key: String) : Any?
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
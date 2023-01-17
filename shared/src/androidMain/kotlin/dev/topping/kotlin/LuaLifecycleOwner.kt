package dev.topping.kotlin

actual open class LuaLifecycleOwner : KTInterface
{
   var luaLifecycleOwner: dev.topping.android.LuaLifecycleOwner? = null

    open override fun GetNativeObject(): Any?
    {
        return luaLifecycleOwner
    }
    open override fun SetNativeObject(par :Any?)
    {
        luaLifecycleOwner = par as dev.topping.android.LuaLifecycleOwner?
    }


}
package dev.topping.kotlin

actual open class LuaBundle : KTInterface {
    var luaBundle: dev.topping.android.LuaBundle? = null

    open override fun GetNativeObject(): Any?
    {
        return luaBundle
    }
    open override fun SetNativeObject(par :Any?)
    {
        luaBundle = par as dev.topping.android.LuaBundle?
    }
}
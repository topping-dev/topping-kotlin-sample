package dev.topping.kotlin

actual open class LuaBundle : KTInterface {
    //var luaBundle: cocoapods.Topping.LuaBundle? = null

    open override fun GetNativeObject(): Any?
    {
        //return luaBundle
        return null
    }
    open override fun SetNativeObject(par :Any?)
    {
        //luaBundle = par as cocoapods.Topping.LuaBundle?
    }
}
package dev.topping.kotlin

actual class LuaJob : KTInterface {
    var luaJob: cocoapods.Topping.LuaJob? = null

    actual fun cancel() {
        luaJob?.cancel()
    }

    open override fun GetNativeObject(): Any?
    {
        return luaJob
    }
    open override fun SetNativeObject(par :Any?)
    {
        luaJob = par as cocoapods.Topping.LuaJob?
    }
}
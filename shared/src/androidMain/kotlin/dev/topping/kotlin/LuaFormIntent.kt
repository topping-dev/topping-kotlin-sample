package dev.topping.kotlin

actual class LuaFormIntent : KTInterface {
    var luaFormIntent: dev.topping.android.LuaFormIntent? = null

    actual fun getBundle() : LuaBundle {
        return KTWrap.Wrap(luaFormIntent?.getBundle()) as LuaBundle
    }

    actual fun setFlags(flags: Int) {
        luaFormIntent?.setFlags(flags)
    }

    open override fun GetNativeObject(): Any?
    {
        return luaFormIntent
    }
    open override fun SetNativeObject(par :Any?)
    {
        luaFormIntent = par as dev.topping.android.LuaFormIntent?
    }
}
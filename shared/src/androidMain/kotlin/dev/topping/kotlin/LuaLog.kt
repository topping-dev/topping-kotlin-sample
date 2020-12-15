package dev.topping.kotlin

actual open class LuaLog : KTInterface
{
   var luaLog: dev.topping.android.LuaLog? = null
   actual companion object {
        actual fun V(tag: String?, message: String?)
        {
            dev.topping.android.LuaLog.V(tag, message)
        }
        actual fun D(tag: String?, message: String?)
        {
            dev.topping.android.LuaLog.D(tag, message)
        }
        actual fun I(tag: String?, message: String?)
        {
            dev.topping.android.LuaLog.I(tag, message)
        }
        actual fun W(tag: String?, message: String?)
        {
            dev.topping.android.LuaLog.W(tag, message)
        }
        actual fun E(tag: String?, message: String?)
        {
            dev.topping.android.LuaLog.E(tag, message)
        }
   }
    open override fun GetNativeObject(): Any?
   {
       return luaLog
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaLog = par as dev.topping.android.LuaLog?
   }
}
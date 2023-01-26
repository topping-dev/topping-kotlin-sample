package dev.topping.kotlin

actual open class LuaLog : KTInterface
{
   var luaLog: dev.topping.android.LuaLog? = null
   actual companion object {
        actual fun v(tag: String, message: String)
        {
            dev.topping.android.LuaLog.v(tag, message)
        }
        actual fun d(tag: String, message: String)
        {
            dev.topping.android.LuaLog.d(tag, message)
        }
        actual fun i(tag: String, message: String)
        {
            dev.topping.android.LuaLog.i(tag, message)
        }
        actual fun w(tag: String, message: String)
        {
            dev.topping.android.LuaLog.w(tag, message)
        }
        actual fun e(tag: String, message: String)
        {
            dev.topping.android.LuaLog.e(tag, message)
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
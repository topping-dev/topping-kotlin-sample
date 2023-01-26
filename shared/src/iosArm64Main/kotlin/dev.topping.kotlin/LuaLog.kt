package dev.topping.kotlin

actual open class LuaLog : KTInterface
{
   var luaLog: cocoapods.Topping.LuaLog? = null
   actual companion object {
        actual fun v(tag: String, message: String)
        {
            cocoapods.Topping.LuaLog.v(tag, message)
        }
        actual fun d(tag: String, message: String)
        {
            cocoapods.Topping.LuaLog.d(tag, message)
        }
        actual fun i(tag: String, message: String)
        {
            cocoapods.Topping.LuaLog.i(tag, message)
        }
        actual fun w(tag: String, message: String)
        {
            cocoapods.Topping.LuaLog.w(tag, message)
        }
        actual fun e(tag: String, message: String)
        {
            cocoapods.Topping.LuaLog.e(tag, message)
        }
   }
    open override fun GetNativeObject(): Any?
   {
       return luaLog
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaLog = par as cocoapods.Topping.LuaLog?
   }
}
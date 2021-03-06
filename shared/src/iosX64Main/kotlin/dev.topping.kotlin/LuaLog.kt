package dev.topping.kotlin

actual open class LuaLog : KTInterface
{
   var luaLog: cocoapods.Topping.LuaLog? = null
   actual companion object {
        actual fun V(tag: String?, message: String?)
        {
            cocoapods.Topping.LuaLog.V(tag, message)
        }
        actual fun D(tag: String?, message: String?)
        {
            cocoapods.Topping.LuaLog.D(tag, message)
        }
        actual fun I(tag: String?, message: String?)
        {
            cocoapods.Topping.LuaLog.I(tag, message)
        }
        actual fun W(tag: String?, message: String?)
        {
            cocoapods.Topping.LuaLog.W(tag, message)
        }
        actual fun E(tag: String?, message: String?)
        {
            cocoapods.Topping.LuaLog.E(tag, message)
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
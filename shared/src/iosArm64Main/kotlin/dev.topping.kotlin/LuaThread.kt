package dev.topping.kotlin

actual open class LuaThread : KTInterface
{
   var luaThread: cocoapods.Topping.LuaThread? = null
   actual companion object {
        actual fun runOnUIThread(func: () -> Unit)
        {
            cocoapods.Topping.LuaThread.runOnUIThread(func.toLuaTranslator(null))
        }
        actual fun runOnBackground(func: () -> Unit)
        {
            cocoapods.Topping.LuaThread.runOnBackground(func.toLuaTranslator(null))
        }
        actual fun new(func: () -> Unit): LuaThread {
            val pobj = LuaThread()
            val pres = cocoapods.Topping.LuaThread.new(func.toLuaTranslator(null))
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun start()
   {
       luaThread?.run()
   }
   actual fun interrupt()
   {
       luaThread?.interrupt()
   }
    actual fun sleep(milliseconds: Long)
    {
        luaThread?.sleep(milliseconds)
    }
    open override fun GetNativeObject(): Any?
   {
       return luaThread
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaThread = par as cocoapods.Topping.LuaThread?
   }
}
package dev.topping.kotlin

actual open class LuaThread : KTInterface
{
   var luaThread: dev.topping.android.LuaThread? = null
   actual companion object {
        actual fun runOnUIThread(func: () -> Unit)
        {
            dev.topping.android.LuaThread.runOnUIThread(func.toLuaTranslator(null))
        }
        actual fun runOnBackground(func: () -> Unit)
        {
            dev.topping.android.LuaThread.runOnBackground(func.toLuaTranslator(null))
        }
        actual fun new(func: () -> Unit): LuaThread {
            val pobj = LuaThread()
            val pres = dev.topping.android.LuaThread.create(func.toLuaTranslator(null))
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun start()
   {
       luaThread?.start()
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
       luaThread = par as dev.topping.android.LuaThread?
   }
}
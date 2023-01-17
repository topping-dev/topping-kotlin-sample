package dev.topping.kotlin

actual open class LuaThread : KTInterface
{
   var luaThread: dev.topping.android.LuaThread? = null
   actual companion object {
        actual fun RunOnUIThread(func: () -> Unit)
        {
            dev.topping.android.LuaThread.RunOnUIThread(func.toLuaTranslator(null))
        }
        actual fun RunOnBackground(func: () -> Unit)
        {
            dev.topping.android.LuaThread.RunOnBackground(func.toLuaTranslator(null))
        }
        actual fun New(func: () -> Unit): LuaThread {
            val pobj = LuaThread()
            val pres = dev.topping.android.LuaThread.New(func.toLuaTranslator(null))
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun Run()
   {
       luaThread?.Run()
   }
   actual fun Wait(milliseconds: Long)
   {
       luaThread?.Wait(milliseconds)
   }
   actual fun Notify()
   {
       luaThread?.Notify()
   }
   actual fun Interrupt()
   {
       luaThread?.Interrupt()
   }
    actual fun Sleep(milliseconds: Long)
    {
        luaThread?.Sleep(milliseconds)
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
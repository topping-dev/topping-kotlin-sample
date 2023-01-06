package dev.topping.kotlin

import kotlin.reflect.KCallable

actual open class LuaThread : KTInterface
{
   var luaThread: cocoapods.Topping.LuaThread? = null
   actual companion object {
        actual fun RunOnUIThread(func: KCallable<Unit>)
        {
            cocoapods.Topping.LuaThread.RunOnUIThread(func.toLuaTranslator(this))
        }
        actual fun RunOnBackground(func: KCallable<Unit>)
        {
            cocoapods.Topping.LuaThread.RunOnBackground(func.toLuaTranslator(this))
        }
        actual fun New(func: KCallable<Unit>): LuaThread {
            val pobj = LuaThread()
            val pres = cocoapods.Topping.LuaThread.New(func.toLuaTranslator(this))
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
       luaThread = par as cocoapods.Topping.LuaThread?
   }
}
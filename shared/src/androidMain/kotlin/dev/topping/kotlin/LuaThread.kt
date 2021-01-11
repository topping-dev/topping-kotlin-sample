package dev.topping.kotlin

import kotlin.reflect.KCallable

actual open class LuaThread : KTInterface
{
   var luaThread: dev.topping.android.LuaThread? = null
   actual companion object {
        actual fun RunOnUIThread(func: KCallable<Unit>?)
        {
            val kt: KTWrap<Unit> = KTWrap<Unit>()
            val lt: dev.topping.android.LuaTranslator = dev.topping.android.LuaTranslator(kt, kt.Init(this, func))
            dev.topping.android.LuaThread.RunOnUIThread(lt)
        }
        actual fun RunOnBackground(func: KCallable<Unit>?)
        {
            val kt: KTWrap<Unit> = KTWrap<Unit>()
            val lt: dev.topping.android.LuaTranslator = dev.topping.android.LuaTranslator(kt, kt.Init(this, func))
            dev.topping.android.LuaThread.RunOnBackground(lt)
        }
        actual fun New(func: KCallable<Unit>?): LuaThread?
        {
            val pobj = LuaThread()
            val kt: KTWrap<Unit> = KTWrap<Unit>()
            val lt: dev.topping.android.LuaTranslator = dev.topping.android.LuaTranslator(kt, kt.Init(this, func))
            //TODO:change this to New
            val pres = dev.topping.android.LuaThread.NewThread(lt)
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
       luaThread?.Wait(milliseconds.toInt())
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
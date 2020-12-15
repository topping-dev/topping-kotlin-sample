package dev.topping.kotlin

import kotlinx.cinterop.StableRef
import kotlinx.cinterop.staticCFunction
import kotlin.reflect.KCallable

actual open class LuaThread : KTInterface
{
   var luaThread: cocoapods.toppingios.LuaThread? = null
   actual companion object {
        actual fun RunOnUIThread(func: KCallable<Unit>?)
        {
            val kt: KTWrap<Unit> = KTWrap<Unit>()
            val lt: cocoapods.toppingios.LuaTranslator = cocoapods.toppingios.LuaTranslator()
            lt.nobj = StableRef.create(kt).asCPointer()
            lt.kFRetF = kt.Init(this, func)
            cocoapods.toppingios.LuaThread.RunOnUIThread(lt)
        }
        actual fun RunOnBackground(func: KCallable<Unit>?)
        {
            val kt: KTWrap<Unit> = KTWrap<Unit>()
            val lt: cocoapods.toppingios.LuaTranslator = cocoapods.toppingios.LuaTranslator()
            lt.nobj = StableRef.create(kt).asCPointer()
            lt.kFRetF = kt.Init(this, func)
            cocoapods.toppingios.LuaThread.RunOnBackground(lt)
        }
        actual fun New(func: KCallable<Unit>?): LuaThread?
        {
            val pobj = LuaThread()
            val kt: KTWrap<Unit> = KTWrap<Unit>()
            val lt: cocoapods.toppingios.LuaTranslator = cocoapods.toppingios.LuaTranslator()
            lt.nobj = StableRef.create(kt).asCPointer()
            lt.kFRetF = kt.Init(this, func)
            val pres = cocoapods.toppingios.LuaThread.New(lt)
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
       luaThread = par as cocoapods.toppingios.LuaThread?
   }
}
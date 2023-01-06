package dev.topping.kotlin

import kotlin.reflect.KCallable

expect open class LuaThread
{
   companion object {
        fun RunOnUIThread(func: KCallable<Unit>)
        fun RunOnBackground(func: KCallable<Unit>)
        fun New(func: KCallable<Unit>): LuaThread
   }
   fun Run()
   fun Wait(milliseconds: Long)
   fun Notify()
   fun Interrupt()
   fun Sleep(milliseconds: Long)
}
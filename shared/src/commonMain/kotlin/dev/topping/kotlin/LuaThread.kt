package dev.topping.kotlin

expect open class LuaThread
{
   companion object {
        fun RunOnUIThread(func: () -> Unit)
        fun RunOnBackground(func: () -> Unit)
        fun New(func: () -> Unit): LuaThread
   }
   fun Run()
   fun Wait(milliseconds: Long)
   fun Notify()
   fun Interrupt()
   fun Sleep(milliseconds: Long)
}
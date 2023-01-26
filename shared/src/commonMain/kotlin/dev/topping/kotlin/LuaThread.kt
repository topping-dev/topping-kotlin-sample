package dev.topping.kotlin

expect open class LuaThread
{
   companion object {
        fun runOnUIThread(func: () -> Unit)
        fun runOnBackground(func: () -> Unit)
        fun new(func: () -> Unit): LuaThread
   }
   fun start()
   fun interrupt()
   fun sleep(milliseconds: Long)
}
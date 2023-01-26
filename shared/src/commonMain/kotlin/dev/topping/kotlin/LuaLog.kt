package dev.topping.kotlin

expect open class LuaLog
{
   companion object {
        fun v(tag: String, message: String)
        fun d(tag: String, message: String)
        fun i(tag: String, message: String)
        fun w(tag: String, message: String)
        fun e(tag: String, message: String)
   }
}
package dev.topping.kotlin

expect open class LuaLog
{
   companion object {
        fun V(tag: String, message: String)
        fun D(tag: String, message: String)
        fun I(tag: String, message: String)
        fun W(tag: String, message: String)
        fun E(tag: String, message: String)
   }
}
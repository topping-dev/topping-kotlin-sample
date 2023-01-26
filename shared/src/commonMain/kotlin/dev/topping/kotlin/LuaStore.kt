package dev.topping.kotlin

expect open class LuaStore
{
   companion object {
        fun setString(key: String, value: String?)
        fun setNumber(key: String, value: Double)
        fun get(key: String): Any?
        fun getString(key: String): String?
        fun getNumber(key: String): Double?
   }
}
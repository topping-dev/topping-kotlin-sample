package dev.topping.kotlin

expect open class LuaStore
{
   companion object {
        fun SetString(key: String?, value: String?)
        fun SetNumber(key: String?, value: Double)
        fun Get(key: String?): Any?
        fun GetString(key: String?): String?
        fun GetNumber(key: String?): Double?
   }
}
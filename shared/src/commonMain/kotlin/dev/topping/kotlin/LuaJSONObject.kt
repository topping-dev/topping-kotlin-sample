package dev.topping.kotlin

expect open class LuaJSONObject
{
   companion object {
        fun createJSOFromString(str: String): LuaJSONObject?
   }
   fun getJSONObject(name: String): LuaJSONObject?
   fun getJSONArray(name: String): LuaJSONArray?
   fun getString(name: String): String?
   fun getInt(name: String): Int?
   fun getDouble(name: String): Double?
   fun getFloat(name: String): Float?
   fun getBool(name: String): Boolean?
}
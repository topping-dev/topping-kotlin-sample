package dev.topping.kotlin

expect open class LuaJSONArray
{
   fun Count(): Int
   fun GetJSONObject(index: Int): LuaJSONObject?
   fun GetJSONArray(index: Int): LuaJSONArray?
   fun GetString(index: Int): String?
   fun GetInt(index: Int): Int?
   fun GetDouble(index: Int): Double?
   fun GetFloat(index: Int): Float?
   fun GetBool(index: Int): Boolean?
}
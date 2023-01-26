package dev.topping.kotlin

expect open class LuaJSONArray
{
   fun count(): Int
   fun getJSONObject(index: Int): LuaJSONObject?
   fun getJSONArray(index: Int): LuaJSONArray?
   fun getString(index: Int): String?
   fun getInt(index: Int): Int?
   fun getDouble(index: Int): Double?
   fun getFloat(index: Int): Float?
   fun getBool(index: Int): Boolean?
}
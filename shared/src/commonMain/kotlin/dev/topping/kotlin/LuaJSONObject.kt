package dev.topping.kotlin

expect open class LuaJSONObject
{
   companion object {
        fun CreateJSOFromString(str: String): LuaJSONObject?
   }
   fun GetJSONObject(name: String): LuaJSONObject?
   fun GetJSONArray(name: String): LuaJSONArray?
   fun GetString(name: String): String?
   fun GetInt(name: String): Int?
   fun GetDouble(name: String): Double?
   fun GetFloat(name: String): Float?
   fun GetBool(name: String): Boolean?
}
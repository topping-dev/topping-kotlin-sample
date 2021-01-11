package dev.topping.kotlin

actual open class LuaJSONArray : KTInterface
{
   var luaJSONArray: cocoapods.Topping.LuaJSONArray? = null
   actual fun Count(): Int?
   {
       return luaJSONArray?.Count()
   }
   actual fun GetJSONObject(index: Int?): LuaJSONObject?
   {
       val pobj = LuaJSONObject()
       val obj = luaJSONArray?.GetJSONObject(index!!)
       pobj.SetNativeObject(obj)
       return pobj
   }
   actual fun GetJSONArray(index: Int?): LuaJSONArray?
   {
       val pobj = LuaJSONArray()
       val obj = luaJSONArray?.GetJSONArray(index!!)
       pobj.SetNativeObject(obj)
       return pobj
   }
   actual fun GetString(index: Int?): String?
   {
       return luaJSONArray?.GetString(index!!)
   }
   actual fun GetInt(index: Int?): Int?
   {
       return luaJSONArray?.GetInt(index!!)
   }
   actual fun GetDouble(index: Int?): Double?
   {
       return luaJSONArray?.GetDouble(index!!)
   }
   actual fun GetFloat(index: Int?): Float?
   {
       return luaJSONArray?.GetFloat(index!!)
   }
   actual fun GetBool(index: Int?): Boolean?
   {
       return luaJSONArray?.GetBool(index!!)
   }
    open override fun GetNativeObject(): Any?
   {
       return luaJSONArray
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaJSONArray = par as cocoapods.Topping.LuaJSONArray?
   }
}
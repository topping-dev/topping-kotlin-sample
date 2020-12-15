package dev.topping.kotlin

actual open class LuaJSONObject : KTInterface
{
   var luaJSONObject: dev.topping.android.LuaJSONObject? = null
   actual companion object {
        actual fun CreateJSOFromString(str: String?): LuaJSONObject?
        {
            val pobj = LuaJSONObject()
            val pres = dev.topping.android.LuaJSONObject.CreateJSOFromString(str)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun GetJSONObject(name: String?): LuaJSONObject?
   {
       val pobj = LuaJSONObject()
       val obj = luaJSONObject?.GetJSONObject(name)
       pobj.SetNativeObject(obj)
       return pobj
   }
   actual fun GetJSONArray(name: String?): LuaJSONArray?
   {
       val pobj = LuaJSONArray()
       val obj = luaJSONObject?.GetJSONArray(name)
       pobj.SetNativeObject(obj)
       return pobj
   }
   actual fun GetString(name: String?): String?
   {
       return luaJSONObject?.GetString(name)
   }
   actual fun GetInt(name: String?): Int?
   {
       return luaJSONObject?.GetInt(name)
   }
   actual fun GetDouble(name: String?): Double?
   {
       return luaJSONObject?.GetDouble(name)
   }
   actual fun GetFloat(name: String?): Float?
   {
       return luaJSONObject?.GetFloat(name)
   }
   actual fun GetBool(name: String?): Boolean?
   {
       return luaJSONObject?.GetBool(name)
   }
    open override fun GetNativeObject(): Any?
   {
       return luaJSONObject
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaJSONObject = par as dev.topping.android.LuaJSONObject?
   }
}
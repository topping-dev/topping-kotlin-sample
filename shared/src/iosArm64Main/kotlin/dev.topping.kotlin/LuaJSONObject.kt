package dev.topping.kotlin

actual open class LuaJSONObject : KTInterface
{
   var luaJSONObject: cocoapods.Topping.LuaJSONObject? = null
   actual companion object {
        actual fun createJSOFromString(str: String): LuaJSONObject?
        {
            val pobj = LuaJSONObject()
            val pres = cocoapods.Topping.LuaJSONObject.createJSOFromString(str)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun getJSONObject(name: String): LuaJSONObject?
   {
       val pobj = LuaJSONObject()
       val obj = luaJSONObject?.getJSONObject(name)
       pobj.SetNativeObject(obj)
       return pobj
   }
   actual fun getJSONArray(name: String): LuaJSONArray?
   {
       val pobj = LuaJSONArray()
       val obj = luaJSONObject?.getJSONArray(name)
       pobj.SetNativeObject(obj)
       return pobj
   }
   actual fun getString(name: String): String?
   {
       return luaJSONObject?.getString(name)
   }
   actual fun getInt(name: String): Int?
   {
       return luaJSONObject?.getInt(name)
   }
   actual fun getDouble(name: String): Double?
   {
       return luaJSONObject?.getDouble(name)
   }
   actual fun getFloat(name: String): Float?
   {
       return luaJSONObject?.getFloat(name)
   }
   actual fun getBool(name: String): Boolean?
   {
       return luaJSONObject?.getBool(name)
   }
    open override fun GetNativeObject(): Any?
   {
       return luaJSONObject
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaJSONObject = par as cocoapods.Topping.LuaJSONObject?
   }
}
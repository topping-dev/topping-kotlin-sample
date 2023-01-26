package dev.topping.kotlin

actual open class LuaJSONArray : KTInterface
{
   var luaJSONArray: cocoapods.Topping.LuaJSONArray? = null
   actual fun count(): Int {
       return luaJSONArray?.count()!!
   }
   actual fun getJSONObject(index: Int): LuaJSONObject?
   {
       val pobj = LuaJSONObject()
       val obj = luaJSONArray?.getJSONObject(index)
       pobj.SetNativeObject(obj)
       return pobj
   }
   actual fun getJSONArray(index: Int): LuaJSONArray?
   {
       val pobj = LuaJSONArray()
       val obj = luaJSONArray?.getJSONArray(index)
       pobj.SetNativeObject(obj)
       return pobj
   }
   actual fun getString(index: Int): String?
   {
       return luaJSONArray?.getString(index)
   }
   actual fun getInt(index: Int): Int?
   {
       return luaJSONArray?.getInt(index)
   }
   actual fun getDouble(index: Int): Double?
   {
       return luaJSONArray?.getDouble(index)
   }
   actual fun getFloat(index: Int): Float?
   {
       return luaJSONArray?.getFloat(index)
   }
   actual fun getBool(index: Int): Boolean?
   {
       return luaJSONArray?.getBool(index)
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
package dev.topping.kotlin

actual open class LuaStore : KTInterface
{
   var luaStore: cocoapods.Topping.LuaStore? = null
   actual companion object {
        actual fun setString(key: String, value: String?)
        {
            cocoapods.Topping.LuaStore.setString(key, value)
        }
        actual fun setNumber(key: String, value: Double)
        {
            cocoapods.Topping.LuaStore.setNumber(key, value)
        }
        actual fun get(key: String): Any?
        {
            val pobj = LuaStore()
            val pres = cocoapods.Topping.LuaStore.get(key)
            pobj.SetNativeObject(pres as cocoapods.Topping.LuaStore)
            return pobj
        }
        actual fun getString(key: String): String?
        {
            return cocoapods.Topping.LuaStore.getString(key)
        }
        actual fun getNumber(key: String): Double?
        {
            return cocoapods.Topping.LuaStore.getNumber(key)
        }
   }
    open override fun GetNativeObject(): Any?
   {
       return luaStore
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaStore = par as cocoapods.Topping.LuaStore?
   }
}
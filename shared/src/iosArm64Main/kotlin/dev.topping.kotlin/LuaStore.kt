package dev.topping.kotlin

actual open class LuaStore : KTInterface
{
   var luaStore: cocoapods.Topping.LuaStore? = null
   actual companion object {
        actual fun SetString(key: String?, value: String?)
        {
            cocoapods.Topping.LuaStore.SetString(key, value)
        }
        actual fun SetNumber(key: String?, value: Double)
        {
            cocoapods.Topping.LuaStore.SetNumber(key, value)
        }
        actual fun Get(key: String?): Any?
        {
            val pobj = LuaStore()
            val pres = cocoapods.Topping.LuaStore.Get(key)
            pobj.SetNativeObject(pres as cocoapods.Topping.LuaStore)
            return pobj
        }
        actual fun GetString(key: String?): String?
        {
            return cocoapods.Topping.LuaStore.GetString(key)
        }
        actual fun GetNumber(key: String?): Double?
        {
            return cocoapods.Topping.LuaStore.GetNumber(key)
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
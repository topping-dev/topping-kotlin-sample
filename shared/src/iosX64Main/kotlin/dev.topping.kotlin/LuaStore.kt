package dev.topping.kotlin

actual open class LuaStore : KTInterface
{
   var luaStore: cocoapods.toppingios.LuaStore? = null
   actual companion object {
        actual fun SetString(key: String?, value: String?)
        {
            cocoapods.toppingios.LuaStore.SetString(key, value)
        }
        actual fun SetNumber(key: String?, value: Double)
        {
            cocoapods.toppingios.LuaStore.SetNumber(key, value)
        }
        actual fun Get(key: String?): Any?
        {
            val pobj = LuaStore()
            val pres = cocoapods.toppingios.LuaStore.Get(key)
            pobj.SetNativeObject(pres as cocoapods.toppingios.LuaStore)
            return pobj
        }
        actual fun GetString(key: String?): String?
        {
            return cocoapods.toppingios.LuaStore.GetString(key)
        }
        actual fun GetNumber(key: String?): Double?
        {
            return cocoapods.toppingios.LuaStore.GetNumber(key)
        }
   }
    open override fun GetNativeObject(): Any?
   {
       return luaStore
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaStore = par as cocoapods.toppingios.LuaStore?
   }
}
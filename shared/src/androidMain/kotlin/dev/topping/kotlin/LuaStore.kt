package dev.topping.kotlin

actual open class LuaStore : KTInterface
{
   var luaStore: dev.topping.android.LuaStore? = null
   actual companion object {
        actual fun SetString(key: String?, value: String?)
        {
            dev.topping.android.LuaStore.SetString(key, value)
        }
        actual fun SetNumber(key: String?, value: Double)
        {
            dev.topping.android.LuaStore.SetNumber(key, value)
        }
        actual fun Get(key: String?): Any?
        {
            val pobj = LuaStore()
            val pres = dev.topping.android.LuaStore.Get(key)
            pobj.SetNativeObject(pres as dev.topping.android.LuaStore)
            return pobj
        }
        actual fun GetString(key: String?): String?
        {
            return dev.topping.android.LuaStore.GetString(key)
        }
        actual fun GetNumber(key: String?): Double?
        {
            return dev.topping.android.LuaStore.GetNumber(key)
        }
   }
    open override fun GetNativeObject(): Any?
   {
       return luaStore
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaStore = par as dev.topping.android.LuaStore?
   }
}
package dev.topping.kotlin

actual open class LuaStore : KTInterface
{
   var luaStore: dev.topping.android.LuaStore? = null
   actual companion object {
        actual fun setString(key: String, value: String?)
        {
            dev.topping.android.LuaStore.setString(key, value)
        }
        actual fun setNumber(key: String, value: Double)
        {
            dev.topping.android.LuaStore.setNumber(key, value)
        }
        actual fun get(key: String): Any?
        {
            val pobj = LuaStore()
            val pres = dev.topping.android.LuaStore.get(key)
            pobj.SetNativeObject(pres as dev.topping.android.LuaStore)
            return pobj
        }
        actual fun getString(key: String): String?
        {
            return dev.topping.android.LuaStore.getString(key)
        }
        actual fun getNumber(key: String): Double?
        {
            return dev.topping.android.LuaStore.getNumber(key)
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
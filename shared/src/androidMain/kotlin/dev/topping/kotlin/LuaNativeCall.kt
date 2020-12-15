package dev.topping.kotlin

actual open class LuaNativeCall : KTInterface
{
   var luaNativeCall: dev.topping.android.LuaNativeCall? = null
   actual companion object {
        actual fun Call(self: Any?, func: String?, params: HashMap<Int?, Any?>?): LuaObjectStore?
        {
            val pobj = LuaObjectStore()
            val pres = dev.topping.android.LuaNativeCall.Call(self, func, params)
            pobj.SetNativeObject(pres as dev.topping.android.LuaObjectStore)
            return pobj
        }
   }
    open override fun GetNativeObject(): Any?
   {
       return luaNativeCall
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaNativeCall = par as dev.topping.android.LuaNativeCall?
   }
}
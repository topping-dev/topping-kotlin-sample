package dev.topping.kotlin

actual open class LuaNativeCall : KTInterface
{
   var luaNativeCall: dev.topping.android.LuaNativeCall? = null
   actual companion object {
       actual fun Call(obj: LuaNativeObject, func: String, params: ArrayList<Any?>): LuaObjectStore?
       {
           val pobj = LuaObjectStore()
           val pres = dev.topping.android.LuaNativeCall.Call(obj, func, params)
           pobj.SetNativeObject(pres)
           return pobj;
       }

       actual fun CallClass(cls: String, func: String, params: ArrayList<Any?>): LuaObjectStore?
       {
           val pobj = LuaObjectStore()
           val pres = dev.topping.android.LuaNativeCall.CallClass(cls, func, params)
           pobj.SetNativeObject(pres)
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
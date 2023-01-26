package dev.topping.kotlin

actual open class LuaNativeCall : KTInterface
{
   var luaNativeCall: cocoapods.Topping.LuaNativeCall? = null
   actual companion object {
        actual fun call(obj: LuaNativeObject, func: String, params: ArrayList<Any?>): LuaObjectStore?
        {
            val pobj = LuaObjectStore()
            val pres = cocoapods.Topping.LuaNativeCall.call(obj.luaNativeObject!!, func, params)
            pobj.SetNativeObject(pres)
            return pobj
        }

        actual fun callClass(cls: String, func: String, params: ArrayList<Any?>): LuaObjectStore?
        {
           val pobj = LuaObjectStore()
           val pres = cocoapods.Topping.LuaNativeCall.callClass(cls, func, params)
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
       luaNativeCall = par as cocoapods.Topping.LuaNativeCall?
   }
}
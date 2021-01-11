package dev.topping.kotlin

actual open class LuaNativeCall : KTInterface
{
   //var luaNativeCall: cocoapods.Topping.LuaNativeCall? = null
   actual companion object {
        actual fun Call(self: Any?, func: String?, params: HashMap<Int?, Any?>?): LuaObjectStore?
        {
            /*val pobj = LuaObjectStore()
            val pres = cocoapods.Topping.LuaNativeCall.Call(self, func, params)
            pobj.SetNativeObject(pres as cocoapods.Topping.LuaObjectStore)
            return pobj*/
            return null
        }
   }
    open override fun GetNativeObject(): Any?
   {
       //return luaNativeCall
       return null
   }
    open override fun SetNativeObject(par :Any?)
   {
       //luaNativeCall = par as LuaNativeCall?
   }
}
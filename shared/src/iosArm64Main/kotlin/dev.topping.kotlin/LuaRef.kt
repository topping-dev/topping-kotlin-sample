package dev.topping.kotlin

actual open class LuaRef : KTInterface
{
   var luaRef: cocoapods.Topping.LuaRef? = null
   actual companion object {
       actual fun WithValue(key: String, obj: Any): LuaRef
       {
           val pobj = LuaRef()
           val pres = cocoapods.Topping.LuaRef()
           pres.idRef = key
           pobj.SetNativeObject(pres)
           return pobj
       }
        actual fun GetRef(ctx: LuaContext?, id: String?): LuaRef?
        {
            val pobj = LuaRef()
            val pres = cocoapods.Topping.LuaRef.GetRef(ctx?.luaContext!!, id!!)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
    open override fun GetNativeObject(): Any?
   {
       return luaRef
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaRef = par as cocoapods.Topping.LuaRef?
   }
}
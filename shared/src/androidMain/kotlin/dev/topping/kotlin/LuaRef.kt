package dev.topping.kotlin

actual open class LuaRef : KTInterface
{
   var luaRef: dev.topping.android.luagui.LuaRef? = null
   actual companion object {
        actual fun GetRef(ctx: LuaContext?, id: String?): LuaRef?
        {
            val pobj = LuaRef()
            val pres = dev.topping.android.luagui.LuaRef.GetRef(ctx?.luaContext, id)
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
       luaRef = par as dev.topping.android.luagui.LuaRef?
   }
}
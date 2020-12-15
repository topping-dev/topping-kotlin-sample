package dev.topping.kotlin

actual open class LuaContext : KTInterface
{
   var luaContext: cocoapods.toppingios.LuaContext? = null
   actual companion object {
        actual fun CreateLuaContext(context: Any?): LuaContext?
        {
            val pobj = LuaContext()
            val pres = cocoapods.toppingios.LuaContext()
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
    open override fun GetNativeObject(): Any?
   {
       return luaContext
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaContext = par as cocoapods.toppingios.LuaContext?
   }
}
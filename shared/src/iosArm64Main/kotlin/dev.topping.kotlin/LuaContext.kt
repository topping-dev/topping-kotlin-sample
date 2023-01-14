package dev.topping.kotlin

actual open class LuaContext : KTInterface
{
   var luaContext: cocoapods.Topping.LuaContext? = null
   actual companion object {
        actual fun CreateLuaContext(context: Any): LuaContext {
            val pobj = LuaContext()
            val pres = cocoapods.Topping.LuaContext()
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
    actual fun GetForm(): LuaForm {
        return KTWrap.Wrap(luaContext?.GetForm()) as LuaForm
    }
    open override fun GetNativeObject(): Any?
   {
       return luaContext
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaContext = par as cocoapods.Topping.LuaContext?
   }
}
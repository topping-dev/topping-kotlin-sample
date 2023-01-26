package dev.topping.kotlin

actual open class LuaContext : KTInterface
{
   var luaContext: cocoapods.Topping.LuaContext? = null
   actual companion object {
        actual fun createLuaContext(context: Any): LuaContext {
            val pobj = LuaContext()
            val pres = cocoapods.Topping.LuaContext()
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
    actual fun getForm(): LuaForm {
        return KTWrap.Wrap(luaContext?.getForm()) as LuaForm
    }
    actual fun startForm(luaFormIntent: LuaFormIntent) {
        luaContext?.startForm(luaFormIntent?.luaFormIntent)
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
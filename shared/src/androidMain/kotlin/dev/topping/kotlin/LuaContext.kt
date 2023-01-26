package dev.topping.kotlin

import android.content.Context

actual open class LuaContext : KTInterface
{
   var luaContext: dev.topping.android.luagui.LuaContext? = null
   actual companion object {
        actual fun createLuaContext(context: Any): LuaContext {
            val pobj = LuaContext()
            val pres = dev.topping.android.luagui.LuaContext.createLuaContext(context as Context)
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
       luaContext = par as dev.topping.android.luagui.LuaContext?
   }
}
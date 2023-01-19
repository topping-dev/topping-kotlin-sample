package dev.topping.kotlin

import android.content.Context

actual open class LuaContext : KTInterface
{
   var luaContext: dev.topping.android.luagui.LuaContext? = null
   actual companion object {
        actual fun CreateLuaContext(context: Any): LuaContext {
            val pobj = LuaContext()
            val pres = dev.topping.android.luagui.LuaContext.CreateLuaContext(context as Context)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
    actual fun GetForm(): LuaForm {
        return KTWrap.Wrap(luaContext?.GetForm()) as LuaForm
    }
    actual fun StartForm(luaFormIntent: LuaFormIntent) {
        luaContext?.StartForm(luaFormIntent?.luaFormIntent)
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
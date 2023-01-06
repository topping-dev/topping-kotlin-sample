package dev.topping.kotlin

import kotlin.reflect.KCallable

actual open class LGButton : LGTextView()
{
   var lgButton: cocoapods.Topping.LGButton? = null
   actual companion object {
        actual fun Create(lc: LuaContext): LGButton {
            val pobj = LGButton()
            val pres = cocoapods.Topping.LGButton.Create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }

    override fun SetOnClickListenerInternal(func: KCallable<Unit>?): Boolean
    {
        lgButton?.SetOnClickListener(func.toLuaTranslator(this))
        return true
    }

    open override fun GetNativeObject(): Any?
   {
       return lgButton
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgButton = par as cocoapods.Topping.LGButton?
   }
}
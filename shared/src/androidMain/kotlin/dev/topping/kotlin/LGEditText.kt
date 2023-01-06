package dev.topping.kotlin

import kotlin.reflect.KCallable

actual open class LGEditText : LGTextView()
{
   var lgEditText: android.widget.LGEditText? = null
   actual companion object {
        actual fun Create(lc: LuaContext): LGEditText {
            val pobj = LGEditText()
            val pres = android.widget.LGEditText.Create(lc?.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
    actual fun SetTextChangedListener(func: KCallable<Unit>?)
    {
        lgEditText?.SetTextChangedListener(func.toLuaTranslator(this))
    }
    actual fun SetBeforeTextChangedListener(func: KCallable<Unit>?)
    {
        lgEditText?.SetBeforeTextChangedListener(func.toLuaTranslator(this))
    }
    actual fun SetAfterTextChangedListener(func: KCallable<Unit>?)
    {
        lgEditText?.SetAfterTextChangedListener(func.toLuaTranslator(this))
    }
    open override fun GetNativeObject(): Any?
   {
       return lgEditText
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgEditText = par as android.widget.LGEditText?
   }
}
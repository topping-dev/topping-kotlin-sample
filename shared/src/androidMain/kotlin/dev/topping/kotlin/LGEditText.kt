package dev.topping.kotlin

actual open class LGEditText : LGTextView()
{
   var lgEditText: android.widget.LGEditText? = null
   actual companion object {
        actual fun Create(lc: LuaContext): LGEditText {
            val pobj = LGEditText()
            val pres = android.widget.LGEditText.Create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
    actual fun SetTextChangedListener(func: ((LGEditText, String) -> Unit)?)
    {
        lgEditText?.SetTextChangedListener(func.toLuaTranslator(this))
    }
    actual fun SetBeforeTextChangedListener(func: ((LGEditText, String) -> Unit)?)
    {
        lgEditText?.SetBeforeTextChangedListener(func.toLuaTranslator(this))
    }
    actual fun SetAfterTextChangedListener(func: ((LGEditText, String) -> Unit)?)
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
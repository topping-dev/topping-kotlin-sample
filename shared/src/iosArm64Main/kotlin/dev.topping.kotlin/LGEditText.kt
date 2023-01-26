package dev.topping.kotlin

actual open class LGEditText : LGTextView()
{
   var lgEditText: cocoapods.Topping.LGEditText? = null
   actual companion object {
        actual fun create(lc: LuaContext): LGEditText {
            val pobj = LGEditText()
            val pres = cocoapods.Topping.LGEditText.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
    actual fun setTextChangedListener(func: ((LGEditText, String) -> Unit)?)
    {
        lgEditText?.setTextChangedListener(func.toLuaTranslator(this))
    }
    actual fun setBeforeTextChangedListener(func: ((LGEditText, String) -> Unit)?)
    {
        lgEditText?.setBeforeTextChangedListener(func.toLuaTranslator(this))
    }
    actual fun setAfterTextChangedListener(func: ((LGEditText, String) -> Unit)?)
    {
        lgEditText?.setAfterTextChangedListener(func.toLuaTranslator(this))
    }
    open override fun GetNativeObject(): Any?
   {
       return lgEditText
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgEditText = par as cocoapods.Topping.LGEditText?
   }
}
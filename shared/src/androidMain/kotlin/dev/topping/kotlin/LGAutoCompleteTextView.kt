package dev.topping.kotlin

actual open class LGAutoCompleteTextView : LGEditText()
{
   var lgAutoCompleteTextView: android.widget.LGAutoCompleteTextView? = null
   actual companion object {
        actual fun create(lc: LuaContext): LGAutoCompleteTextView {
            val pobj = LGAutoCompleteTextView()
            val pres = android.widget.LGAutoCompleteTextView.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
    open override fun GetNativeObject(): Any?
   {
       return lgAutoCompleteTextView
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgAutoCompleteTextView = par as android.widget.LGAutoCompleteTextView?
   }
}
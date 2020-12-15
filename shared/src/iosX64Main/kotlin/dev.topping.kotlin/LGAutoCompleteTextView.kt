package dev.topping.kotlin

actual open class LGAutoCompleteTextView : LGEditText()
{
   var lgAutoCompleteTextView: cocoapods.toppingios.LGAutoCompleteTextView? = null
   actual companion object {
        actual fun Create(lc: LuaContext?): LGAutoCompleteTextView?
        {
            val pobj = LGAutoCompleteTextView()
            val pres = cocoapods.toppingios.LGAutoCompleteTextView.Create(lc?.luaContext)
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
       lgAutoCompleteTextView = par as cocoapods.toppingios.LGAutoCompleteTextView?
   }
}
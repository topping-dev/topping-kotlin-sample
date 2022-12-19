package dev.topping.kotlin

actual open class LGTextView : LGView()
{
   var lgTextView: cocoapods.Topping.LGTextView? = null
   actual companion object {
        actual fun Create(lc: LuaContext?): LGTextView?
        {
            val pobj = LGTextView()
            val pres = cocoapods.Topping.LGTextView.Create(lc?.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun SetText(v: LuaRef?)
   {
       lgTextView?.SetText(v?.luaRef)
   }
   actual fun SetTextInternal(str: String?)
   {
       lgTextView?.SetTextInternal(str)
   }
   actual fun GetText(): String?
   {
       return lgTextView?.GetText()
   }
    actual fun SetTextColor(ref: LuaRef?)
    {
        lgTextView?.SetTextColorRef(ref?.luaRef)
    }

    open override fun GetNativeObject(): Any?
   {
       return lgTextView
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgTextView = par as cocoapods.Topping.LGTextView?
   }
}
package dev.topping.kotlin

actual open class LGTextView : LGView()
{
   var lgTextView: cocoapods.Topping.LGTextView? = null
   actual companion object {
        actual fun create(lc: LuaContext): LGTextView {
            val pobj = LGTextView()
            val pres = cocoapods.Topping.LGTextView.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun setText(v: LuaRef?)
   {
       lgTextView?.setText(v?.luaRef)
   }
   actual fun setTextInternal(str: String?)
   {
       lgTextView?.setTextInternal(str)
   }
   actual fun getText(): String?
   {
       return lgTextView?.getText()
   }
    actual fun setTextColor(ref: LuaRef?)
    {
        lgTextView?.setTextColorRef(ref?.luaRef)
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
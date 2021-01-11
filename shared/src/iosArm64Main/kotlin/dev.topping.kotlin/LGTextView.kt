package dev.topping.kotlin

import kotlin.reflect.KCallable

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
   actual fun SetText(v: String?)
   {
       lgTextView?.SetText(v)
   }
   actual fun SetTextRef(ref: LuaRef?)
   {
       lgTextView?.SetTextRef(ref?.luaRef)
   }
   actual fun GetText(): String?
   {
       return lgTextView?.GetText()
   }
   actual fun SetTextColor(color: String?)
   {
       lgTextView?.SetTextColor(color)
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
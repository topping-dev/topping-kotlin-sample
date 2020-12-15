package dev.topping.kotlin

actual open class LGToolbar : LGView()
{
   var lgToolbar: android.widget.LGToolbar? = null
    open override fun GetNativeObject(): Any?
   {
       return lgToolbar
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgToolbar = par as android.widget.LGToolbar?
   }
}
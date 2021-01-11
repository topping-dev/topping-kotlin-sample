package dev.topping.kotlin

actual open class LGToolbar : LGView()
{
   var lgToolbar: cocoapods.Topping.LGToolbar? = null
    open override fun GetNativeObject(): Any?
   {
       return lgToolbar
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgToolbar = par as cocoapods.Topping.LGToolbar?
   }
}
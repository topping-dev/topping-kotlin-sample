package dev.topping.kotlin

actual open class LGFragmentContainerView : LGFrameLayout()
{
   var lgFragmentContainerView: cocoapods.Topping.LGFragmentContainerView? = null

    open override fun GetNativeObject(): Any?
   {
       return lgFragmentContainerView
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
   }
}
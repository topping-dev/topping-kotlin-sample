package dev.topping.kotlin

actual open class LGFragmentContainerView : LGFrameLayout()
{
   var lgFragmentContainerView: android.widget.LGFragmentContainerView? = null

    open override fun GetNativeObject(): Any?
   {
       return lgFragmentContainerView
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgFragmentContainerView = par as android.widget.LGFragmentContainerView?
   }
}
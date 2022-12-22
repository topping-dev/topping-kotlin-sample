package dev.topping.kotlin

actual open class LGFragmentContainerView : LGFrameLayout()
{
   var lgFragmentContainerView: androidx.fragment.app.LGFragmentContainerView? = null

    open override fun GetNativeObject(): Any?
   {
       return lgFragmentContainerView
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgFragmentContainerView = par as androidx.fragment.app.LGFragmentContainerView?
   }
}
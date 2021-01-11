package dev.topping.kotlin

open class LGListViewFragment : KTInterface
{
   var lgListViewFragment: android.widget.LGListViewFragment? = null
    open override fun GetNativeObject(): Any?
   {
       return lgListViewFragment
   }
    open override fun SetNativeObject(par :Any?)
   {
       lgListViewFragment = par as android.widget.LGListViewFragment?
   }
}
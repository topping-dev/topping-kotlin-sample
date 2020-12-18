package dev.topping.kotlin

actual open class LGRecyclerView : LGView()
{
   var lgRecyclerView: cocoapods.Topping.LGRecyclerView? = null
   actual fun GetAdapter(): LGRecyclerViewAdapter?
   {
       val pobj = LGRecyclerViewAdapter()
       val obj = lgRecyclerView?.GetAdapter()
       pobj.SetNativeObject(obj)
       return pobj
   }
   actual fun SetAdapter(adapter: LGRecyclerViewAdapter?)
   {
       lgRecyclerView?.SetAdapter(adapter?.lgRecyclerViewAdapter)
   }
    open override fun GetNativeObject(): Any?
   {
       return lgRecyclerView
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgRecyclerView = par as cocoapods.Topping.LGRecyclerView?
   }
}
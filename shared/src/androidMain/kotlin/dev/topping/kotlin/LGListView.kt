package dev.topping.kotlin

actual open class LGListView : LGAbsListView()
{
   var lgListView: android.widget.LGListView? = null
   actual companion object {
        actual fun Create(lc: LuaContext): LGAbsListView {
            val pobj = LGListView()
            val pres = android.widget.LGListView.Create(lc?.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun GetAdapter(): LGAdapterView?
   {
       val pobj = LGAdapterView()
       val obj = lgListView?.GetAdapter()
       pobj.SetNativeObject(obj)
       return pobj
   }
   actual fun SetAdapter(adapter: LGAdapterView?)
   {
       lgListView?.SetAdapter(adapter?.lgAdapterView)
   }
    open override fun GetNativeObject(): Any?
   {
       return lgListView
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgListView = par as android.widget.LGListView?
   }
}
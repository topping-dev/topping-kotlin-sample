package dev.topping.kotlin

actual open class LGListView : LGAbsListView()
{
   var lgListView: cocoapods.Topping.LGListView? = null
   actual companion object {
        actual fun create(lc: LuaContext): LGAbsListView {
            val pobj = LGListView()
            val pres = cocoapods.Topping.LGListView.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun getAdapter(): LGAdapterView?
   {
       val pobj = LGAdapterView()
       val obj = lgListView?.getAdapter()
       pobj.SetNativeObject(obj)
       return pobj
   }
   actual fun setAdapter(adapter: LGAdapterView?)
   {
       lgListView?.setAdapter(adapter?.lgAdapterView)
   }
    open override fun GetNativeObject(): Any?
   {
       return lgListView
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgListView = par as cocoapods.Topping.LGListView?
   }
}
package dev.topping.kotlin

actual open class LGRecyclerView : LGView()
{
   var lgRecyclerView: android.widget.LGRecyclerView? = null
   actual fun getAdapter(): LGRecyclerViewAdapter?
   {
       val pobj = LGRecyclerViewAdapter()
       val obj = lgRecyclerView?.getAdapter()
       pobj.SetNativeObject(obj)
       return pobj
   }
   actual fun setAdapter(adapter: LGRecyclerViewAdapter?)
   {
       lgRecyclerView?.setAdapter(adapter?.lgRecyclerViewAdapter)
   }
    actual fun setAdapter(ltInit: LuaTranslator)
    {
        lgRecyclerView?.setAdapter(ltInit.luaTranslator)
    }
    open override fun GetNativeObject(): Any?
   {
       return lgRecyclerView
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgRecyclerView = par as android.widget.LGRecyclerView?
   }
}
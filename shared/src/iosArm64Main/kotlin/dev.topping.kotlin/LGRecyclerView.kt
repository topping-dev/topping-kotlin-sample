package dev.topping.kotlin

actual open class LGRecyclerView : LGView()
{
   var lgRecyclerView: cocoapods.Topping.LGRecyclerView? = null
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
        lgRecyclerView?.setAdapterInterface(ltInit.luaTranslator)
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
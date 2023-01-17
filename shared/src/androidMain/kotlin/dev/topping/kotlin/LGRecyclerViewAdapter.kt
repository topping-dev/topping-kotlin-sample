package dev.topping.kotlin

actual open class LGRecyclerViewAdapter : KTInterface
{
   var lgRecyclerViewAdapter: android.widget.LGRecyclerViewAdapter? = null
   actual companion object {
        actual fun Create(lc: LuaContext, id: String): LGRecyclerViewAdapter {
            val pobj = LGRecyclerViewAdapter()
            val pres = android.widget.LGRecyclerViewAdapter.Create(lc.luaContext, id)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun AddValue(value: Any)
   {
       lgRecyclerViewAdapter?.AddValue(value)
   }
   actual fun RemoveValue(value: Any)
   {
       lgRecyclerViewAdapter?.RemoveValue(value)
   }
   actual fun Clear()
   {
       lgRecyclerViewAdapter?.Clear()
   }
   actual fun Notify()
   {
       lgRecyclerViewAdapter?.Notify()
   }
   actual fun SetOnItemSelected(func: ((LGRecyclerViewAdapter, LGView, LGView, Int, Any) -> Unit)?)
   {
       lgRecyclerViewAdapter?.SetOnItemSelected(func.toLuaTranslator(this))
   }
   actual fun SetOnCreateViewHolder(func: ((LGRecyclerViewAdapter, LGView, Int, LuaContext) -> LGView)?)
   {
       lgRecyclerViewAdapter?.SetOnCreateViewHolder(func.toLuaTranslator(this))
   }
   actual fun SetOnBindViewHolder(func: ((LGRecyclerViewAdapter, LGView, Int, Any) -> Unit)?)
   {
       lgRecyclerViewAdapter?.SetOnBindViewHolder(func.toLuaTranslator(this))
   }
   actual fun SetGetItemViewType(func: ((LGRecyclerViewAdapter, Int) -> Int)?)
   {
       lgRecyclerViewAdapter?.SetGetItemViewType(func.toLuaTranslator(this))
   }
    open override fun GetNativeObject(): Any?
   {
       return lgRecyclerViewAdapter
   }
    open override fun SetNativeObject(par :Any?)
   {
       lgRecyclerViewAdapter = par as android.widget.LGRecyclerViewAdapter?
   }
}
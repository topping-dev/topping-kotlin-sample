package dev.topping.kotlin

expect open class LGRecyclerViewAdapter
{
   companion object {
        fun create(lc: LuaContext, id: String): LGRecyclerViewAdapter
   }
   fun addValue(value: Any)
   fun removeValue(value: Any)
   fun clear()
   fun notifyData()
   fun setOnItemSelected(func: ((LGRecyclerViewAdapter, LGView, LGView, Int, Any) -> Unit)?)
   fun setOnCreateViewHolder(func: ((LGRecyclerViewAdapter, LGView, Int, LuaContext) -> LGView)?)
   fun setOnBindViewHolder(func: ((LGRecyclerViewAdapter, LGView, Int, Any) -> Unit)?)
   fun setGetItemViewType(func: ((LGRecyclerViewAdapter, Int) -> Int)?)
}
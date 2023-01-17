package dev.topping.kotlin

expect open class LGRecyclerViewAdapter
{
   companion object {
        fun Create(lc: LuaContext, id: String): LGRecyclerViewAdapter
   }
   fun AddValue(value: Any)
   fun RemoveValue(value: Any)
   fun Clear()
   fun Notify()
   fun SetOnItemSelected(func: ((LGRecyclerViewAdapter, LGView, LGView, Int, Any) -> Unit)?)
   fun SetOnCreateViewHolder(func: ((LGRecyclerViewAdapter, LGView, Int, LuaContext) -> LGView)?)
   fun SetOnBindViewHolder(func: ((LGRecyclerViewAdapter, LGView, Int, Any) -> Unit)?)
   fun SetGetItemViewType(func: ((LGRecyclerViewAdapter, Int) -> Int)?)
}
package dev.topping.kotlin

expect open class ILGRecyclerViewAdapter(adapter: Any) {
    open fun onCreateViewHolder(parent: LGView, viewType: Int, context: LuaContext)
    open fun onBindViewHolder(view: LGView, position: Int)
    open fun getItemViewType(position: Int) : Int
    open fun getItemCount() : Int
    fun getAdapter(): LGRecyclerViewAdapter
}
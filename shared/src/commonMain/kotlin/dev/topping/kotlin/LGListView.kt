package dev.topping.kotlin

expect open class LGListView : LGAbsListView
{
   companion object {
        fun create(lc: LuaContext): LGAbsListView
   }
   fun getAdapter(): LGAdapterView?
   fun setAdapter(adapter: LGAdapterView?)
}
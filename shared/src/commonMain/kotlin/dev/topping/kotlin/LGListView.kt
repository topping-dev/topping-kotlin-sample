package dev.topping.kotlin

expect open class LGListView : LGAbsListView
{
   companion object {
        fun Create(lc: LuaContext?): LGAbsListView?
   }
   fun GetAdapter(): LGAdapterView?
   fun SetAdapter(adapter: LGAdapterView?)
}
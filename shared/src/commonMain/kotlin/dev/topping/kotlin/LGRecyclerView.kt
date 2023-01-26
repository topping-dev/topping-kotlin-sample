package dev.topping.kotlin

expect open class LGRecyclerView : LGView
{
   fun getAdapter(): LGRecyclerViewAdapter?
   fun setAdapter(adapter: LGRecyclerViewAdapter?)
   fun setAdapter(ltInit: LuaTranslator)
}
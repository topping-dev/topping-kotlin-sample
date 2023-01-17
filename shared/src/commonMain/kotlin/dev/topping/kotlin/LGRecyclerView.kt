package dev.topping.kotlin

expect open class LGRecyclerView : LGView
{
   fun GetAdapter(): LGRecyclerViewAdapter?
   fun SetAdapter(adapter: LGRecyclerViewAdapter?)
   fun SetAdapter(ltInit: LuaTranslator)
}
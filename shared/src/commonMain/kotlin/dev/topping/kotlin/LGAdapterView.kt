package dev.topping.kotlin

expect open class LGAdapterView
{
   companion object {
        fun create(lc: LuaContext, id: String): LGAdapterView
   }
   fun addSection(header: String, id: String): LGAdapterView
   fun removeSection(header: String)
   fun addValue(value: Any)
   fun removeValue(value: Any)
   fun clear()
   fun setOnAdapterView(func: (LGAdapterView, LGView, Int, Any, LGView, LuaContext) -> LGView)
}
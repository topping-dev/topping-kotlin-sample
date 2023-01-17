package dev.topping.kotlin

expect open class LGAdapterView
{
   companion object {
        fun Create(lc: LuaContext, id: String): LGAdapterView
   }
   fun AddSection(header: String, id: String): LGAdapterView
   fun RemoveSection(header: String)
   fun AddValue(value: Any)
   fun RemoveValue(value: Any)
   fun Clear()
   fun SetOnAdapterView(func: (LGAdapterView, LGView, Int, Any, LGView, LuaContext) -> LGView)
}
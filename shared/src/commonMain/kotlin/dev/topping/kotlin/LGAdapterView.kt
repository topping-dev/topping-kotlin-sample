package dev.topping.kotlin

import kotlin.reflect.KCallable

expect open class LGAdapterView
{
   companion object {
        fun Create(lc: LuaContext?, id: String?): LGAdapterView?
   }
   fun AddSection(header: String?, id: String?): LGAdapterView?
   fun RemoveSection(header: String?)
   fun AddValue(id: Int?, value: Any?)
   fun RemoveValue(id: Int?)
   fun Clear()
   fun SetOnAdapterView(func: KCallable<Unit>?)
}
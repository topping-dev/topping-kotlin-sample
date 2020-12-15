package dev.topping.kotlin

import kotlin.reflect.KCallable

expect open class LGRecyclerViewAdapter
{
   companion object {
        fun Create(lc: LuaContext?, id: String?): LGRecyclerViewAdapter?
   }
   fun AddValue(id: Int?, value: Any?)
   fun RemoveValue(id: Int?)
   fun Clear()
   fun Notify()
   fun SetOnItemSelected(func: KCallable<Unit>?)
   fun SetOnCreateViewHolder(func: KCallable<Any>?)
   fun SetOnBindViewHolder(func: KCallable<Unit>?)
   fun SetGetItemViewType(func: KCallable<Int>?)
}
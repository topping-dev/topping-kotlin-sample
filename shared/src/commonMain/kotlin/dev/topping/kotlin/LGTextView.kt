package dev.topping.kotlin

import kotlin.reflect.KCallable

expect open class LGTextView : LGView
{
   companion object {
        fun Create(lc: LuaContext?): LGTextView?
   }
   fun SetText(v: String?)
   fun SetTextRef(ref: LuaRef?)
   fun GetText(): String?
   fun SetTextColor(color: String?)
   fun SetTextColorRef(ref: LuaRef?)
}
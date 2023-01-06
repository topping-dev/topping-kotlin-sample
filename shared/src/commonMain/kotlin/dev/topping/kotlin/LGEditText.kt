package dev.topping.kotlin

import kotlin.reflect.KCallable

expect open class LGEditText : LGTextView
{
   companion object {
        fun Create(lc: LuaContext): LGEditText
   }
    fun SetTextChangedListener(func: KCallable<Unit>?)
    fun SetBeforeTextChangedListener(func: KCallable<Unit>?)
    fun SetAfterTextChangedListener(func: KCallable<Unit>?)
}
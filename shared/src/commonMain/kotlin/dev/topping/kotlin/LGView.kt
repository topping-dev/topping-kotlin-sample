package dev.topping.kotlin

import kotlin.reflect.KCallable

expect open class LGView
{
   companion object {
        fun Create(lc: LuaContext): LGView
   }
   fun GetViewById(lId: LuaRef): LGView?
   fun SetEnabled(value: Boolean)
   fun SetFocusable(value: Boolean)
   fun SetBackground(background: LuaRef?)
   fun SetOnClickListener(func: KCallable<Unit>?)
   fun findNavController() : LuaNavController
}
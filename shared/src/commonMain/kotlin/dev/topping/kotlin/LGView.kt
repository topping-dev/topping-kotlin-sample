package dev.topping.kotlin

import kotlin.reflect.KCallable

expect open class LGView
{
   companion object {
        fun Create(lc: LuaContext?): LGView?
   }
   fun GetViewById(lId: String?): LGView?
   fun SetEnabled(value: Boolean?)
   fun SetFocusable(value: Boolean?)
   fun SetBackground(background: String?)
   fun SetBackgroundRef(backgroundRef: LuaRef?)
   fun SetOnClickListener(func: KCallable<Unit>?)
   fun findNavController() : LuaNavController
}
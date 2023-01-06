package dev.topping.kotlin

import kotlin.reflect.KCallable

expect open class LGTabLayout : LGFrameLayout
{
   companion object {
        //fun Create(lc: LuaContext?): LGTabLayout?
   }
    fun SetTabSelectedListener(func: KCallable<Unit>?)
}
package dev.topping.kotlin

import kotlin.reflect.KCallable

expect open class LGBottomNavigationView : LGFrameLayout
{
   companion object {
        fun Create(lc: LuaContext): LGBottomNavigationView
   }
    fun SetTabSelectedListener(func: KCallable<Unit>?)
    fun SetCanSelectTab(func: KCallable<Boolean>?)
}
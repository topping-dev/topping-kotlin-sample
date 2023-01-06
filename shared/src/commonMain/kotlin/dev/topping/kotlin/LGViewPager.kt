package dev.topping.kotlin

import kotlin.reflect.KCallable

expect open class LGViewPager : LGViewGroup
{
   companion object {
        fun Create(lc: LuaContext): LGViewPager
   }
    fun SetAdapter(lgFragmentStateAdapter: LGFragmentStateAdapter)
    fun SetTabLayout(lgTabLayout: LGTabLayout, func: KCallable<LuaTab>)
}
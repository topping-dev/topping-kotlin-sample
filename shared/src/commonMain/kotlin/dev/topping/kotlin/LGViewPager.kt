package dev.topping.kotlin

expect open class LGViewPager : LGViewGroup
{
   companion object {
        fun Create(lc: LuaContext?): LGViewPager?
   }
    fun SetAdapter(lgFragmentStateAdapter: LGFragmentStateAdapter)
    fun SetTabLayout(lgTabLayout: LGTabLayout, ltTab: LuaTranslator)
}
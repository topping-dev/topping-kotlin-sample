package dev.topping.kotlin

expect open class LGViewPager : LGViewGroup
{
   companion object {
        fun create(lc: LuaContext): LGViewPager
   }
    fun setAdapter(lgFragmentStateAdapter: LGFragmentStateAdapter)
    fun setTabLayout(lgTabLayout: LGTabLayout, func: (Int) -> LuaTab)
}
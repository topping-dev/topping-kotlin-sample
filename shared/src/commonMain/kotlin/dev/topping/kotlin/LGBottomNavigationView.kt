package dev.topping.kotlin

expect open class LGBottomNavigationView : LGFrameLayout
{
   companion object {
        fun create(lc: LuaContext): LGBottomNavigationView
   }
    fun setTabSelectedListener(func: ((LGBottomNavigationView, Int) -> Unit)?)
    fun setCanSelectTab(func: ((LGBottomNavigationView, Int) -> Boolean)?)
}
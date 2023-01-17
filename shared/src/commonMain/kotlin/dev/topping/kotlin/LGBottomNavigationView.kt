package dev.topping.kotlin

expect open class LGBottomNavigationView : LGFrameLayout
{
   companion object {
        fun Create(lc: LuaContext): LGBottomNavigationView
   }
    fun SetTabSelectedListener(func: ((LGBottomNavigationView, Int) -> Unit)?)
    fun SetCanSelectTab(func: ((LGBottomNavigationView, Int) -> Boolean)?)
}
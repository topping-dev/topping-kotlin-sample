package dev.topping.kotlin

expect open class LGTabLayout : LGFrameLayout
{
   companion object {
        //fun create(lc: LuaContext?): LGTabLayout?
   }
    fun setTabSelectedListener(func: ((LGTabLayout, LuaTab) -> Unit)?)
}
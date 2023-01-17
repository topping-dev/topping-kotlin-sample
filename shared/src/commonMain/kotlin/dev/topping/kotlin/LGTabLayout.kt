package dev.topping.kotlin

expect open class LGTabLayout : LGFrameLayout
{
   companion object {
        //fun Create(lc: LuaContext?): LGTabLayout?
   }
    fun SetTabSelectedListener(func: ((LGTabLayout, LuaTab) -> Unit)?)
}
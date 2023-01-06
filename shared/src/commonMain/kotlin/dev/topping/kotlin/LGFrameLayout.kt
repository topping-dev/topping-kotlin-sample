package dev.topping.kotlin

expect open class LGFrameLayout : LGViewGroup
{
   companion object {
        fun Create(lc: LuaContext): LGFrameLayout
   }
}
package dev.topping.kotlin

expect open class LGFrameLayout : LGViewGroup
{
   companion object {
        fun create(lc: LuaContext): LGFrameLayout
   }
}
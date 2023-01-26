package dev.topping.kotlin

expect open class LGHorizontalScrollView : LGFrameLayout
{
   companion object {
        fun create(lc: LuaContext): LGHorizontalScrollView
   }
}
package dev.topping.kotlin

expect open class LGHorizontalScrollView : LGFrameLayout
{
   companion object {
        fun Create(lc: LuaContext?): LGHorizontalScrollView?
   }
}
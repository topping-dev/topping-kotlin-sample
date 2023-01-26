package dev.topping.kotlin

expect open class LGScrollView : LGFrameLayout
{
   companion object {
        fun create(lc: LuaContext): LGScrollView
   }
}
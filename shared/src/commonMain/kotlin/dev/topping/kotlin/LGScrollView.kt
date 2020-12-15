package dev.topping.kotlin

expect open class LGScrollView : LGFrameLayout
{
   companion object {
        fun Create(lc: LuaContext?): LGScrollView?
   }
}
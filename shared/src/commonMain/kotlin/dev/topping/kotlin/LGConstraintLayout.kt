package dev.topping.kotlin

expect open class LGConstraintLayout : LGViewGroup
{
   companion object {
        fun Create(lc: LuaContext): LGConstraintLayout
   }
}
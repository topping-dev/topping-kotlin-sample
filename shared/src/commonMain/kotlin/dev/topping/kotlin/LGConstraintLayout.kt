package dev.topping.kotlin

expect open class LGConstraintLayout : LGViewGroup
{
   companion object {
        fun create(lc: LuaContext): LGConstraintLayout
   }
}
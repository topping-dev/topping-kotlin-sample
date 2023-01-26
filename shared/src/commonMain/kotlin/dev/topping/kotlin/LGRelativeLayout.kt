package dev.topping.kotlin

expect open class LGRelativeLayout : LGViewGroup
{
   companion object {
        fun create(lc: LuaContext): LGRelativeLayout
   }
}
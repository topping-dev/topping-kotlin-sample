package dev.topping.kotlin

expect open class LGRelativeLayout : LGViewGroup
{
   companion object {
        fun Create(lc: LuaContext): LGRelativeLayout
   }
}
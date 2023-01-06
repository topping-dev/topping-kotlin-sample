package dev.topping.kotlin

expect open class LGViewGroup : LGView
{
   companion object {
        fun Create(lc: LuaContext): LGViewGroup
   }
}
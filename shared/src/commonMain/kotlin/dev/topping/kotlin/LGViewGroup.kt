package dev.topping.kotlin

expect open class LGViewGroup : LGView
{
   companion object {
        fun create(lc: LuaContext): LGViewGroup
   }
}
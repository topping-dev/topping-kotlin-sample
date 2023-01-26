package dev.topping.kotlin

expect open class LGLinearLayout : LGViewGroup
{
   companion object {
        fun create(lc: LuaContext): LGLinearLayout
   }
}
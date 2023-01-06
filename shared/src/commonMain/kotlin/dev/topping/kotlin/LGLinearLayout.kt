package dev.topping.kotlin

expect open class LGLinearLayout : LGViewGroup
{
   companion object {
        fun Create(lc: LuaContext): LGLinearLayout
   }
}
package dev.topping.kotlin

expect open class LGTableLayout : LGLinearLayout
{
   companion object {
        fun Create(lc: LuaContext?): LGTableLayout?
   }
}
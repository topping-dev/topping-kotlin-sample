package dev.topping.kotlin

expect open class LGTableRow : LGLinearLayout
{
   companion object {
        fun Create(lc: LuaContext?): LGTableRow?
   }
}
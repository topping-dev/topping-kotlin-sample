package dev.topping.kotlin

expect open class LGButton : LGTextView
{
   companion object {
        fun Create(lc: LuaContext?): LGButton?
   }
}
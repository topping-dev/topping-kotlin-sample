package dev.topping.kotlin

expect open class LGAutoCompleteTextView : LGEditText
{
   companion object {
        fun Create(lc: LuaContext?): LGAutoCompleteTextView?
   }
}
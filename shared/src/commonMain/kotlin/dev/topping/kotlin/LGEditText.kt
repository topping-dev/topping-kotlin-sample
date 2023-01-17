package dev.topping.kotlin

expect open class LGEditText : LGTextView
{
   companion object {
        fun Create(lc: LuaContext): LGEditText
   }
    fun SetTextChangedListener(func: ((LGEditText, String) -> Unit)?)
    fun SetBeforeTextChangedListener(func: ((LGEditText, String) -> Unit)?)
    fun SetAfterTextChangedListener(func: ((LGEditText, String) -> Unit)?)
}
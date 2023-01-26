package dev.topping.kotlin

expect open class LGEditText : LGTextView
{
   companion object {
        fun create(lc: LuaContext): LGEditText
   }
    fun setTextChangedListener(func: ((LGEditText, String) -> Unit)?)
    fun setBeforeTextChangedListener(func: ((LGEditText, String) -> Unit)?)
    fun setAfterTextChangedListener(func: ((LGEditText, String) -> Unit)?)
}
package dev.topping.kotlin

expect open class LGTextView : LGView
{
   companion object {
        fun create(lc: LuaContext): LGTextView
   }
   fun setText(v: LuaRef?)
   fun setTextInternal(str: String?)
   fun getText(): String?
   fun setTextColor(ref: LuaRef?)
}
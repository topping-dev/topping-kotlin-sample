package dev.topping.kotlin

expect open class LGTextView : LGView
{
   companion object {
        fun Create(lc: LuaContext?): LGTextView?
   }
   fun SetText(v: LuaRef?)
   fun SetTextInternal(str: String?)
   fun GetText(): String?
   fun SetTextColor(ref: LuaRef?)
}
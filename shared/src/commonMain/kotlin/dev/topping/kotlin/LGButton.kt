package dev.topping.kotlin

expect open class LGButton : LGTextView
{
   companion object {
       fun create(lc: LuaContext): LGButton
   }
}
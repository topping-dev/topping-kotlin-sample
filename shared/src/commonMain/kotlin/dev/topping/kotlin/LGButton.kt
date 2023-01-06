package dev.topping.kotlin

import kotlin.reflect.KCallable

expect open class LGButton : LGTextView
{
   companion object {
       fun Create(lc: LuaContext): LGButton
   }
}
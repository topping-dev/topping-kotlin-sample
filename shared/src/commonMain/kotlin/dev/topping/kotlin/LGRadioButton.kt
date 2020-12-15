package dev.topping.kotlin

import kotlin.reflect.KCallable

expect open class LGRadioButton : LGCompoundButton
{
   companion object {
        fun Create(lc: LuaContext?): LGRadioButton?
   }
}
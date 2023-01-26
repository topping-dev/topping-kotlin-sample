package dev.topping.kotlin

expect open class LGRadioButton : LGCompoundButton
{
   companion object {
        fun create(lc: LuaContext): LGRadioButton
   }
}
package dev.topping.kotlin

expect open class LGRadioButton : LGCompoundButton
{
   companion object {
        fun Create(lc: LuaContext): LGRadioButton
   }
}
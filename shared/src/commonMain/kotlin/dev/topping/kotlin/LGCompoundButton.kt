package dev.topping.kotlin

expect open class LGCompoundButton : LGButton
{
   companion object {
        fun Create(lc: LuaContext?): LGCompoundButton?
   }
}
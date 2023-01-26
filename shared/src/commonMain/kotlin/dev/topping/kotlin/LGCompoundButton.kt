package dev.topping.kotlin

expect open class LGCompoundButton : LGButton
{
   companion object {
        fun create(lc: LuaContext): LGCompoundButton
   }
}
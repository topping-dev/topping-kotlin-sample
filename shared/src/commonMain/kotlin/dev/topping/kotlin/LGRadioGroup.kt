package dev.topping.kotlin

expect open class LGRadioGroup : LGLinearLayout
{
   companion object {
        fun create(lc: LuaContext): LGRadioGroup
   }
   fun setOnCheckedChangedListener(func: ((Int, Boolean) -> Unit)?)
}
package dev.topping.kotlin

expect open class LGRadioGroup : LGLinearLayout
{
   companion object {
        fun Create(lc: LuaContext): LGRadioGroup
   }
   fun SetOnCheckedChangedListener(func: ((Int, Boolean) -> Unit)?)
}
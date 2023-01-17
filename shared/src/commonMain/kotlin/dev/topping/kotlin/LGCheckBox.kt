package dev.topping.kotlin

expect open class LGCheckBox : LGCompoundButton
{
   companion object {
        fun Create(lc: LuaContext): LGCheckBox
   }
   fun SetOnCheckedChangedListener(func: ((LGCheckBox, LuaContext, Boolean) -> Unit)?)
}
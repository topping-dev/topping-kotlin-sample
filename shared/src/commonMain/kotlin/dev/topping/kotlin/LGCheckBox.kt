package dev.topping.kotlin

expect open class LGCheckBox : LGCompoundButton
{
   companion object {
        fun create(lc: LuaContext): LGCheckBox
   }
   fun setOnCheckedChangedListener(func: ((LGCheckBox, LuaContext, Boolean) -> Unit)?)
}
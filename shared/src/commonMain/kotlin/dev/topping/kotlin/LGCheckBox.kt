package dev.topping.kotlin

import kotlin.reflect.KCallable

expect open class LGCheckBox : LGCompoundButton
{
   companion object {
        fun Create(lc: LuaContext): LGCheckBox
   }
   fun SetOnCheckedChangedListener(func: KCallable<Unit>?)
}
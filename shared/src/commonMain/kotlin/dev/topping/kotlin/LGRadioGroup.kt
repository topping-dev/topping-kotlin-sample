package dev.topping.kotlin

import kotlin.reflect.KCallable

expect open class LGRadioGroup : LGLinearLayout
{
   companion object {
        fun Create(lc: LuaContext): LGRadioGroup
   }
   fun SetOnCheckedChangedListener(func: KCallable<Unit>?)
}
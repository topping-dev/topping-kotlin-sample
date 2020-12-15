package dev.topping.kotlin

import kotlin.reflect.KCallable

expect open class LGComboBox : LGEditText
{
   companion object {
        fun Create(lc: LuaContext?): LGComboBox?
   }
   fun AddComboItem(id: String?, tag: Any?)
   fun SetSelected(index: Int)
   fun GetSelectedName(): String?
   fun GetSelectedTag(): Any?
   fun SetOnComboChangedListener(func: KCallable<Unit>?)
}
package dev.topping.kotlin

import kotlin.reflect.KCallable

expect open class LGComboBox : LGEditText
{
   companion object {
        fun Create(lc: LuaContext): LGComboBox
   }
   fun AddItem(id: String, tag: Any)
   fun SetItems(map: Map<String, Any>)
   fun SetSelected(index: Int)
   fun GetSelectedName(): String?
   fun GetSelectedTag(): Any?
   fun SetOnComboChangedListener(func: KCallable<Unit>?)
}
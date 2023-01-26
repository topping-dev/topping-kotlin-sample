package dev.topping.kotlin

expect open class LGComboBox : LGEditText
{
   companion object {
        fun create(lc: LuaContext): LGComboBox
   }
   fun addItem(id: String, tag: Any)
   fun setItems(map: Map<String, Any>)
   fun setSelectedIndex(index: Int)
   fun getSelectedName(): String?
   fun getSelectedTag(): Any?
   fun setOnComboChangedListener(func: ((LGComboBox, LuaContext, String, Any) -> Unit)?)
}
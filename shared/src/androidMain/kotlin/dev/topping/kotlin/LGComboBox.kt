package dev.topping.kotlin

actual open class LGComboBox : LGEditText()
{
   var lgComboBox: android.widget.LGComboBox? = null
   actual companion object {
        actual fun create(lc: LuaContext): LGComboBox {
            val pobj = LGComboBox()
            val pres = android.widget.LGComboBox.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun addItem(id: String, tag: Any)
   {
       lgComboBox?.addItem(id, tag)
   }
    actual fun setItems(map: Map<String, Any>)
    {
        lgComboBox?.setItems(map)
    }
   fun ShowCustom(value: Int?)
   {
       lgComboBox?.showCustom(value)
   }
   fun ShowDelete(value: Int?)
   {
       lgComboBox?.showDelete(value)
   }
   actual fun setSelectedIndex(index: Int)
   {
       lgComboBox?.setSelectedIndex(index)
   }
   actual fun getSelectedName(): String? {
       return lgComboBox?.getSelectedName()
   }
   actual fun getSelectedTag(): Any? {
       return lgComboBox?.getSelectedTag()
   }
   actual fun setOnComboChangedListener(func: ((LGComboBox, LuaContext, String, Any) -> Unit)?)
   {
       lgComboBox?.setOnComboChangedListener(func.toLuaTranslator(this))
   }
    open override fun GetNativeObject(): Any?
   {
       return lgComboBox
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgComboBox = par as android.widget.LGComboBox?
   }
}
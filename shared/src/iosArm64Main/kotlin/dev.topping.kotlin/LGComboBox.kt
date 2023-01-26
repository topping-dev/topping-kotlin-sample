package dev.topping.kotlin

import platform.darwin.NSObject

actual open class LGComboBox : LGEditText()
{
   var lgComboBox: cocoapods.Topping.LGComboBox? = null
   actual companion object {
        actual fun create(lc: LuaContext): LGComboBox {
            val pobj = LGComboBox()
            val pres = cocoapods.Topping.LGComboBox.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun addItem(id: String, tag: Any)
   {
       lgComboBox?.addItem(id, tag as NSObject)
   }
    actual fun setItems(map: Map<String, Any>)
    {
        map.forEach {
            lgComboBox?.addItem(it.key, it.value as NSObject)
        }
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
       lgComboBox = par as cocoapods.Topping.LGComboBox?
   }
}
package dev.topping.kotlin

import platform.darwin.NSObject

actual open class LGComboBox : LGEditText()
{
   var lgComboBox: cocoapods.Topping.LGComboBox? = null
   actual companion object {
        actual fun Create(lc: LuaContext): LGComboBox {
            val pobj = LGComboBox()
            val pres = cocoapods.Topping.LGComboBox.Create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun AddItem(id: String, tag: Any)
   {
       lgComboBox?.AddItem(id, tag as NSObject)
   }
    actual fun SetItems(map: Map<String, Any>)
    {
        map.forEach {
            lgComboBox?.AddItem(it.key, it.value as NSObject)
        }
    }
   actual fun SetSelected(index: Int)
   {
       lgComboBox?.SetSelected(index)
   }
   actual fun GetSelectedName(): String? {
       return lgComboBox?.GetSelectedName()
   }
   actual fun GetSelectedTag(): Any? {
       return lgComboBox?.GetSelectedTag()
   }
   actual fun SetOnComboChangedListener(func: ((LGComboBox, LuaContext, String, Any) -> Unit)?)
   {
       lgComboBox?.SetOnComboChangedListener(func.toLuaTranslator(this))
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
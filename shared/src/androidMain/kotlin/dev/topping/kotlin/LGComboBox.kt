package dev.topping.kotlin

import kotlin.reflect.KCallable

actual open class LGComboBox : LGEditText()
{
   var lgComboBox: android.widget.LGComboBox? = null
   actual companion object {
        actual fun Create(lc: LuaContext): LGComboBox {
            val pobj = LGComboBox()
            val pres = android.widget.LGComboBox.Create(lc?.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun AddItem(id: String, tag: Any)
   {
       lgComboBox?.AddItem(id, tag)
   }
    actual fun SetItems(map: Map<String, Any>)
    {
        lgComboBox?.SetItems(map)
    }
   fun ShowCustom(value: Int?)
   {
       lgComboBox?.ShowCustom(value)
   }
   fun ShowDelete(value: Int?)
   {
       lgComboBox?.ShowDelete(value)
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
   actual fun SetOnComboChangedListener(func: KCallable<Unit>?)
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
       lgComboBox = par as android.widget.LGComboBox?
   }
}
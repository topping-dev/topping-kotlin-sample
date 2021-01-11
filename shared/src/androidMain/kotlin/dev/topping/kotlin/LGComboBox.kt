package dev.topping.kotlin

import kotlin.reflect.KCallable

actual open class LGComboBox : LGEditText()
{
   var lgComboBox: android.widget.LGComboBox? = null
   actual companion object {
        actual fun Create(lc: LuaContext?): LGComboBox?
        {
            val pobj = LGComboBox()
            val pres = android.widget.LGComboBox.Create(lc?.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun AddComboItem(id: String?, tag: Any?)
   {
       lgComboBox?.AddComboItem(id, tag)
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
   actual fun GetSelectedName(): String?
   {
       return lgComboBox?.GetSelectedName()
   }
   actual fun GetSelectedTag(): Any?
   {
       return lgComboBox?.GetSelectedTag()
   }
   actual fun SetOnComboChangedListener(func: KCallable<Unit>?)
   {
       val kt: KTWrap<Unit> = KTWrap<Unit>()
       val lt: dev.topping.android.LuaTranslator = dev.topping.android.LuaTranslator(kt, kt.Init(this, func))
       lgComboBox?.SetOnComboChangedListener(lt)
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
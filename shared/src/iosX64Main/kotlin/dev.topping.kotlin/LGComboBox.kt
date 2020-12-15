package dev.topping.kotlin

import kotlinx.cinterop.StableRef
import kotlinx.cinterop.staticCFunction
import platform.darwin.NSObject
import kotlin.reflect.KCallable

actual open class LGComboBox : LGEditText()
{
   var lgComboBox: cocoapods.toppingios.LGComboBox? = null
   actual companion object {
        actual fun Create(lc: LuaContext?): LGComboBox?
        {
            val pobj = LGComboBox()
            val pres = cocoapods.toppingios.LGComboBox.Create(lc?.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun AddComboItem(id: String?, tag: Any?)
   {
       lgComboBox?.AddComboItem(id, tag as NSObject)
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
       val lt: cocoapods.toppingios.LuaTranslator = cocoapods.toppingios.LuaTranslator()
       lt.nobj = StableRef.create(kt).asCPointer()
       lt.kFRetF = kt.Init(this, func)
       lgComboBox?.SetOnComboChangedListener(lt)
   }
    open override fun GetNativeObject(): Any?
   {
       return lgComboBox
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgComboBox = par as cocoapods.toppingios.LGComboBox?
   }
}
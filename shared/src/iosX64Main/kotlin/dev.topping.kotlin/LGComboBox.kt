package dev.topping.kotlin

import kotlinx.cinterop.StableRef
import kotlinx.cinterop.staticCFunction
import platform.darwin.NSObject
import kotlin.reflect.KCallable

actual open class LGComboBox : LGEditText()
{
   var lgComboBox: cocoapods.Topping.LGComboBox? = null
   actual companion object {
        actual fun Create(lc: LuaContext?): LGComboBox?
        {
            val pobj = LGComboBox()
            val pres = cocoapods.Topping.LGComboBox.Create(lc?.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun AddItem(id: String?, tag: Any?)
   {
       lgComboBox?.AddComboItem(id, tag as NSObject)
   }
    actual fun SetItems(map: Map<String?, Any?>)
    {

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
       val kt: KTWrap = KTWrap()
       val lt: cocoapods.Topping.LuaTranslator = cocoapods.Topping.LuaTranslator()
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
       lgComboBox = par as cocoapods.Topping.LGComboBox?
   }
}
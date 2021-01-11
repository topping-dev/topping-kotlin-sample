package dev.topping.kotlin

import kotlinx.cinterop.StableRef
import kotlinx.cinterop.staticCFunction
import kotlin.reflect.KCallable

actual open class LGDatePicker : LGFrameLayout()
{
   var lgDatePicker: cocoapods.Topping.LGDatePicker? = null
   actual companion object {
        actual fun Create(lc: LuaContext?): LGDatePicker?
        {
            val pobj = LGDatePicker()
            val pres = cocoapods.Topping.LGDatePicker.Create(lc?.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun GetDay(): Int?
   {
       return lgDatePicker?.GetDay()
   }
   actual fun GetMonth(): Int?
   {
       return lgDatePicker?.GetMonth()
   }
   actual fun GetYear(): Int?
   {
       return lgDatePicker?.GetYear()
   }
   actual fun UpdateDate(day: Int?, month: Int?, year: Int?)
   {
       lgDatePicker?.UpdateDate(day!!, month!!, year!!)
   }
   actual fun SetOnDateChangedListener(func: KCallable<Unit>?)
   {
       val kt: KTWrap<Unit> = KTWrap<Unit>()
       val lt: cocoapods.Topping.LuaTranslator = cocoapods.Topping.LuaTranslator()
       lt.nobj = StableRef.create(kt).asCPointer()
       lt.kFRetF = kt.Init(this, func)
       lgDatePicker?.SetOnDateChangedListener(lt)
   }
    open override fun GetNativeObject(): Any?
   {
       return lgDatePicker
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgDatePicker = par as cocoapods.Topping.LGDatePicker?
   }
}
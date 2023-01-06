package dev.topping.kotlin

import kotlin.reflect.KCallable

actual open class LGDatePicker : LGFrameLayout()
{
   var lgDatePicker: android.widget.LGDatePicker? = null
   actual companion object {
        actual fun Create(lc: LuaContext): LGDatePicker {
            val pobj = LGDatePicker()
            val pres = android.widget.LGDatePicker.Create(lc?.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun GetDay(): Int {
       return lgDatePicker?.GetDay()!!
   }
   actual fun GetMonth(): Int {
       return lgDatePicker?.GetMonth()!!
   }
   actual fun GetYear(): Int {
       return lgDatePicker?.GetYear()!!
   }
   actual fun UpdateDate(day: Int, month: Int, year: Int)
   {
       lgDatePicker?.UpdateDate(day, month, year)
   }
   actual fun SetOnDateChangedListener(func: KCallable<Unit>?)
   {
       lgDatePicker?.SetOnDateChangedListener(func.toLuaTranslator(this))
   }
    open override fun GetNativeObject(): Any?
   {
       return lgDatePicker
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgDatePicker = par as android.widget.LGDatePicker?
   }
}
package dev.topping.kotlin

actual open class LGDatePicker : LGFrameLayout()
{
   var lgDatePicker: android.widget.LGDatePicker? = null
   actual companion object {
        actual fun create(lc: LuaContext): LGDatePicker {
            val pobj = LGDatePicker()
            val pres = android.widget.LGDatePicker.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun getDay(): Int {
       return lgDatePicker?.getDay()!!
   }
   actual fun getMonth(): Int {
       return lgDatePicker?.getMonth()!!
   }
   actual fun getYear(): Int {
       return lgDatePicker?.getYear()!!
   }
   actual fun updateDate(day: Int, month: Int, year: Int)
   {
       lgDatePicker?.updateDate(day, month, year)
   }
   actual fun setOnDateChangedListener(func: ((LGDatePicker, Int, Int, Int) -> Unit)?)
   {
       lgDatePicker?.setOnDateChangedListener(func.toLuaTranslator(this))
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
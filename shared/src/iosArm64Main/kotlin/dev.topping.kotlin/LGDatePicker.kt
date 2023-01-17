package dev.topping.kotlin

actual open class LGDatePicker : LGFrameLayout()
{
   var lgDatePicker: cocoapods.Topping.LGDatePicker? = null
   actual companion object {
        actual fun Create(lc: LuaContext): LGDatePicker {
            val pobj = LGDatePicker()
            val pres = cocoapods.Topping.LGDatePicker.Create(lc.luaContext)
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
   actual fun SetOnDateChangedListener(func: ((LGDatePicker, Int, Int, Int) -> Unit)?)
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
       lgDatePicker = par as cocoapods.Topping.LGDatePicker?
   }
}
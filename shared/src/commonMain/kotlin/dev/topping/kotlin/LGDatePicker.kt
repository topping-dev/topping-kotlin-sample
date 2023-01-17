package dev.topping.kotlin

expect open class LGDatePicker : LGFrameLayout
{
   companion object {
        fun Create(lc: LuaContext): LGDatePicker
   }
   fun GetDay(): Int
   fun GetMonth(): Int
   fun GetYear(): Int
   fun UpdateDate(day: Int, month: Int, year: Int)
   fun SetOnDateChangedListener(func: ((LGDatePicker, Int, Int, Int) -> Unit)?)
}
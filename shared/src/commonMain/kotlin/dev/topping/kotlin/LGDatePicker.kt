package dev.topping.kotlin

expect open class LGDatePicker : LGFrameLayout
{
   companion object {
        fun create(lc: LuaContext): LGDatePicker
   }
   fun getDay(): Int
   fun getMonth(): Int
   fun getYear(): Int
   fun updateDate(day: Int, month: Int, year: Int)
   fun setOnDateChangedListener(func: ((LGDatePicker, Int, Int, Int) -> Unit)?)
}
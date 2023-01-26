package dev.topping.kotlin

expect open class LuaDate
{
   companion object {
        fun now(): LuaDate
      fun createDate(day: Int, month: Int, year: Int): LuaDate
      fun createDateWithTime(day: Int, month: Int, year: Int, hour: Int, minute: Int, second: Int): LuaDate
   }
   fun getDay(): Int
   fun setDay(v: Int)
   fun getMonth(): Int
   fun setMonth(v: Int)
   fun getYear(): Int
   fun setYear(v: Int)
   fun getHour(): Int
   fun setHour(v: Int)
   fun getMinute(): Int
   fun setMinute(v: Int)
   fun getSecond(): Int
   fun setSecond(v: Int)
   fun getMilliSecond(): Int
   fun setMilliSecond(v: Int)
   fun toString(frmt: String): String?
}
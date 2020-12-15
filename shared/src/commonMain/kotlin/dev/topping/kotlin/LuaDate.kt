package dev.topping.kotlin

expect open class LuaDate
{
   companion object {
        fun Now(): LuaDate?
        fun CreateDate(day: Int, month: Int, year: Int): LuaDate?
        fun CreateDateWithTime(day: Int, month: Int, year: Int, hour: Int, minute: Int, second: Int): LuaDate?
   }
   fun GetDay(): Int?
   fun SetDay(v: Int?)
   fun GetMonth(): Int?
   fun SetMonth(v: Int?)
   fun GetYear(): Int?
   fun SetYear(v: Int?)
   fun GetHour(): Int?
   fun SetHour(v: Int?)
   fun GetMinute(): Int?
   fun SetMinute(v: Int?)
   fun GetSecond(): Int?
   fun SetSecond(v: Int?)
   fun GetMilliSecond(): Int?
   fun SetMilliSecond(v: Int?)
   fun ToString(frmt: String?): String?
}
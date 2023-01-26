package dev.topping.kotlin

actual open class LuaDate : KTInterface
{
   var luaDate: dev.topping.android.LuaDate? = null
   actual companion object {
        actual fun now(): LuaDate {
            val pobj = LuaDate()
            val pres = dev.topping.android.LuaDate.now()
            pobj.SetNativeObject(pres)
            return pobj
        }
        actual fun createDate(day: Int, month: Int, year: Int): LuaDate {
            val pobj = LuaDate()
            val pres = dev.topping.android.LuaDate.createDate(day, month, year)
            pobj.SetNativeObject(pres)
            return pobj
        }
        actual fun createDateWithTime(day: Int, month: Int, year: Int, hour: Int, minute: Int, second: Int): LuaDate {
            val pobj = LuaDate()
            val pres = dev.topping.android.LuaDate.createDateWithTime(day, month, year, hour, minute, second)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun getDay(): Int {
       return luaDate?.getDay()!!
   }
   actual fun setDay(v: Int)
   {
       luaDate?.setDay(v)
   }
   actual fun getMonth(): Int {
       return luaDate?.getMonth()!!
   }
   actual fun setMonth(v: Int)
   {
       luaDate?.setMonth(v)
   }
   actual fun getYear(): Int {
       return luaDate?.getYear()!!
   }
   actual fun setYear(v: Int)
   {
       luaDate?.setYear(v)
   }
   actual fun getHour(): Int {
       return luaDate?.getHour()!!
   }
   actual fun setHour(v: Int)
   {
       luaDate?.setHour(v)
   }
   actual fun getMinute(): Int {
       return luaDate?.getMinute()!!
   }
   actual fun setMinute(v: Int)
   {
       luaDate?.setMinute(v)
   }
   actual fun getSecond(): Int {
       return luaDate?.getSecond()!!
   }
   actual fun setSecond(v: Int)
   {
       luaDate?.setSecond(v)
   }
   actual fun getMilliSecond(): Int {
       return luaDate?.getMilliSecond()!!
   }
   actual fun setMilliSecond(v: Int)
   {
       luaDate?.setMilliSecond(v)
   }
   actual fun toString(frmt: String): String?
   {
       return luaDate?.toString(frmt)
   }
    open override fun GetNativeObject(): Any?
   {
       return luaDate
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaDate = par as dev.topping.android.LuaDate?
   }
}
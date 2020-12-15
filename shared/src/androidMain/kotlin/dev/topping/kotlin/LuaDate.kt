package dev.topping.kotlin

actual open class LuaDate : KTInterface
{
   var luaDate: dev.topping.android.LuaDate? = null
   actual companion object {
        actual fun Now(): LuaDate?
        {
            val pobj = LuaDate()
            val pres = dev.topping.android.LuaDate.Now()
            pobj.SetNativeObject(pres)
            return pobj
        }
        actual fun CreateDate(day: Int, month: Int, year: Int): LuaDate?
        {
            val pobj = LuaDate()
            val pres = dev.topping.android.LuaDate.CreateDate(day, month, year)
            pobj.SetNativeObject(pres)
            return pobj
        }
        actual fun CreateDateWithTime(day: Int, month: Int, year: Int, hour: Int, minute: Int, second: Int): LuaDate?
        {
            val pobj = LuaDate()
            val pres = dev.topping.android.LuaDate.CreateDateWithTime(day, month, year, hour, minute, second)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun GetDay(): Int?
   {
       return luaDate?.GetDay()
   }
   actual fun SetDay(v: Int?)
   {
       luaDate?.SetDay(v)
   }
   actual fun GetMonth(): Int?
   {
       return luaDate?.GetMonth()
   }
   actual fun SetMonth(v: Int?)
   {
       luaDate?.SetMonth(v)
   }
   actual fun GetYear(): Int?
   {
       return luaDate?.GetYear()
   }
   actual fun SetYear(v: Int?)
   {
       luaDate?.SetYear(v)
   }
   actual fun GetHour(): Int?
   {
       return luaDate?.GetHour()
   }
   actual fun SetHour(v: Int?)
   {
       luaDate?.SetHour(v)
   }
   actual fun GetMinute(): Int?
   {
       return luaDate?.GetMinute()
   }
   actual fun SetMinute(v: Int?)
   {
       luaDate?.SetMinute(v)
   }
   actual fun GetSecond(): Int?
   {
       return luaDate?.GetSecond()
   }
   actual fun SetSecond(v: Int?)
   {
       luaDate?.SetSecond(v)
   }
   actual fun GetMilliSecond(): Int?
   {
       return luaDate?.GetMilliSecond()
   }
   actual fun SetMilliSecond(v: Int?)
   {
       luaDate?.SetMilliSecond(v)
   }
   actual fun ToString(frmt: String?): String?
   {
       return luaDate?.ToString(frmt)
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
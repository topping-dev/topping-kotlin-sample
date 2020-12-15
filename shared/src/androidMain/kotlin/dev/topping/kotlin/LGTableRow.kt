package dev.topping.kotlin

actual open class LGTableRow : LGLinearLayout()
{
   var lgTableRow: android.widget.LGTableRow? = null
   actual companion object {
        actual fun Create(lc: LuaContext?): LGTableRow?
        {
            val pobj = LGTableRow()
            val pres = android.widget.LGTableRow.Create(lc?.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
    open override fun GetNativeObject(): Any?
   {
       return lgTableRow
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgTableRow = par as android.widget.LGTableRow?
   }
}
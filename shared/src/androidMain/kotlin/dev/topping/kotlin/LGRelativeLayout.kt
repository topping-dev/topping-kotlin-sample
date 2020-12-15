package dev.topping.kotlin

actual open class LGRelativeLayout : LGViewGroup()
{
   var lgRelativeLayout: android.widget.LGRelativeLayout? = null
   actual companion object {
        actual fun Create(lc: LuaContext?): LGRelativeLayout?
        {
            val pobj = LGRelativeLayout()
            val pres = android.widget.LGRelativeLayout.Create(lc?.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
    open override fun GetNativeObject(): Any?
   {
       return lgRelativeLayout
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgRelativeLayout = par as android.widget.LGRelativeLayout?
   }
}
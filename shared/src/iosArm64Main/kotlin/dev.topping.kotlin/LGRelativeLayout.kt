package dev.topping.kotlin

actual open class LGRelativeLayout : LGViewGroup()
{
   var lgRelativeLayout: cocoapods.Topping.LGRelativeLayout? = null
   actual companion object {
        actual fun Create(lc: LuaContext?): LGRelativeLayout?
        {
            val pobj = LGRelativeLayout()
            val pres = cocoapods.Topping.LGRelativeLayout.Create(lc?.luaContext)
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
       lgRelativeLayout = par as cocoapods.Topping.LGRelativeLayout?
   }
}
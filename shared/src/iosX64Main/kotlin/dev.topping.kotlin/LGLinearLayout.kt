package dev.topping.kotlin

actual open class LGLinearLayout : LGViewGroup()
{
   var lgLinearLayout: cocoapods.toppingios.LGLinearLayout? = null
   actual companion object {
        actual fun Create(lc: LuaContext?): LGLinearLayout?
        {
            val pobj = LGLinearLayout()
            val pres = cocoapods.toppingios.LGLinearLayout.Create(lc?.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
    open override fun GetNativeObject(): Any?
   {
       return lgLinearLayout
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgLinearLayout = par as cocoapods.toppingios.LGLinearLayout?
   }
}
package dev.topping.kotlin

actual open class LGTableLayout : LGLinearLayout()
{
   var lgTableLayout: cocoapods.Topping.LGTableLayout? = null
   actual companion object {
        actual fun Create(lc: LuaContext?): LGTableLayout?
        {
            val pobj = LGTableLayout()
            val pres = cocoapods.Topping.LGTableLayout.Create(lc?.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
    open override fun GetNativeObject(): Any?
   {
       return lgTableLayout
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgTableLayout = par as cocoapods.Topping.LGTableLayout?
   }
}
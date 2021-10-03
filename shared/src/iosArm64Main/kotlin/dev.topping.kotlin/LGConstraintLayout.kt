package dev.topping.kotlin

actual open class LGConstraintLayout : LGViewGroup()
{
   var lgConstraintLayout: cocoapods.Topping.LGConstraintLayout? = null
   actual companion object {
        actual fun Create(lc: LuaContext?): LGConstraintLayout?
        {
            val pobj = LGConstraintLayout()
            val pres = cocoapods.Topping.LGConstraintLayout.Create(lc?.luaContext!!)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
    open override fun GetNativeObject(): Any?
   {
       return lgConstraintLayout
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgConstraintLayout = par as cocoapods.Topping.LGConstraintLayout?
   }
}
package dev.topping.kotlin

actual open class LGFrameLayout : LGViewGroup()
{
   var lgFrameLayout: cocoapods.toppingios.LGFrameLayout? = null
   actual companion object {
        actual fun Create(lc: LuaContext?): LGFrameLayout?
        {
            val pobj = LGFrameLayout()
            val pres = cocoapods.toppingios.LGFrameLayout.Create(lc?.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
    open override fun GetNativeObject(): Any?
   {
       return lgFrameLayout
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgFrameLayout = par as cocoapods.toppingios.LGFrameLayout?
   }
}
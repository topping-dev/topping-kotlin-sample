package dev.topping.kotlin

actual open class LGFrameLayout : LGViewGroup()
{
   var lgFrameLayout: android.widget.LGFrameLayout? = null
   actual companion object {
        actual fun create(lc: LuaContext): LGFrameLayout {
            val pobj = LGFrameLayout()
            val pres = android.widget.LGFrameLayout.create(lc.luaContext)
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
       lgFrameLayout = par as android.widget.LGFrameLayout?
   }
}
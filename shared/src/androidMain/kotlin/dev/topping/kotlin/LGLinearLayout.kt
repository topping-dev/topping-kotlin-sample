package dev.topping.kotlin

actual open class LGLinearLayout : LGViewGroup()
{
   var lgLinearLayout: android.widget.LGLinearLayout? = null
   actual companion object {
        actual fun create(lc: LuaContext): LGLinearLayout {
            val pobj = LGLinearLayout()
            val pres = android.widget.LGLinearLayout.create(lc.luaContext)
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
       lgLinearLayout = par as android.widget.LGLinearLayout?
   }
}
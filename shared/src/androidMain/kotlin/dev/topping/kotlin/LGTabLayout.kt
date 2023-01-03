package dev.topping.kotlin

actual open class LGTabLayout : LGFrameLayout()
{
   var lgTabLayout: android.widget.LGTabLayout? = null
   actual companion object {
        /*actual fun Create(lc: LuaContext?): LGTabLayout?
        {
            val pobj = LGTabLayout()
            val pres = android.widget.LGTabLayout(lc?.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }*/
   }
    actual fun SetTabSelectedListener(ltTabSelectedListener: LuaTranslator) {
        lgTabLayout?.SetTabSelectedListener(ltTabSelectedListener.luaTranslator)
    }
    open override fun GetNativeObject(): Any?
   {
       return lgTabLayout
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgTabLayout = par as android.widget.LGTabLayout?
   }
}
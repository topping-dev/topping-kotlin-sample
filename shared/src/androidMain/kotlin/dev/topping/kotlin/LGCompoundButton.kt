package dev.topping.kotlin

actual open class LGCompoundButton : LGButton()
{
   var lgCompoundButton: android.widget.LGCompoundButton? = null
   actual companion object {
        actual fun Create(lc: LuaContext?): LGCompoundButton?
        {
            val pobj = LGCompoundButton()
            val pres = android.widget.LGCompoundButton.Create(lc?.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
    open override fun GetNativeObject(): Any?
   {
       return lgCompoundButton
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgCompoundButton = par as android.widget.LGCompoundButton?
   }
}
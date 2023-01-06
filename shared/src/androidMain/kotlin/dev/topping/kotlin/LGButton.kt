package dev.topping.kotlin

actual open class LGButton : LGTextView()
{
   var lgButton: android.widget.LGButton? = null
   actual companion object {
        actual fun Create(lc: LuaContext): LGButton {
            val pobj = LGButton()
            val pres = android.widget.LGButton.Create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
    open override fun GetNativeObject(): Any?
   {
       return lgButton
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgButton = par as android.widget.LGButton?
   }
}
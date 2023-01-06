package dev.topping.kotlin

import kotlin.reflect.KCallable

actual open class LGCheckBox : LGCompoundButton()
{
   var lgCheckBox: android.widget.LGCheckBox? = null
   actual companion object {
        actual fun Create(lc: LuaContext): LGCheckBox {
            val pobj = LGCheckBox()
            val pres = android.widget.LGCheckBox.Create(lc?.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun SetOnCheckedChangedListener(func: KCallable<Unit>?)
   {
       lgCheckBox?.SetOnCheckedChangedListener(func.toLuaTranslator(this))
   }
    open override fun GetNativeObject(): Any?
   {
       return lgCheckBox
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgCheckBox = par as android.widget.LGCheckBox?
   }
}
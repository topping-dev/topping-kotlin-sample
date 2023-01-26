package dev.topping.kotlin

actual open class LGCheckBox : LGCompoundButton()
{
   var lgCheckBox: cocoapods.Topping.LGCheckBox? = null
   actual companion object {
        actual fun create(lc: LuaContext): LGCheckBox {
            val pobj = LGCheckBox()
            val pres = cocoapods.Topping.LGCheckBox.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun setOnCheckedChangedListener(func: ((LGCheckBox, LuaContext, Boolean) -> Unit)?)
   {
       lgCheckBox?.setOnCheckedChangedListener(func.toLuaTranslator(this))
   }
    open override fun GetNativeObject(): Any?
   {
       return lgCheckBox
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgCheckBox = par as cocoapods.Topping.LGCheckBox?
   }
}
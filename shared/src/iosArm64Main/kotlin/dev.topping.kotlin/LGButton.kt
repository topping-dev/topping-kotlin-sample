package dev.topping.kotlin

actual open class LGButton : LGTextView()
{
   var lgButton: cocoapods.Topping.LGButton? = null
   actual companion object {
        actual fun create(lc: LuaContext): LGButton {
            val pobj = LGButton()
            val pres = cocoapods.Topping.LGButton.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }

    override fun SetOnClickListenerInternal(func: ((LGView, LuaContext) -> Unit)?): Boolean
    {
        lgButton?.setOnClickListener(func.toLuaTranslator(this))
        return true
    }

    open override fun GetNativeObject(): Any?
   {
       return lgButton
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgButton = par as cocoapods.Topping.LGButton?
   }
}
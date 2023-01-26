package dev.topping.kotlin

actual open class LGView : KTInterface
{
   var lgView: android.widget.LGView? = null
   actual companion object {
        actual fun create(lc: LuaContext): LGView {
            val pobj = LGView()
            val pres = android.widget.LGView.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun getViewById(lId: LuaRef): LGView?
   {
       return KTWrap.Wrap(lgView?.getViewById(lId.luaRef)) as LGView?
   }
   actual fun setEnabled(value: Boolean)
   {
       lgView?.setEnabled(value)
   }
   actual fun setFocusable(value: Boolean)
   {
       lgView?.setFocusable(value)
   }
   actual fun setBackground(background: LuaRef?)
   {
       lgView?.setBackground(background?.luaRef)
   }
   actual fun setOnClickListener(func: ((LGView, LuaContext) -> Unit)?)
   {
       lgView?.setOnClickListener(func.toLuaTranslator(this))
   }
    actual open fun findNavController() : LuaNavController
    {
        return KTWrap.Wrap(lgView?.findNavController()) as LuaNavController
    }
    open override fun GetNativeObject(): Any?
   {
       return lgView
   }
    open override fun SetNativeObject(par :Any?)
   {
       lgView = par as android.widget.LGView?
   }
}
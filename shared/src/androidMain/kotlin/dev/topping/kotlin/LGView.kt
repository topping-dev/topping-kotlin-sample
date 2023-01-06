package dev.topping.kotlin

import kotlin.reflect.KCallable

actual open class LGView : KTInterface
{
   var lgView: android.widget.LGView? = null
   actual companion object {
        actual fun Create(lc: LuaContext): LGView {
            val pobj = LGView()
            val pres = android.widget.LGView.Create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun GetViewById(lId: LuaRef): LGView?
   {
       return KTWrap.Wrap(lgView?.GetViewById(lId.luaRef)) as LGView?
   }
   actual fun SetEnabled(value: Boolean)
   {
       lgView?.SetEnabled(value)
   }
   actual fun SetFocusable(value: Boolean)
   {
       lgView?.SetFocusable(value)
   }
   actual fun SetBackground(background: LuaRef?)
   {
       lgView?.SetBackground(background?.luaRef)
   }
   actual fun SetOnClickListener(func: KCallable<Unit>?)
   {
       lgView?.SetOnClickListener(func.toLuaTranslator(this))
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
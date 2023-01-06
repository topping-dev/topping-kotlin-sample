package dev.topping.kotlin

import kotlin.reflect.KCallable

actual open class LGView : KTInterface
{
   var lgView: cocoapods.Topping.LGView? = null
   actual companion object {
        actual fun Create(lc: LuaContext): LGView {
            val pobj = LGView()
            val pres = cocoapods.Topping.LGView.Create(lc.luaContext)
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
       lgView?.SetBackground(background?.GetNativeObject() as cocoapods.Topping.LuaRef)
   }
    actual fun SetOnClickListener(func: KCallable<Unit>?)
    {
        if(SetOnClickListenerInternal(func))
            return
        lgView?.SetOnClickListener(func.toLuaTranslator(this))
    }

    open fun SetOnClickListenerInternal(func: KCallable<Unit>?) : Boolean
    {
        return false;
    }

    actual open fun findNavController() : LuaNavController
    {
        return KTWrap.Wrap(lgView?.findNavControllerInternal()) as LuaNavController
    }

    open override fun GetNativeObject(): Any?
   {
       return lgView
   }
    open override fun SetNativeObject(par :Any?)
   {
       lgView = par as cocoapods.Topping.LGView?
   }
}
package dev.topping.kotlin

import kotlin.reflect.KCallable

actual open class LGView : KTInterface
{
   var lgView: cocoapods.Topping.LGView? = null
   actual companion object {
        actual fun create(lc: LuaContext): LGView {
            val pobj = LGView()
            val pres = cocoapods.Topping.LGView.create(lc.luaContext)
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
       lgView?.setBackground(background?.GetNativeObject() as cocoapods.Topping.LuaRef)
   }
    actual fun setOnClickListener(func: ((LGView, LuaContext) -> Unit)?)
    {
        if(SetOnClickListenerInternal(func))
            return
        lgView?.setOnClickListener(func.toLuaTranslator(this))
    }

    open fun SetOnClickListenerInternal(func: ((LGView, LuaContext) -> Unit)?) : Boolean
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
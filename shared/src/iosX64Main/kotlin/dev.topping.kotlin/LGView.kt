package dev.topping.kotlin

import kotlinx.cinterop.StableRef
import kotlin.reflect.KCallable

actual open class LGView : KTInterface
{
   var lgView: cocoapods.Topping.LGView? = null
   actual companion object {
        actual fun Create(lc: LuaContext?): LGView?
        {
            val pobj = LGView()
            val pres = cocoapods.Topping.LGView.Create(lc?.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun GetViewById(lId: LuaRef?): LGView?
   {
       return KTWrap.Wrap(lgView?.GetViewById(lId?.luaRef)) as LGView?
   }
   actual fun SetEnabled(value: Boolean?)
   {
       lgView?.SetEnabled(value!!)
   }
   actual fun SetFocusable(value: Boolean?)
   {
       lgView?.SetFocusable(value!!)
   }
   actual fun SetBackground(background: LuaRef?)
   {
       lgView?.SetBackground(background?.luaRef)
   }
   actual fun SetOnClickListener(func: KCallable<Unit>?)
   {
       if(SetOnClickListenerInternal(func!!))
           return
       val kt: KTWrap = KTWrap()
       val lt: cocoapods.Topping.LuaTranslator = cocoapods.Topping.LuaTranslator()
       lt.nobj = StableRef.create(kt).asCPointer()
       lt.kFRetF = kt.Init(this, func)
       lgView?.SetOnClickListener(lt)
   }

    open fun SetOnClickListenerInternal(func: KCallable<Unit>) : Boolean
    {
       return false
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
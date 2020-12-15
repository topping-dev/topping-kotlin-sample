package dev.topping.kotlin

import kotlinx.cinterop.StableRef
import kotlinx.cinterop.staticCFunction
import kotlin.reflect.KCallable

actual open class LGView : KTInterface
{
   var lgView: cocoapods.toppingios.LGView? = null
   actual companion object {
        actual fun Create(lc: LuaContext?): LGView?
        {
            val pobj = LGView()
            val pres = cocoapods.toppingios.LGView.Create(lc?.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun GetViewById(lId: String?): LGView?
   {
       return KTWrap.Wrap(lgView?.GetViewById(lId)) as LGView?
   }
   actual fun SetEnabled(value: Boolean?)
   {
       lgView?.SetEnabled(value!!)
   }
   actual fun SetFocusable(value: Boolean?)
   {
       lgView?.SetFocusable(value!!)
   }
   actual fun SetBackground(background: String?)
   {
       lgView?.SetBackground(background)
   }
   actual fun SetBackgroundRef(backgroundRef: LuaRef?)
   {
       lgView?.SetBackgroundRef(backgroundRef?.GetNativeObject() as cocoapods.toppingios.LuaRef)
   }
   actual fun SetOnClickListener(func: KCallable<Unit>?)
   {
       val kt: KTWrap<Unit> = KTWrap<Unit>()
       val lt: cocoapods.toppingios.LuaTranslator = cocoapods.toppingios.LuaTranslator()
       lt.nobj = StableRef.create(kt).asCPointer()
       lt.kFRetF = kt.Init(this, func)
       lgView?.SetOnClickListener(lt)
   }
    open override fun GetNativeObject(): Any?
   {
       return lgView
   }
    open override fun SetNativeObject(par :Any?)
   {
       lgView = par as cocoapods.toppingios.LGView?
   }
}
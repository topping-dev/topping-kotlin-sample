package dev.topping.kotlin

import kotlinx.cinterop.StableRef
import kotlin.reflect.KCallable

actual open class LGButton : LGTextView()
{
   var lgButton: cocoapods.Topping.LGButton? = null
   actual companion object {
        actual fun Create(lc: LuaContext?): LGButton?
        {
            val pobj = LGButton()
            val pres = cocoapods.Topping.LGButton.Create(lc?.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }

    override fun SetOnClickListenerInternal(func: KCallable<Unit>): Boolean
    {
        val kt: KTWrap = KTWrap()
        val lt: cocoapods.Topping.LuaTranslator = cocoapods.Topping.LuaTranslator()
        lt.nobj = StableRef.create(kt).asCPointer()
        lt.kFRetF = kt.Init(this, func)
        lgButton?.SetOnClickListener(lt)
        return true
    }

    open override fun GetNativeObject(): Any?
   {
       return lgButton
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       //lgButton = par as cocoapods.Topping.LGButton?
   }
}
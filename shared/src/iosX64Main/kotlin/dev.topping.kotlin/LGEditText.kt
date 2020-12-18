package dev.topping.kotlin

import kotlinx.cinterop.StableRef
import kotlinx.cinterop.staticCFunction
import kotlin.reflect.KCallable

actual open class LGEditText : LGTextView()
{
   var lgEditText: cocoapods.Topping.LGEditText? = null
   actual companion object {
        actual fun Create(lc: LuaContext?): LGEditText?
        {
            val pobj = LGEditText()
            val pres = cocoapods.Topping.LGEditText.Create(lc?.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
    actual fun SetTextChangedListener(func: KCallable<Unit>?)
    {
        val kt: KTWrap<Unit> = KTWrap<Unit>()
        val lt: cocoapods.Topping.LuaTranslator = cocoapods.Topping.LuaTranslator()
        lt.nobj = StableRef.create(kt).asCPointer()
        lt.kFRetF = kt.Init(this, func)
        lgEditText?.SetTextChangedListener(lt)
    }
    actual fun SetBeforeTextChangedListener(func: KCallable<Unit>?)
    {
        val kt: KTWrap<Unit> = KTWrap<Unit>()
        val lt: cocoapods.Topping.LuaTranslator = cocoapods.Topping.LuaTranslator()
        lt.nobj = StableRef.create(kt).asCPointer()
        lt.kFRetF = kt.Init(this, func)
        lgEditText?.SetBeforeTextChangedListener(lt)
    }
    actual fun SetAfterTextChangedListener(func: KCallable<Unit>?)
    {
        val kt: KTWrap<Unit> = KTWrap<Unit>()
        val lt: cocoapods.Topping.LuaTranslator = cocoapods.Topping.LuaTranslator()
        lt.nobj = StableRef.create(kt).asCPointer()
        lt.kFRetF = kt.Init(this, func)
        lgEditText?.SetAfterTextChangedListener(lt)
    }
    open override fun GetNativeObject(): Any?
   {
       return lgEditText
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgEditText = par as cocoapods.Topping.LGEditText?
   }
}
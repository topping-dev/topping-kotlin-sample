package dev.topping.kotlin

import kotlinx.cinterop.StableRef
import kotlinx.cinterop.staticCFunction
import kotlin.reflect.KCallable

actual open class LGCheckBox : LGCompoundButton()
{
   var lgCheckBox: cocoapods.toppingios.LGCheckBox? = null
   actual companion object {
        actual fun Create(lc: LuaContext?): LGCheckBox?
        {
            val pobj = LGCheckBox()
            val pres = cocoapods.toppingios.LGCheckBox.Create(lc?.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun SetOnCheckedChangedListener(func: KCallable<Unit>?)
   {
       val kt: KTWrap<Unit> = KTWrap<Unit>()
       val lt: cocoapods.toppingios.LuaTranslator = cocoapods.toppingios.LuaTranslator()
       lt.nobj = StableRef.create(kt).asCPointer()
       lt.kFRetF = kt.Init(this, func)
       lgCheckBox?.SetOnCheckedChangedListener(lt)
   }
    open override fun GetNativeObject(): Any?
   {
       return lgCheckBox
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgCheckBox = par as cocoapods.toppingios.LGCheckBox?
   }
}
package dev.topping.kotlin

import kotlinx.cinterop.StableRef
import kotlinx.cinterop.staticCFunction
import kotlin.reflect.KCallable

actual open class LGRadioGroup : LGLinearLayout()
{
   var lgRadioGroup: cocoapods.toppingios.LGRadioGroup? = null
   actual companion object {
        actual fun Create(lc: LuaContext?): LGRadioGroup?
        {
            val pobj = LGRadioGroup()
            val pres = cocoapods.toppingios.LGRadioGroup.Create(lc?.luaContext)
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
       lgRadioGroup?.SetOnCheckedChangedListener(lt)
   }
   override open fun GetNativeObject(): cocoapods.toppingios.LGRadioGroup?
   {
       return lgRadioGroup
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgRadioGroup = par as cocoapods.toppingios.LGRadioGroup?
   }
}
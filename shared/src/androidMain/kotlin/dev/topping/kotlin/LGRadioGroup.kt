package dev.topping.kotlin

import kotlin.reflect.KCallable

actual open class LGRadioGroup : LGLinearLayout()
{
   var lgRadioGroup: android.widget.LGRadioGroup? = null
   actual companion object {
        actual fun Create(lc: LuaContext?): LGRadioGroup?
        {
            val pobj = LGRadioGroup()
            val pres = android.widget.LGRadioGroup.Create(lc?.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun SetOnCheckedChangedListener(func: KCallable<Unit>?)
   {
       val kt: KTWrap<Unit> = KTWrap<Unit>()
       val lt: dev.topping.android.LuaTranslator = dev.topping.android.LuaTranslator(kt, kt.Init(this, func))
       lgRadioGroup?.SetOnCheckedChangedListener(lt)
   }
   override open fun GetNativeObject(): android.widget.LGRadioGroup?
   {
       return lgRadioGroup
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgRadioGroup = par as android.widget.LGRadioGroup?
   }
}
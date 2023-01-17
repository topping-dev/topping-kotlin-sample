package dev.topping.kotlin

import kotlinx.cinterop.StableRef

actual open class LGRadioGroup : LGLinearLayout()
{
   var lgRadioGroup: cocoapods.Topping.LGRadioGroup? = null
   actual companion object {
        actual fun Create(lc: LuaContext): LGRadioGroup {
            val pobj = LGRadioGroup()
            val pres = cocoapods.Topping.LGRadioGroup.Create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun SetOnCheckedChangedListener(func: ((Int, Boolean) -> Unit)?)
   {
       val kt: KTWrap = KTWrap()
       val lt: cocoapods.Topping.LuaTranslator = cocoapods.Topping.LuaTranslator()
       lt.nobj = StableRef.create(kt).asCPointer()
       lt.kFRetF = kt.Init(this, func)
       lgRadioGroup?.SetOnCheckedChangedListener(lt)
   }
   override open fun GetNativeObject(): cocoapods.Topping.LGRadioGroup?
   {
       return lgRadioGroup
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgRadioGroup = par as cocoapods.Topping.LGRadioGroup?
   }
}
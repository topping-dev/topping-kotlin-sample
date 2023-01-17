package dev.topping.kotlin

import kotlin.reflect.KCallable

actual open class LGTabLayout : LGFrameLayout()
{
   var lgTabLayout: cocoapods.Topping.LGTabLayout? = null
   actual companion object {
        /*actual fun Create(lc: LuaContext?): LGTabLayout?
        {
            val pobj = LGTabLayout()
            val pres = cocoapods.ToppingLGTabLayout(lc?.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }*/
   }
    actual fun SetTabSelectedListener(func: ((LGTabLayout, LuaTab) -> Unit)?) {
        lgTabLayout?.SetTabSelectedListener(func.toLuaTranslator(this))
    }
    open override fun GetNativeObject(): Any?
   {
       return lgTabLayout
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgTabLayout = par as cocoapods.Topping.LGTabLayout?
   }
}
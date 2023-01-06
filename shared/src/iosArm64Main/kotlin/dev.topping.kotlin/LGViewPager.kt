package dev.topping.kotlin

import kotlin.reflect.KCallable

actual open class LGViewPager : LGViewGroup()
{
   var lgViewPager: cocoapods.Topping.LGViewPager? = null
   actual companion object {
        actual fun Create(lc: LuaContext): LGViewPager {
            val pobj = LGViewPager()
            val pres = cocoapods.Topping.LGViewPager.Create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
    actual fun SetAdapter(lgFragmentStateAdapter: LGFragmentStateAdapter) {
        lgViewPager?.SetAdapter(lgFragmentStateAdapter.lgFragmentStateAdapter)
    }
    actual fun SetTabLayout(lgTabLayout: LGTabLayout, func: KCallable<LuaTab>) {
        lgViewPager?.SetTabLayout(lgTabLayout.lgTabLayout, func.toLuaTranslator(this))
    }
    open override fun GetNativeObject(): Any?
   {
       return lgViewPager
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgViewPager = par as cocoapods.Topping.LGViewPager?
   }
}
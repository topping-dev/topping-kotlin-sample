package dev.topping.kotlin

actual open class LGViewPager : LGViewGroup()
{
   var lgViewPager: android.widget.LGViewPager? = null
   actual companion object {
        actual fun Create(lc: LuaContext): LGViewPager {
            val pobj = LGViewPager()
            val pres = android.widget.LGViewPager.Create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
    actual fun SetAdapter(lgFragmentStateAdapter: LGFragmentStateAdapter) {
        lgViewPager?.SetAdapter(lgFragmentStateAdapter.lgFragmentStateAdapter)
    }
    actual fun SetTabLayout(lgTabLayout: LGTabLayout, func: (Int) -> LuaTab) {
        lgViewPager?.SetTabLayout(lgTabLayout.lgTabLayout, func.toLuaTranslator(null))
    }
    open override fun GetNativeObject(): Any?
   {
       return lgViewPager
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgViewPager = par as android.widget.LGViewPager?
   }
}
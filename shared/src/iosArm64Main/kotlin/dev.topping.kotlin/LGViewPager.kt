package dev.topping.kotlin

actual open class LGViewPager : LGViewGroup()
{
   var lgViewPager: cocoapods.Topping.LGViewPager? = null
   actual companion object {
        actual fun create(lc: LuaContext): LGViewPager {
            val pobj = LGViewPager()
            val pres = cocoapods.Topping.LGViewPager.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
    actual fun setAdapter(lgFragmentStateAdapter: LGFragmentStateAdapter) {
        lgViewPager?.setAdapter(lgFragmentStateAdapter.lgFragmentStateAdapter)
    }
    actual fun setTabLayout(lgTabLayout: LGTabLayout, func: (Int) -> LuaTab) {
        lgViewPager?.setTabLayout(lgTabLayout.lgTabLayout, func.toLuaTranslator(null))
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
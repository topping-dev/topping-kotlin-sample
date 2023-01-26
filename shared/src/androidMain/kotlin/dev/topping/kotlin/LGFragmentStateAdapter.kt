package dev.topping.kotlin

actual open class LGFragmentStateAdapter : KTInterface
{
   var lgFragmentStateAdapter: android.widget.LGFragmentStateAdapter? = null
   actual companion object {
       actual fun createFromForm(form: LuaForm): LGFragmentStateAdapter? {
           val pobj = LGFragmentStateAdapter()
           val pres = android.widget.LGFragmentStateAdapter.createFromForm(form.luaForm)
           pobj.SetNativeObject(pres)
           return pobj
       }
       actual fun createFromFragment(fragment: LuaFragment): LGFragmentStateAdapter? {
           val pobj = LGFragmentStateAdapter()
           val pres = android.widget.LGFragmentStateAdapter.createFromFragment(fragment.luaFragment)
           pobj.SetNativeObject(pres)
           return pobj
       }
        actual fun create(lc: LuaContext, fragmentManager: LuaFragmentManager, lifecycle: LuaLifecycle): LGFragmentStateAdapter?
        {
            val pobj = LGFragmentStateAdapter()
            val pres = android.widget.LGFragmentStateAdapter.create(lc.luaContext, fragmentManager.luaFragmentManager, lifecycle.luaLifecycle)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
    actual fun setCreateFragment(func: (Int) -> LuaFragment) {
        lgFragmentStateAdapter?.setCreateFragment(func.toLuaTranslator(null))
    }
    actual fun setGetItemCount(func: () -> Int) {
        lgFragmentStateAdapter?.setGetItemCount(func.toLuaTranslator(null))
    }
    open override fun GetNativeObject(): Any?
   {
       return lgFragmentStateAdapter
   }
    open override fun SetNativeObject(par :Any?)
   {
       lgFragmentStateAdapter = par as android.widget.LGFragmentStateAdapter?
   }
}
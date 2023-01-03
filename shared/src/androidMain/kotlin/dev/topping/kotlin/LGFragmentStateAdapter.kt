package dev.topping.kotlin

actual open class LGFragmentStateAdapter : KTInterface
{
   var lgFragmentStateAdapter: android.widget.LGFragmentStateAdapter? = null
   actual companion object {
       actual fun CreateFromForm(form: LuaForm): LGFragmentStateAdapter? {
           val pobj = LGFragmentStateAdapter()
           val pres = android.widget.LGFragmentStateAdapter.CreateFromForm(form.luaForm)
           pobj.SetNativeObject(pres)
           return pobj
       }
       actual fun CreateFromFragment(fragment: LuaFragment): LGFragmentStateAdapter? {
           val pobj = LGFragmentStateAdapter()
           val pres = android.widget.LGFragmentStateAdapter.CreateFromFragment(fragment.luaFragment)
           pobj.SetNativeObject(pres)
           return pobj
       }
        actual fun Create(lc: LuaContext, fragmentManager: LuaFragmentManager, lifecycle: LuaLifecycle): LGFragmentStateAdapter?
        {
            val pobj = LGFragmentStateAdapter()
            val pres = android.widget.LGFragmentStateAdapter.Create(lc.luaContext, fragmentManager.luaFragmentManager, lifecycle.luaLifecycle)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
    actual fun SetCreateFragment(ltCreateFragment: LuaTranslator) {
        lgFragmentStateAdapter?.SetCreateFragment(ltCreateFragment.luaTranslator)
    }
    actual fun SetGetItemCount(ltGetItemCount: LuaTranslator) {
        lgFragmentStateAdapter?.SetGetItemCount(ltGetItemCount.luaTranslator)
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
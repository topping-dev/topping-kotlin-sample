package dev.topping.kotlin

import kotlin.reflect.KCallable

actual open class LGFragmentStateAdapter : KTInterface
{
    var lgFragmentStateAdapter: cocoapods.Topping.LGFragmentStateAdapter? = null
    actual companion object {
        actual fun CreateFromForm(form: LuaForm): LGFragmentStateAdapter? {

            val pobj = LGFragmentStateAdapter()
            val pres = cocoapods.Topping.LGFragmentStateAdapter.CreateFromForm(form.luaForm)
            pobj.SetNativeObject(pres)
            return pobj
        }
        actual fun CreateFromFragment(fragment: LuaFragment): LGFragmentStateAdapter? {
            val pobj = LGFragmentStateAdapter()
            val pres = cocoapods.Topping.LGFragmentStateAdapter.CreateFromFragment(fragment.luaFragment)
            pobj.SetNativeObject(pres)
            return pobj
        }
        actual fun Create(lc: LuaContext, fragmentManager: LuaFragmentManager, lifecycle: LuaLifecycle): LGFragmentStateAdapter?
        {
            val pobj = LGFragmentStateAdapter()
            val pres = cocoapods.Topping.LGFragmentStateAdapter.Create(lc.luaContext, fragmentManager.luaFragmentManager, lifecycle.luaLifecycle)
            pobj.SetNativeObject(pres)
            return pobj
        }
    }
    actual fun SetCreateFragment(func: KCallable<LuaFragment>) {
        lgFragmentStateAdapter?.SetCreateFragment(func.toLuaTranslator(this))
    }
    actual fun SetGetItemCount(func: KCallable<Int>) {
        lgFragmentStateAdapter?.SetGetItemCount(func.toLuaTranslator(this))
    }
    open override fun GetNativeObject(): Any?
    {
        return lgFragmentStateAdapter
    }
    open override fun SetNativeObject(par :Any?)
    {
        lgFragmentStateAdapter = par as cocoapods.Topping.LGFragmentStateAdapter?
    }
}
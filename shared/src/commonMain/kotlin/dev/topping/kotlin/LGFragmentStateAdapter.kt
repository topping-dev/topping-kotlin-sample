package dev.topping.kotlin

import kotlin.reflect.KCallable

expect open class LGFragmentStateAdapter : KTInterface
{
   companion object {
        fun CreateFromForm(form: LuaForm): LGFragmentStateAdapter?
       fun CreateFromFragment(fragment: LuaFragment): LGFragmentStateAdapter?
       fun Create(lc: LuaContext, fragmentManager: LuaFragmentManager, lifecycle: LuaLifecycle): LGFragmentStateAdapter?
   }

    fun SetCreateFragment(func: KCallable<LuaFragment>)
    fun SetGetItemCount(func: KCallable<Int>)
}
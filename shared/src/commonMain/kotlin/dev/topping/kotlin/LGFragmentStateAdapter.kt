package dev.topping.kotlin

expect open class LGFragmentStateAdapter : KTInterface
{
   companion object {
        fun CreateFromForm(form: LuaForm): LGFragmentStateAdapter?
       fun CreateFromFragment(fragment: LuaFragment): LGFragmentStateAdapter?
       fun Create(lc: LuaContext, fragmentManager: LuaFragmentManager, lifecycle: LuaLifecycle): LGFragmentStateAdapter?
   }

    fun SetCreateFragment(func: (Int) -> LuaFragment)
    fun SetGetItemCount(func: () -> Int)
}
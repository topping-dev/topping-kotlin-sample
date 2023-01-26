package dev.topping.kotlin

expect open class LGFragmentStateAdapter : KTInterface
{
   companion object {
        fun createFromForm(form: LuaForm): LGFragmentStateAdapter?
       fun createFromFragment(fragment: LuaFragment): LGFragmentStateAdapter?
       fun create(lc: LuaContext, fragmentManager: LuaFragmentManager, lifecycle: LuaLifecycle): LGFragmentStateAdapter?
   }

    fun setCreateFragment(func: (Int) -> LuaFragment)
    fun setGetItemCount(func: () -> Int)
}
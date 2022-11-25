package dev.topping.kotlin

expect open class LuaAppBarConfiguration
{
   companion object {
      fun create(singleTop: Boolean, popUpTo: LuaRef, popUpToInclusive: Boolean,
                 enterAnim: LuaRef, exitAnim: LuaRef,
                 popEnterAnim: LuaRef, popExitAnim: LuaRef
      ): LuaAppBarConfiguration
   }
   fun setTopLevelDestinations(ids: Array<LuaRef>)
}
package dev.topping.kotlin

expect open class LuaNavOptions
{
   companion object {
      fun create(singleTop: Boolean, popUpTo: LuaRef, popUpToInclusive: Boolean,
                 enterAnim: LuaRef, exitAnim: LuaRef,
                 popEnterAnim: LuaRef, popExitAnim: LuaRef): LuaNavOptions
   }
}
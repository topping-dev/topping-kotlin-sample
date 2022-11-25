package dev.topping.kotlin

expect open class LuaNavController
{
   fun navigate(target: LuaRef)
   fun navigate(target: LuaRef, args: Map<String, Any>)
   fun navigate(target: LuaRef, args: Map<String, Any>, navOptions: LuaNavOptions)
   fun navigateUp()
}
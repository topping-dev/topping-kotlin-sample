package dev.topping.kotlin

expect open class LuaLifecycle
{
   fun addObserver(luaLifecycleObserver: LuaLifecycleObserver)
   fun removeObserver(luaLifecycleObserver: LuaLifecycleObserver)
   fun launch(func: () -> Unit)
   fun launch(dispatcher: Int, func: () -> Unit)
}
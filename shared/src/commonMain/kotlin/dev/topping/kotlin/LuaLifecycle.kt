package dev.topping.kotlin

import kotlin.reflect.KCallable

expect open class LuaLifecycle
{
   fun addObserver(luaLifecycleObserver: LuaLifecycleObserver)
   fun removeObserver(luaLifecycleObserver: LuaLifecycleObserver)
   fun launch(func: KCallable<Unit>)
   fun launch(dispatcher: Int, func: KCallable<Unit>)
}
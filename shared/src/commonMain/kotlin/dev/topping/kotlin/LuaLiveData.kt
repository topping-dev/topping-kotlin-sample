package dev.topping.kotlin

import kotlin.reflect.KCallable

expect open class LuaLiveData
{
   companion object {
        fun create(): LuaLiveData
   }
   fun observe(owner:LuaLifecycleOwner, func: KCallable<Unit>)
   fun removeObserver(func: KCallable<Unit>)
   fun getValue():Any?
}
package dev.topping.kotlin

import kotlin.reflect.KCallable

expect open class LuaMutableLiveData
{
   companion object {
        fun create(): LuaMutableLiveData
   }
   fun observe(owner:LuaLifecycleOwner, func: KCallable<Unit>?)
   fun removeObserver(func: KCallable<Unit>?)
    fun setValue(value: Any?)
    fun postValue(value: Any?)
}
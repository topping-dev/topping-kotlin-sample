package dev.topping.kotlin

expect open class LuaLiveData
{
   companion object {
        fun create(): LuaLiveData
   }
   fun observe(owner:LuaLifecycleOwner, func: (LuaLiveData, Any) -> Unit)
   fun removeObserver(func: (LuaLiveData, Any) -> Unit)
   fun getValue():Any?
}
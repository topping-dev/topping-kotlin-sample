package dev.topping.kotlin

expect open class LuaMutableLiveData : LuaLiveData
{
   companion object {
        fun create(): LuaMutableLiveData
   }
    fun setValue(value: Any?)
    fun postValue(value: Any?)
}
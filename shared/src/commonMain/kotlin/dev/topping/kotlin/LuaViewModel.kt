package dev.topping.kotlin

expect open class LuaViewModel() {
   fun setObject(key: String, obj: Any?)
   fun getObject(key: String) : Any?
   protected val viewModelScope: LuaCoroutineScope
}
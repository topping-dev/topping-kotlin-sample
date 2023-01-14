package dev.topping.kotlin

expect open class LuaViewModel() {
   fun SetObject(key: String, obj: Any?)
   fun GetObject(key: String) : Any?
   protected val viewModelScope: LuaCoroutineScope
}
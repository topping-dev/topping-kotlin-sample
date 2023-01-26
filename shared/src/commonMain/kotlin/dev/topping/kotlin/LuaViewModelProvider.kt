package dev.topping.kotlin

expect open class LuaViewModelProvider
{
   companion object {
      fun of(fragment: LuaFragment): LuaViewModelProvider
      fun of(form: LuaForm): LuaViewModelProvider
   }

   fun get(key: String): LuaViewModel
   inline fun <reified T:Any> get(key: String, obj: T): T
}
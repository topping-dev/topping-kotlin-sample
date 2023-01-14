package dev.topping.kotlin

expect open class LuaViewModelProvider
{
   companion object {
      fun Of(fragment: LuaFragment): LuaViewModelProvider
      fun Of(form: LuaForm): LuaViewModelProvider
   }

   fun Get(key: String): LuaViewModel
   inline fun <reified T:Any> Get(key: String, obj: T): T
}
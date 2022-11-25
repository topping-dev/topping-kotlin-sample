package dev.topping.kotlin

expect open class LuaViewModelProvider
{
   companion object {
      fun OfFragment(fragment: LuaFragment): LuaViewModelProvider
      fun OfForm(form: LuaForm): LuaViewModelProvider
   }

   fun Get(tag: String): LuaViewModel
}
package dev.topping.kotlin

expect open class LuaFragmentManager
{
   companion object {
      fun findFragment(view: LGView) : LuaFragment?
   }
   fun findFragmentById(id: Any) : LuaFragment?
   fun findFragmentByTag(tag: String) : LuaFragment?
}
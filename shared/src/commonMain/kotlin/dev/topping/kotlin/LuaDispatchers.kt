package dev.topping.kotlin

expect open class LuaDispatchers
{
   companion object {
      val DEFAULT: Int
      val MAIN: Int
      val UNCONFINED: Int
      val IO: Int
   }
}
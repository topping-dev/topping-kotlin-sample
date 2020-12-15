package dev.topping.kotlin

expect open class LuaContext
{
   companion object {
        fun CreateLuaContext(context: Any?): LuaContext?
   }
}
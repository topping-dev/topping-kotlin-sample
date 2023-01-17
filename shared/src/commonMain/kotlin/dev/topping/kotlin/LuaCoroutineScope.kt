package dev.topping.kotlin

expect open class LuaCoroutineScope
{
   fun launch(func: () -> Unit): LuaJob
   fun launch(dispatcher: Int, func: () -> Unit): LuaJob
}
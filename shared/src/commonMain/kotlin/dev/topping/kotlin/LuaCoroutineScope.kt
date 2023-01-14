package dev.topping.kotlin

import kotlin.reflect.KCallable

expect open class LuaCoroutineScope
{
   fun launch(func: KCallable<Unit>): LuaJob
   fun launch(dispatcher: Int, func: KCallable<Unit>): LuaJob
}
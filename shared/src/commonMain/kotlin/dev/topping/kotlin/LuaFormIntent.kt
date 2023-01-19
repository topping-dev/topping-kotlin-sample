package dev.topping.kotlin

expect class LuaFormIntent
{
    fun getBundle() : LuaBundle
    fun setFlags(flags: Int)
}
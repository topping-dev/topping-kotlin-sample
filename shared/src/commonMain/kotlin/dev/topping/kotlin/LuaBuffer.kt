package dev.topping.kotlin

expect open class LuaBuffer
{
   companion object {
        fun create(capacity: Int): LuaBuffer
   }
   fun getByte(index: Int): Int?
   fun setByte(index: Int, value: Int)
}
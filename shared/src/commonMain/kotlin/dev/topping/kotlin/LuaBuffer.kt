package dev.topping.kotlin

expect open class LuaBuffer
{
   companion object {
        fun Create(capacity: Int): LuaBuffer
   }
   fun GetByte(index: Int): Int?
   fun SetByte(index: Int, value: Int)
}
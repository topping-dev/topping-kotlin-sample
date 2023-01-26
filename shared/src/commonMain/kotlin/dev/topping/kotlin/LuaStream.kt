package dev.topping.kotlin

expect open class LuaStream
{
   fun getStream(): LuaObjectStore?
   fun setStream(stream: LuaObjectStore?)
   fun readOne(): Int?
   fun read(bufferO: LuaBuffer, offset: Int, length: Int)
   fun writeOne(oneByte: Int)
   fun write(bufferO: LuaBuffer, offset: Int, length: Int)
}
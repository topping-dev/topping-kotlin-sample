package dev.topping.kotlin

expect open class LuaStream
{
   fun GetStream(): LuaObjectStore?
   fun SetStream(stream: LuaObjectStore?)
   fun ReadOne(): Int?
   fun Read(bufferO: LuaBuffer?, offset: Int?, length: Int?)
   fun WriteOne(oneByte: Int?)
   fun Write(bufferO: LuaBuffer?, offset: Int?, length: Int?)
}
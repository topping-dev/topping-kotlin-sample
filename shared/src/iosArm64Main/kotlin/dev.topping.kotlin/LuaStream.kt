package dev.topping.kotlin

actual open class LuaStream : KTInterface
{
   var luaStream: cocoapods.Topping.LuaStream? = null
   actual fun getStream(): LuaObjectStore?
   {
       val pobj = LuaObjectStore()
       val obj = luaStream?.getStream()
       pobj.SetNativeObject(obj)
       return pobj
   }
   actual fun setStream(stream: LuaObjectStore?)
   {
       luaStream?.setStream(stream?.luaObjectStore)
   }
   actual fun readOne(): Int?
   {
       return luaStream?.readOne()
   }
   actual fun read(bufferO: LuaBuffer, offset: Int, length: Int)
   {
       luaStream?.read(bufferO.luaBuffer, offset, length)
   }
   actual fun writeOne(oneByte: Int)
   {
       luaStream?.writeOne(oneByte)
   }
   actual fun write(bufferO: LuaBuffer, offset: Int, length: Int)
   {
       luaStream?.write(bufferO.luaBuffer, offset, length)
   }
    open override fun GetNativeObject(): Any?
   {
       return luaStream
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaStream = par as cocoapods.Topping.LuaStream?
   }
}
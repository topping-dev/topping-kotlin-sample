package dev.topping.kotlin

actual open class LuaStream : KTInterface
{
   var luaStream: cocoapods.Topping.LuaStream? = null
   actual fun GetStream(): LuaObjectStore?
   {
       val pobj = LuaObjectStore()
       val obj = luaStream?.GetStream()
       pobj.SetNativeObject(obj)
       return pobj
   }
   actual fun SetStream(stream: LuaObjectStore?)
   {
       luaStream?.SetStream(stream?.luaObjectStore)
   }
   actual fun ReadOne(): Int?
   {
       return luaStream?.ReadOne()
   }
   actual fun Read(bufferO: LuaBuffer?, offset: Int?, length: Int?)
   {
       luaStream?.Read(bufferO?.luaBuffer, offset!!, length!!)
   }
   actual fun WriteOne(oneByte: Int?)
   {
       luaStream?.WriteOne(oneByte!!)
   }
   actual fun Write(bufferO: LuaBuffer?, offset: Int?, length: Int?)
   {
       luaStream?.Write(bufferO?.luaBuffer, offset!!, length!!)
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
package dev.topping.kotlin

actual open class LuaBuffer : KTInterface
{
   var luaBuffer: cocoapods.Topping.LuaBuffer? = null
   actual companion object {
        actual fun Create(capacity: Int): LuaBuffer {
            val pobj = LuaBuffer()
            val pres = cocoapods.Topping.LuaBuffer.Create(capacity)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun GetByte(index: Int): Int?
   {
       return luaBuffer?.GetByte(index)
   }
   actual fun SetByte(index: Int, value: Int)
   {
       luaBuffer?.SetByte(index, value)
   }
    open override fun GetNativeObject(): Any?
   {
       return luaBuffer
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaBuffer = par as cocoapods.Topping.LuaBuffer?
   }
}
package dev.topping.kotlin

actual open class LuaBuffer : KTInterface
{
   var luaBuffer: dev.topping.android.LuaBuffer? = null
   actual companion object {
        actual fun create(capacity: Int): LuaBuffer {
            val pobj = LuaBuffer()
            val pres = dev.topping.android.LuaBuffer.create(capacity)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun getByte(index: Int): Int?
   {
       return luaBuffer?.getByte(index)
   }
   actual fun setByte(index: Int, value: Int)
   {
       luaBuffer?.setByte(index, value)
   }
    open override fun GetNativeObject(): Any?
   {
       return luaBuffer
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaBuffer = par as dev.topping.android.LuaBuffer?
   }
}
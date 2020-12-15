package dev.topping.kotlin

actual open class LuaPoint : KTInterface
{
   var luaPoint: dev.topping.android.LuaPoint? = null
   actual companion object {
        actual fun CreatePoint(): LuaPoint?
        {
            val pobj = LuaPoint()
            val pres = dev.topping.android.LuaPoint.CreatePoint()
            pobj.SetNativeObject(pres)
            return pobj
        }
        actual fun CreatePointPar(x: Float?, y: Float?): LuaPoint?
        {
            val pobj = LuaPoint()
            val pres = dev.topping.android.LuaPoint.CreatePointPar(x, y)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun Set(x: Float?, y: Float?)
   {
       luaPoint?.Set(x, y)
   }
   actual fun GetX(): Float?
   {
       return luaPoint?.GetX()
   }
   actual fun GetY(): Float?
   {
       return luaPoint?.GetY()
   }
    open override fun GetNativeObject(): Any?
   {
       return luaPoint
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaPoint = par as dev.topping.android.LuaPoint?
   }
}
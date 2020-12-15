package dev.topping.kotlin

actual open class LuaMapCircle : KTInterface
{
   var luaMapCircle: dev.topping.android.LuaMapCircle? = null
   actual fun SetCenter(center: LuaPoint?)
   {
       luaMapCircle?.SetCenter(center?.luaPoint)
   }
   actual fun SetCenterEx(x: Double, y: Double)
   {
       luaMapCircle?.SetCenterEx(x, y)
   }
   actual fun SetRadius(radius: Double)
   {
       luaMapCircle?.SetRadius(radius)
   }
   actual fun SetStrokeColor(color: LuaColor?)
   {
       luaMapCircle?.SetStrokeColor(color?.luaColor)
   }
   actual fun SetStrokeColorEx(color: Int)
   {
       luaMapCircle?.SetStrokeColorEx(color)
   }
   actual fun SetStrokeWidth(width: Double)
   {
       luaMapCircle?.SetStrokeWidth(width)
   }
   actual fun SetFillColor(color: LuaColor?)
   {
       luaMapCircle?.SetFillColor(color?.luaColor)
   }
   actual fun SetFillColorEx(color: Int)
   {
       luaMapCircle?.SetFillColorEx(color)
   }
   actual fun SetZIndex(index: Double)
   {
       luaMapCircle?.SetZIndex(index)
   }
    open override fun GetNativeObject(): Any?
   {
       return luaMapCircle
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaMapCircle = par as dev.topping.android.LuaMapCircle?
   }
}
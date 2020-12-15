package dev.topping.kotlin

expect open class LuaMapCircle
{
   fun SetCenter(center: LuaPoint?)
   fun SetCenterEx(x: Double, y: Double)
   fun SetRadius(radius: Double)
   fun SetStrokeColor(color: LuaColor?)
   fun SetStrokeColorEx(color: Int)
   fun SetStrokeWidth(width: Double)
   fun SetFillColor(color: LuaColor?)
   fun SetFillColorEx(color: Int)
   fun SetZIndex(index: Double)
}
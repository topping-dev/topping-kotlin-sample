package dev.topping.kotlin

expect open class LuaMapImage
{
   fun SetBearing(bearing: Float)
   fun SetDimensions(width: Float)
   fun SetDimensionsEx(width: Float, height: Float)
   fun SetPosition(point: LuaPoint?)
   fun SetPositionEx(x: Float, y: Float)
   fun SetTransparency(transperency: Float)
   fun SetVisible(value: Boolean)
   fun SetZIndex(index: Float)
}
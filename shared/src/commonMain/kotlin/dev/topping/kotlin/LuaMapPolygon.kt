package dev.topping.kotlin

expect open class LuaMapPolygon
{
   fun SetFillColor(color: LuaColor?)
   fun SetStrokeColor(color: LuaColor?)
   fun SetStrokeWidth(value: Float)
   fun SetVisible(value: Boolean)
   fun SetZIndex(value: Float)
}
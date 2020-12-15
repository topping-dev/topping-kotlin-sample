package dev.topping.kotlin

expect open class LuaMapPolyline
{
   fun SetColor(color: LuaColor?)
   fun SetWidth(value: Float)
   fun SetVisible(value: Boolean)
   fun SetZIndex(value: Float)
}
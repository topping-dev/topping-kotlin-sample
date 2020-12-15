package dev.topping.kotlin

expect open class LuaMapMarker
{
   fun SetDraggable(draggable: Boolean)
   fun SetPosition(point: LuaPoint?)
   fun SetPositionEx(x: Double, y: Double)
   fun SetSnippet(value: String?)
   fun SetTitle(value: String?)
   fun SetVisible(value: Boolean)
}
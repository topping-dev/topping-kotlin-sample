package dev.topping.kotlin

actual open class LuaMapMarker : KTInterface
{
   var luaMapMarker: cocoapods.toppingios.LuaMapMarker? = null
   actual fun SetDraggable(draggable: Boolean)
   {
       luaMapMarker?.SetDraggable(draggable)
   }
   actual fun SetPosition(point: LuaPoint?)
   {
       luaMapMarker?.SetPosition(point?.luaPoint)
   }
   actual fun SetPositionEx(x: Double, y: Double)
   {
       luaMapMarker?.SetPositionEx(x.toFloat(), y.toFloat())
   }
   actual fun SetSnippet(value: String?)
   {
       luaMapMarker?.SetSnippet(value)
   }
   actual fun SetTitle(value: String?)
   {
       luaMapMarker?.SetTitle(value)
   }
   actual fun SetVisible(value: Boolean)
   {
       luaMapMarker?.SetVisible(value)
   }
    open override fun GetNativeObject(): Any?
   {
       return luaMapMarker
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaMapMarker = par as cocoapods.toppingios.LuaMapMarker?
   }
}
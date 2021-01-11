package dev.topping.kotlin

actual open class LuaMapPolyline : KTInterface
{
   var luaMapPolyline: cocoapods.Topping.LuaMapPolyline? = null
   actual fun SetColor(color: LuaColor?)
   {
       luaMapPolyline?.SetColor(color?.luaColor)
   }
   actual fun SetWidth(value: Float)
   {
       luaMapPolyline?.SetWidth(value.toDouble())
   }
   actual fun SetVisible(value: Boolean)
   {
       luaMapPolyline?.SetVisible(value)
   }
   actual fun SetZIndex(value: Float)
   {
       luaMapPolyline?.SetZIndex(value.toDouble())
   }
    open override fun GetNativeObject(): Any?
   {
       return luaMapPolyline
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaMapPolyline = par as cocoapods.Topping.LuaMapPolyline?
   }
}
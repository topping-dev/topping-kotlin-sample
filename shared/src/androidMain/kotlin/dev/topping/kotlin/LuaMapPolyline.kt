package dev.topping.kotlin

actual open class LuaMapPolyline : KTInterface
{
   var luaMapPolyline: dev.topping.android.LuaMapPolyline? = null
   actual fun SetColor(color: LuaColor?)
   {
       luaMapPolyline?.SetColor(color?.luaColor)
   }
   actual fun SetWidth(value: Float)
   {
       luaMapPolyline?.SetWidth(value)
   }
   actual fun SetVisible(value: Boolean)
   {
       luaMapPolyline?.SetVisible(value)
   }
   actual fun SetZIndex(value: Float)
   {
       luaMapPolyline?.SetZIndex(value)
   }
    open override fun GetNativeObject(): Any?
   {
       return luaMapPolyline
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaMapPolyline = par as dev.topping.android.LuaMapPolyline?
   }
}
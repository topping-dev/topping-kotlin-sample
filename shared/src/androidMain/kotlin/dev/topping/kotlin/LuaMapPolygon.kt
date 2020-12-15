package dev.topping.kotlin

actual open class LuaMapPolygon : KTInterface
{
   var luaMapPolygon: dev.topping.android.LuaMapPolygon? = null
   actual fun SetFillColor(color: LuaColor?)
   {
       luaMapPolygon?.SetFillColor(color?.luaColor)
   }
   actual fun SetStrokeColor(color: LuaColor?)
   {
       luaMapPolygon?.SetStrokeColor(color?.luaColor)
   }
   actual fun SetStrokeWidth(value: Float)
   {
       luaMapPolygon?.SetStrokeWidth(value)
   }
   actual fun SetVisible(value: Boolean)
   {
       luaMapPolygon?.SetVisible(value)
   }
   actual fun SetZIndex(value: Float)
   {
       luaMapPolygon?.SetZIndex(value)
   }
    open override fun GetNativeObject(): Any?
   {
       return luaMapPolygon
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaMapPolygon = par as dev.topping.android.LuaMapPolygon?
   }
}
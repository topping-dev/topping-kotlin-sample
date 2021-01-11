package dev.topping.kotlin

actual open class LuaMapPolygon : KTInterface
{
   var luaMapPolygon: cocoapods.Topping.LuaMapPolygon? = null
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
       luaMapPolygon?.SetStrokeWidth(value.toDouble())
   }
   actual fun SetVisible(value: Boolean)
   {
       luaMapPolygon?.SetVisible(value)
   }
   actual fun SetZIndex(value: Float)
   {
       luaMapPolygon?.SetZIndex(value.toDouble())
   }
    open override fun GetNativeObject(): Any?
   {
       return luaMapPolygon
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaMapPolygon = par as cocoapods.Topping.LuaMapPolygon?
   }
}
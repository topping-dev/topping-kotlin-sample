package dev.topping.kotlin

actual open class LuaMapImage : KTInterface
{
   var luaMapImage: cocoapods.Topping.LuaMapImage? = null
   actual fun SetBearing(bearing: Float)
   {
       luaMapImage?.SetBearing(bearing)
   }
   actual fun SetDimensions(width: Float)
   {
       luaMapImage?.SetDimensions(width)
   }
   actual fun SetDimensionsEx(width: Float, height: Float)
   {
       luaMapImage?.SetDimensionsEx(width, height)
   }
   actual fun SetPosition(point: LuaPoint?)
   {
       luaMapImage?.SetPosition(point?.luaPoint)
   }
   actual fun SetPositionEx(x: Float, y: Float)
   {
       luaMapImage?.SetPositionEx(x, y)
   }
   actual fun SetTransparency(transperency: Float)
   {
       luaMapImage?.SetTransparency(transperency)
   }
   actual fun SetVisible(value: Boolean)
   {
       luaMapImage?.SetVisible(value)
   }
   actual fun SetZIndex(index: Float)
   {
       luaMapImage?.SetZIndex(index)
   }
    open override fun GetNativeObject(): Any?
   {
       return luaMapImage
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaMapImage = par as cocoapods.Topping.LuaMapImage?
   }
}
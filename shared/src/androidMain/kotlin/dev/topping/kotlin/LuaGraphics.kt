package dev.topping.kotlin

actual open class LuaGraphics : KTInterface
{
   var luaGraphics: dev.topping.android.LuaGraphics? = null
   actual fun SetPen(r: Int, g: Int, b: Int)
   {
       luaGraphics?.SetPen(r, g, b)
   }
   actual fun SetPenEx(r: Int, g: Int, b: Int, width: Float)
   {
       luaGraphics?.SetPenEx(r, g, b, width)
   }
   actual fun SetBrush(type: Int, r: Int, g: Int, b: Int)
   {
       luaGraphics?.SetBrush(type, r, g, b)
   }
   actual fun SetRectStore(id: Int, x: Int, y: Int, width: Int, height: Int)
   {
       luaGraphics?.SetRectStore(id, x, y, width, height)
   }
   actual fun DrawEllipsePenRectCache()
   {
       luaGraphics?.DrawEllipsePenRectCache()
   }
   actual fun DrawEllipseRectCache(r: Int, g: Int, b: Int)
   {
       luaGraphics?.DrawEllipseRectCache(r, g, b)
   }
   actual fun DrawEllipseRectCacheEx(r: Int, g: Int, b: Int, width: Float)
   {
       luaGraphics?.DrawEllipseRectCacheEx(r, g, b, width)
   }
   actual fun DrawEllipsePenCache(x: Int, y: Int, width: Int, height: Int)
   {
       luaGraphics?.DrawEllipsePenCache(x, y, width, height)
   }
   actual fun DrawEllipse(r: Int, g: Int, b: Int, x: Int, y: Int, width: Int, height: Int)
   {
       luaGraphics?.DrawEllipse(r, g, b, x, y, width, height)
   }
   actual fun DrawEllipseEx(r: Int, g: Int, b: Int, penWidth: Float, x: Int, y: Int, width: Int, height: Int)
   {
       luaGraphics?.DrawEllipseEx(r, g, b, penWidth, x, y, width, height)
   }
   actual fun DrawCirclePenCache(x: Int, y: Int, radius: Int)
   {
       luaGraphics?.DrawCirclePenCache(x, y, radius)
   }
   actual fun DrawCircle(r: Int, g: Int, b: Int, x: Int, y: Int, radius: Int)
   {
       luaGraphics?.DrawCircle(r, g, b, x, y, radius)
   }
   actual fun DrawCircleEx(r: Int, g: Int, b: Int, width: Float, x: Int, y: Int, radius: Int)
   {
       luaGraphics?.DrawCircleEx(r, g, b, width, x, y, radius)
   }
   actual fun DrawIcon(i: String?, x: Int, y: Int)
   {
       luaGraphics?.DrawIcon(i, x, y)
   }
   actual fun DrawImage(i: String?, x: Int, y: Int)
   {
       luaGraphics?.DrawImage(i, x, y)
   }
   actual fun DrawImageRectCacheEx(i: String?, srcX: Int, srcY: Int, srcWidth: Int, srcHeight: Int, rL: Int, gL: Int, bL: Int, rH: Int, gH: Int, bH: Int)
   {
       luaGraphics?.DrawImageRectCacheEx(i, srcX, srcY, srcWidth, srcHeight, rL, gL, bL, rH, gH, bH)
   }
   actual fun DrawImageRectCache(i: String?)
   {
       luaGraphics?.DrawImageRectCache(i)
   }
   actual fun DrawImageEx(i: String?, x: Int, y: Int, srcX: Int, srcY: Int, srcWidth: Int, srcHeight: Int)
   {
       luaGraphics?.DrawImageEx(i, x, y, srcX, srcY, srcWidth, srcHeight)
   }
   actual fun DrawLine(r: Int, g: Int, b: Int, x1: Int, y1: Int, x2: Int, y2: Int)
   {
       luaGraphics?.DrawLine(r, g, b, x1, y1, x2, y2)
   }
   actual fun DrawLineEx(r: Int, g: Int, b: Int, width: Float, x1: Int, y1: Int, x2: Int, y2: Int)
   {
       luaGraphics?.DrawLineEx(r, g, b, width, x1, y1, x2, y2)
   }
   actual fun DrawLinePenCache(x1: Int, y1: Int, x2: Int, y2: Int)
   {
       luaGraphics?.DrawLinePenCache(x1, y1, x2, y2)
   }
   actual fun DrawLines(r: Int, g: Int, b: Int, points: String?)
   {
       luaGraphics?.DrawLines(r, g, b, points)
   }
   actual fun DrawLinesEx(r: Int, g: Int, b: Int, width: Float, points: String?)
   {
       luaGraphics?.DrawLinesEx(r, g, b, width, points)
   }
   actual fun DrawLinesPenCache(points: String?)
   {
       luaGraphics?.DrawLinesPenCache(points)
   }
   actual fun DrawPolygon(r: Int, g: Int, b: Int, points: String?)
   {
       luaGraphics?.DrawPolygon(r, g, b, points)
   }
   actual fun DrawPolygonEx(r: Int, g: Int, b: Int, width: Float, points: String?)
   {
       luaGraphics?.DrawPolygonEx(r, g, b, width, points)
   }
   actual fun DrawPolygonPenCache(points: String?)
   {
       luaGraphics?.DrawPolygonPenCache(points)
   }
   actual fun DrawRectangle(r: Int, g: Int, b: Int, x: Int, y: Int, width: Int, height: Int)
   {
       luaGraphics?.DrawRectangle(r, g, b, x, y, width, height)
   }
   actual fun DrawRectangleEx(r: Int, g: Int, b: Int, widthP: Float, x: Int, y: Int, width: Int, height: Int)
   {
       luaGraphics?.DrawRectangleEx(r, g, b, widthP, x, y, width, height)
   }
   actual fun DrawRectangleRectCache(r: Int, g: Int, b: Int)
   {
       luaGraphics?.DrawRectangleRectCache(r, g, b)
   }
   actual fun DrawRectangleRectCacheEx(r: Int, g: Int, b: Int, width: Float)
   {
       luaGraphics?.DrawRectangleRectCacheEx(r, g, b, width)
   }
   actual fun DrawRectanglePenCache(x: Int, y: Int, width: Int, height: Int)
   {
       luaGraphics?.DrawRectanglePenCache(x, y, width, height)
   }
   actual fun DrawRectanglePenRectCache()
   {
       luaGraphics?.DrawRectanglePenRectCache()
   }
   actual fun DrawString(s: String?, f: String?, size: Float, style: Int, x: Float, y: Float, valign: Int, halign: Int, flags: Int)
   {
       luaGraphics?.DrawString(s, f, size, style, x, y, valign, halign, flags)
   }
   actual fun FillEllipse(x: Int, y: Int, width: Int, height: Int)
   {
       luaGraphics?.FillEllipse(x, y, width, height)
   }
   actual fun FillPolygon(points: String?)
   {
       luaGraphics?.FillPolygon(points)
   }
   actual fun FillRectangle(x: Int, y: Int, width: Int, height: Int)
   {
       luaGraphics?.FillRectangle(x, y, width, height)
   }
   actual fun FillRegion()
   {
       luaGraphics?.FillRegion()
   }
   actual fun Clear(red: Int, green: Int, blue: Int)
   {
       luaGraphics?.Clear(red, green, blue)
   }
   actual fun SetClip(x: Int, y: Int, width: Int, height: Int)
   {
       luaGraphics?.SetClip(x, y, width, height)
   }
    open override fun GetNativeObject(): Any?
   {
       return luaGraphics
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaGraphics = par as dev.topping.android.LuaGraphics?
   }
}
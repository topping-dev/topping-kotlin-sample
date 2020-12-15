package dev.topping.kotlin

expect open class LuaGraphics
{
   fun SetPen(r: Int, g: Int, b: Int)
   fun SetPenEx(r: Int, g: Int, b: Int, width: Float)
   fun SetBrush(type: Int, r: Int, g: Int, b: Int)
   fun SetRectStore(id: Int, x: Int, y: Int, width: Int, height: Int)
   fun DrawEllipsePenRectCache()
   fun DrawEllipseRectCache(r: Int, g: Int, b: Int)
   fun DrawEllipseRectCacheEx(r: Int, g: Int, b: Int, width: Float)
   fun DrawEllipsePenCache(x: Int, y: Int, width: Int, height: Int)
   fun DrawEllipse(r: Int, g: Int, b: Int, x: Int, y: Int, width: Int, height: Int)
   fun DrawEllipseEx(r: Int, g: Int, b: Int, penWidth: Float, x: Int, y: Int, width: Int, height: Int)
   fun DrawCirclePenCache(x: Int, y: Int, radius: Int)
   fun DrawCircle(r: Int, g: Int, b: Int, x: Int, y: Int, radius: Int)
   fun DrawCircleEx(r: Int, g: Int, b: Int, width: Float, x: Int, y: Int, radius: Int)
   fun DrawIcon(i: String?, x: Int, y: Int)
   fun DrawImage(i: String?, x: Int, y: Int)
   fun DrawImageRectCacheEx(i: String?, srcX: Int, srcY: Int, srcWidth: Int, srcHeight: Int, rL: Int, gL: Int, bL: Int, rH: Int, gH: Int, bH: Int)
   fun DrawImageRectCache(i: String?)
   fun DrawImageEx(i: String?, x: Int, y: Int, srcX: Int, srcY: Int, srcWidth: Int, srcHeight: Int)
   fun DrawLine(r: Int, g: Int, b: Int, x1: Int, y1: Int, x2: Int, y2: Int)
   fun DrawLineEx(r: Int, g: Int, b: Int, width: Float, x1: Int, y1: Int, x2: Int, y2: Int)
   fun DrawLinePenCache(x1: Int, y1: Int, x2: Int, y2: Int)
   fun DrawLines(r: Int, g: Int, b: Int, points: String?)
   fun DrawLinesEx(r: Int, g: Int, b: Int, width: Float, points: String?)
   fun DrawLinesPenCache(points: String?)
   fun DrawPolygon(r: Int, g: Int, b: Int, points: String?)
   fun DrawPolygonEx(r: Int, g: Int, b: Int, width: Float, points: String?)
   fun DrawPolygonPenCache(points: String?)
   fun DrawRectangle(r: Int, g: Int, b: Int, x: Int, y: Int, width: Int, height: Int)
   fun DrawRectangleEx(r: Int, g: Int, b: Int, widthP: Float, x: Int, y: Int, width: Int, height: Int)
   fun DrawRectangleRectCache(r: Int, g: Int, b: Int)
   fun DrawRectangleRectCacheEx(r: Int, g: Int, b: Int, width: Float)
   fun DrawRectanglePenCache(x: Int, y: Int, width: Int, height: Int)
   fun DrawRectanglePenRectCache()
   fun DrawString(s: String?, f: String?, size: Float, style: Int, x: Float, y: Float, valign: Int, halign: Int, flags: Int)
   fun FillEllipse(x: Int, y: Int, width: Int, height: Int)
   fun FillPolygon(points: String?)
   fun FillRectangle(x: Int, y: Int, width: Int, height: Int)
   fun FillRegion()
   fun Clear(red: Int, green: Int, blue: Int)
   fun SetClip(x: Int, y: Int, width: Int, height: Int)
}
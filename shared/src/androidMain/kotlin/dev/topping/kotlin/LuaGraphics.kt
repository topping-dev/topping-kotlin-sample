package dev.topping.kotlin

actual open class LuaGraphics : KTInterface
{
   var luaGraphics: dev.topping.android.LuaGraphics? = null
   actual fun setPen(r: Int, g: Int, b: Int)
   {
       luaGraphics?.setPen(r, g, b)
   }
   actual fun setPenEx(r: Int, g: Int, b: Int, width: Float)
   {
       luaGraphics?.setPenEx(r, g, b, width)
   }
   actual fun setBrush(type: Int, r: Int, g: Int, b: Int)
   {
       luaGraphics?.setBrush(type, r, g, b)
   }
   actual fun setRectStore(id: Int, x: Int, y: Int, width: Int, height: Int)
   {
       luaGraphics?.setRectStore(id, x, y, width, height)
   }
   actual fun drawEllipsePenRectCache()
   {
       luaGraphics?.drawEllipsePenRectCache()
   }
   actual fun drawEllipseRectCache(r: Int, g: Int, b: Int)
   {
       luaGraphics?.drawEllipseRectCache(r, g, b)
   }
   actual fun drawEllipseRectCacheEx(r: Int, g: Int, b: Int, width: Float)
   {
       luaGraphics?.drawEllipseRectCacheEx(r, g, b, width)
   }
   actual fun drawEllipsePenCache(x: Int, y: Int, width: Int, height: Int)
   {
       luaGraphics?.drawEllipsePenCache(x, y, width, height)
   }
   actual fun drawEllipse(r: Int, g: Int, b: Int, x: Int, y: Int, width: Int, height: Int)
   {
       luaGraphics?.drawEllipse(r, g, b, x, y, width, height)
   }
   actual fun drawEllipseEx(r: Int, g: Int, b: Int, penWidth: Float, x: Int, y: Int, width: Int, height: Int)
   {
       luaGraphics?.drawEllipseEx(r, g, b, penWidth, x, y, width, height)
   }
   actual fun drawCirclePenCache(x: Int, y: Int, radius: Int)
   {
       luaGraphics?.drawCirclePenCache(x, y, radius)
   }
   actual fun drawCircle(r: Int, g: Int, b: Int, x: Int, y: Int, radius: Int)
   {
       luaGraphics?.drawCircle(r, g, b, x, y, radius)
   }
   actual fun drawCircleEx(r: Int, g: Int, b: Int, width: Float, x: Int, y: Int, radius: Int)
   {
       luaGraphics?.drawCircleEx(r, g, b, width, x, y, radius)
   }
   actual fun drawIcon(i: String?, x: Int, y: Int)
   {
       luaGraphics?.drawIcon(i, x, y)
   }
   actual fun drawImage(i: String?, x: Int, y: Int)
   {
       luaGraphics?.drawImage(i, x, y)
   }
   actual fun drawImageRectCacheEx(i: String?, srcX: Int, srcY: Int, srcWidth: Int, srcHeight: Int, rL: Int, gL: Int, bL: Int, rH: Int, gH: Int, bH: Int)
   {
       luaGraphics?.drawImageRectCacheEx(i, srcX, srcY, srcWidth, srcHeight, rL, gL, bL, rH, gH, bH)
   }
   actual fun drawImageRectCache(i: String?)
   {
       luaGraphics?.drawImageRectCache(i)
   }
   actual fun drawImageEx(i: String?, x: Int, y: Int, srcX: Int, srcY: Int, srcWidth: Int, srcHeight: Int)
   {
       luaGraphics?.drawImageEx(i, x, y, srcX, srcY, srcWidth, srcHeight)
   }
   actual fun drawLine(r: Int, g: Int, b: Int, x1: Int, y1: Int, x2: Int, y2: Int)
   {
       luaGraphics?.drawLine(r, g, b, x1, y1, x2, y2)
   }
   actual fun drawLineEx(r: Int, g: Int, b: Int, width: Float, x1: Int, y1: Int, x2: Int, y2: Int)
   {
       luaGraphics?.drawLineEx(r, g, b, width, x1, y1, x2, y2)
   }
   actual fun drawLinePenCache(x1: Int, y1: Int, x2: Int, y2: Int)
   {
       luaGraphics?.drawLinePenCache(x1, y1, x2, y2)
   }
   actual fun drawLines(r: Int, g: Int, b: Int, points: String?)
   {
       luaGraphics?.drawLines(r, g, b, points)
   }
   actual fun drawLinesEx(r: Int, g: Int, b: Int, width: Float, points: String?)
   {
       luaGraphics?.drawLinesEx(r, g, b, width, points)
   }
   actual fun drawLinesPenCache(points: String?)
   {
       luaGraphics?.drawLinesPenCache(points)
   }
   actual fun drawPolygon(r: Int, g: Int, b: Int, points: String?)
   {
       luaGraphics?.drawPolygon(r, g, b, points)
   }
   actual fun drawPolygonEx(r: Int, g: Int, b: Int, width: Float, points: String?)
   {
       luaGraphics?.drawPolygonEx(r, g, b, width, points)
   }
   actual fun drawPolygonPenCache(points: String?)
   {
       luaGraphics?.drawPolygonPenCache(points)
   }
   actual fun drawRectangle(r: Int, g: Int, b: Int, x: Int, y: Int, width: Int, height: Int)
   {
       luaGraphics?.drawRectangle(r, g, b, x, y, width, height)
   }
   actual fun drawRectangleEx(r: Int, g: Int, b: Int, widthP: Float, x: Int, y: Int, width: Int, height: Int)
   {
       luaGraphics?.drawRectangleEx(r, g, b, widthP, x, y, width, height)
   }
   actual fun drawRectangleRectCache(r: Int, g: Int, b: Int)
   {
       luaGraphics?.drawRectangleRectCache(r, g, b)
   }
   actual fun drawRectangleRectCacheEx(r: Int, g: Int, b: Int, width: Float)
   {
       luaGraphics?.drawRectangleRectCacheEx(r, g, b, width)
   }
   actual fun drawRectanglePenCache(x: Int, y: Int, width: Int, height: Int)
   {
       luaGraphics?.drawRectanglePenCache(x, y, width, height)
   }
   actual fun drawRectanglePenRectCache()
   {
       luaGraphics?.drawRectanglePenRectCache()
   }
   actual fun drawString(s: String?, f: String?, size: Float, style: Int, x: Float, y: Float, valign: Int, halign: Int, flags: Int)
   {
       luaGraphics?.drawString(s, f, size, style, x, y, valign, halign, flags)
   }
   actual fun fillEllipse(x: Int, y: Int, width: Int, height: Int)
   {
       luaGraphics?.fillEllipse(x, y, width, height)
   }
   actual fun fillPolygon(points: String?)
   {
       luaGraphics?.fillPolygon(points)
   }
   actual fun fillRectangle(x: Int, y: Int, width: Int, height: Int)
   {
       luaGraphics?.fillRectangle(x, y, width, height)
   }
   actual fun fillRegion()
   {
       luaGraphics?.fillRegion()
   }
   actual fun clear(red: Int, green: Int, blue: Int)
   {
       luaGraphics?.clear(red, green, blue)
   }
   actual fun setClip(x: Int, y: Int, width: Int, height: Int)
   {
       luaGraphics?.setClip(x, y, width, height)
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
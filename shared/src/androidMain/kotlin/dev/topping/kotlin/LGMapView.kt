package dev.topping.kotlin

actual open class LGMapView : LGView()
{
   var lgMapView: android.widget.LGMapView? = null
   actual companion object {
        actual fun Create(lc: LuaContext?, apikey: String?): LGMapView?
        {
            val pobj = LGMapView()
            val pres = android.widget.LGMapView.Create(lc?.luaContext, apikey)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun AddCircle(geoLoc: LuaPoint?, radius: Double, strokeColor: LuaColor?, fillColor: LuaColor?): LuaMapCircle?
   {
       val pobj = LuaMapCircle()
       val obj = lgMapView?.AddCircle(geoLoc?.luaPoint, radius, strokeColor?.luaColor, fillColor?.luaColor)
       pobj.SetNativeObject(obj)
       return pobj
   }
   actual fun AddMarker(geoLoc: LuaPoint?, path: String?, icon: String?): LuaMapMarker?
   {
       val pobj = LuaMapMarker()
       val obj = lgMapView?.AddMarker(geoLoc?.luaPoint, path, icon)
       pobj.SetNativeObject(obj)
       return pobj
   }
   actual fun AddMarkerEx(geoLoc: LuaPoint?, path: String?, icon: String?, anchor: LuaPoint?): LuaMapMarker?
   {
       val pobj = LuaMapMarker()
       val obj = lgMapView?.AddMarkerEx(geoLoc?.luaPoint, path, icon, anchor?.luaPoint)
       pobj.SetNativeObject(obj)
       return pobj
   }
   actual fun AddImage(geoPoint: LuaPoint?, path: String?, icon: String?, width: Float): LuaMapImage?
   {
       val pobj = LuaMapImage()
       val obj = lgMapView?.AddImage(geoPoint?.luaPoint, path, icon, width)
       pobj.SetNativeObject(obj)
       return pobj
   }
   actual fun AddPolygon(points: HashMap<Int, LuaPoint>, strokeColor: LuaColor?, fillColor: LuaColor?): LuaMapPolygon?
   {
       val pobj = LuaMapPolygon()
       val obj = lgMapView?.AddPolygon(points as java.util.HashMap<Int, dev.topping.android.LuaPoint>, strokeColor?.luaColor, fillColor?.luaColor)
       pobj.SetNativeObject(obj)
       return pobj
   }
    open override fun GetNativeObject(): Any?
   {
       return lgMapView
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgMapView = par as android.widget.LGMapView?
   }
}
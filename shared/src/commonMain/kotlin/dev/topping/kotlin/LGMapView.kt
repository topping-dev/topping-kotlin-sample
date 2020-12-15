package dev.topping.kotlin

expect open class LGMapView : LGView
{
   companion object {
        fun Create(lc: LuaContext?, apikey: String?): LGMapView?
   }
   fun AddCircle(geoLoc: LuaPoint?, radius: Double, strokeColor: LuaColor?, fillColor: LuaColor?): LuaMapCircle?
   fun AddMarker(geoLoc: LuaPoint?, path: String?, icon: String?): LuaMapMarker?
   fun AddMarkerEx(geoLoc: LuaPoint?, path: String?, icon: String?, anchor: LuaPoint?): LuaMapMarker?
   fun AddImage(geoPoint: LuaPoint?, path: String?, icon: String?, width: Float): LuaMapImage?
   fun AddPolygon(points: HashMap<Int, LuaPoint>, strokeColor: LuaColor?, fillColor: LuaColor?): LuaMapPolygon?
}
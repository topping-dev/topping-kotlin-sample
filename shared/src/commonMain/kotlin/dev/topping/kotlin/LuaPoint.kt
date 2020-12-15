package dev.topping.kotlin

expect open class LuaPoint
{
   companion object {
        fun CreatePoint(): LuaPoint?
        fun CreatePointPar(x: Float?, y: Float?): LuaPoint?
   }
   fun Set(x: Float?, y: Float?)
   fun GetX(): Float?
   fun GetY(): Float?
}
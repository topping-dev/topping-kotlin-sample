package dev.topping.kotlin

expect open class LuaPoint
{
   companion object {
        fun createPoint(): LuaPoint
       fun createPointPar(x: Float, y: Float): LuaPoint
   }
   fun set(x: Float, y: Float)
   fun getX(): Float
    fun getY(): Float
}
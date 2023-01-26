package dev.topping.kotlin

expect open class LuaRect
{
   companion object {
        fun createRect(): LuaRect
       fun createRectPar(left: Float, top: Float, right: Float, bottom: Float): LuaRect
   }
   fun set(left: Float, top: Float, right: Float, bottom: Float)
   fun getLeft(): Float
    fun getRight(): Float
    fun getTop(): Float
    fun getBottom(): Float
}
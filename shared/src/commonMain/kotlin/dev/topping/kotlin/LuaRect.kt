package dev.topping.kotlin

expect open class LuaRect
{
   companion object {
        fun CreateRect(): LuaRect?
        fun CreateRectPar(left: Float?, top: Float?, right: Float?, bottom: Float?): LuaRect?
   }
   fun Set(left: Float?, top: Float?, right: Float?, bottom: Float?)
   fun GetLeft(): Float?
   fun GetRight(): Float?
   fun GetTop(): Float?
   fun GetBottom(): Float?
}
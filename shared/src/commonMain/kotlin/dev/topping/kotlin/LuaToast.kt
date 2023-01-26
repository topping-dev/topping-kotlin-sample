package dev.topping.kotlin

expect open class LuaToast
{
   companion object {
        val TOAST_SHORT: Int
        val TOAST_LONG: Int
       fun show(context: LuaContext, text: LuaRef, duration: Int)
        fun show(context: LuaContext, text: String, duration: Int)
   }
}
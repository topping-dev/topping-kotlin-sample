package dev.topping.kotlin

expect open class LuaToast
{
   companion object {
        val TOAST_SHORT: Int
        val TOAST_LONG: Int
        fun Show(context: LuaContext?, text: String?, duration: Int?)
   }
}
package dev.topping.kotlin

actual open class LuaToast : KTInterface
{
   var luaToast: dev.topping.android.LuaToast? = null
   actual companion object {
        actual val TOAST_SHORT: Int = android.widget.Toast.LENGTH_SHORT
        actual val TOAST_LONG: Int = android.widget.Toast.LENGTH_LONG
       actual fun Show(context: LuaContext, text: LuaRef, duration: Int)
       {
           dev.topping.android.LuaToast.Show(context?.luaContext, text?.luaRef, duration)
       }
        actual fun Show(context: LuaContext, text: String, duration: Int)
        {
            dev.topping.android.LuaToast.ShowInternal(context?.luaContext, text, duration)
        }
   }
    open override fun GetNativeObject(): Any?
   {
       return luaToast
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaToast = par as dev.topping.android.LuaToast?
   }
}
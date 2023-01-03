package dev.topping.kotlin

actual open class LuaToast : KTInterface
{
   var luaToast: cocoapods.Topping.LuaToast? = null
   actual companion object {
        actual val TOAST_SHORT: Int = 2000
        actual val TOAST_LONG: Int = 5000
       actual fun Show(context: LuaContext?, text: LuaRef?, duration: Int?)
       {
           cocoapods.Topping.LuaToast.Show(context?.luaContext, text?.luaRef, duration!!)
       }
        actual fun Show(context: LuaContext?, text: String?, duration: Int?)
        {
            cocoapods.Topping.LuaToast.ShowInternal(context?.luaContext, text, duration!!)
        }
   }
    open override fun GetNativeObject(): Any?
   {
       return luaToast
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaToast = par as cocoapods.Topping.LuaToast?
   }
}
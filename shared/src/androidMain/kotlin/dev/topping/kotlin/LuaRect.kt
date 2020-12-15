package dev.topping.kotlin

actual open class LuaRect : KTInterface
{
   var luaRect: dev.topping.android.LuaRect? = null
   actual companion object {
        actual fun CreateRect(): LuaRect?
        {
            val pobj = LuaRect()
            val pres = dev.topping.android.LuaRect.CreateRect()
            pobj.SetNativeObject(pres)
            return pobj
        }
        actual fun CreateRectPar(left: Float?, top: Float?, right: Float?, bottom: Float?): LuaRect?
        {
            val pobj = LuaRect()
            val pres = dev.topping.android.LuaRect.CreateRectPar(left, top, right, bottom)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun Set(left: Float?, top: Float?, right: Float?, bottom: Float?)
   {
       luaRect?.Set(left, top, right, bottom)
   }
   actual fun GetLeft(): Float?
   {
       return luaRect?.GetLeft()
   }
   actual fun GetRight(): Float?
   {
       return luaRect?.GetRight()
   }
   actual fun GetTop(): Float?
   {
       return luaRect?.GetTop()
   }
   actual fun GetBottom(): Float?
   {
       return luaRect?.GetBottom()
   }
    open override fun GetNativeObject(): Any?
   {
       return luaRect
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaRect = par as dev.topping.android.LuaRect?
   }
}
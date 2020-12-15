package dev.topping.kotlin

actual open class LuaColor : KTInterface
{
   var luaColor: dev.topping.android.LuaColor? = null
   actual companion object {
        actual val BLACK: Int = 0xff000000.toInt()
        actual val BLUE: Int = 0xff0000ff.toInt()
        actual val CYAN: Int = 0xff00ffff.toInt()
        actual val DKGRAY: Int = 0xff444444.toInt()
        actual val GRAY: Int = 0xff888888.toInt()
        actual val GREEN: Int = 0xff00ff00.toInt()
        actual val LTGRAY: Int = 0xffcccccc.toInt()
        actual val MAGENTA: Int = 0xffff00ff.toInt()
        actual val RED: Int = 0xffff0000.toInt()
        actual val TRANSPARENT: Int = 0x00000000
        actual val WHITE: Int = 0xffffffff.toInt()
        actual val YELLOW: Int = 0xffffff00.toInt()
        actual fun FromString(colorStr: String?): LuaColor?
        {
            val pobj = LuaColor()
            val pres = dev.topping.android.LuaColor.FromString(colorStr)
            pobj.SetNativeObject(pres)
            return pobj
        }
        actual fun CreateFromARGB(alpha: Int, red: Int, green: Int, blue: Int): LuaColor?
        {
            val pobj = LuaColor()
            val pres = dev.topping.android.LuaColor.CreateFromARGB(alpha, red, green, blue)
            pobj.SetNativeObject(pres)
            return pobj
        }
        actual fun CreateFromRGB(red: Int, green: Int, blue: Int): LuaColor?
        {
            val pobj = LuaColor()
            val pres = dev.topping.android.LuaColor.CreateFromRGB(red, green, blue)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun GetColorValue(): Int?
   {
       return luaColor?.GetColorValue()
   }
    open override fun GetNativeObject(): Any?
   {
       return luaColor
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaColor = par as dev.topping.android.LuaColor?
   }
}
package dev.topping.kotlin

actual open class LGImageView : LGView()
{
   var lgImageView: android.widget.LGImageView? = null
   actual companion object {
        actual fun Create(lc: LuaContext, luaId: String): LGImageView {
            val pobj = LGImageView()
            val pres = android.widget.LGImageView.Create(lc?.luaContext, luaId)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun SetImage(stream: LuaStream?)
   {
       lgImageView?.SetImage(stream?.luaStream)
   }
   actual fun SetImageRef(ref: LuaRef?)
   {
       lgImageView?.SetImageRef(ref?.luaRef)
   }
    open override fun GetNativeObject(): Any?
   {
       return lgImageView
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgImageView = par as android.widget.LGImageView?
   }
}
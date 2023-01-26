package dev.topping.kotlin

actual open class LGImageView : LGView()
{
   var lgImageView: android.widget.LGImageView? = null
   actual companion object {
        actual fun create(lc: LuaContext, luaId: String): LGImageView {
            val pobj = LGImageView()
            val pres = android.widget.LGImageView.create(lc.luaContext, luaId)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun setImage(stream: LuaStream?)
   {
       lgImageView?.setImage(stream?.luaStream)
   }
   actual fun setImageRef(ref: LuaRef?)
   {
       lgImageView?.setImageRef(ref?.luaRef)
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
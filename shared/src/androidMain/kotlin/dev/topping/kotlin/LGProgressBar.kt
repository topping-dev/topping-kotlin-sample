package dev.topping.kotlin

actual open class LGProgressBar : LGView()
{
   var lgProgressBar: android.widget.LGProgressBar? = null
   actual companion object {
        actual fun create(lc: LuaContext): LGProgressBar {
            val pobj = LGProgressBar()
            val pres = android.widget.LGProgressBar.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun setProgress(v: Int)
   {
       lgProgressBar?.setProgress(v)
   }
   actual fun setMax(v: Int)
   {
       lgProgressBar?.setMax(v)
   }
   actual fun setIndeterminate(v: Boolean)
   {
       lgProgressBar?.setIndeterminate(v)
   }
    open override fun GetNativeObject(): Any?
   {
       return lgProgressBar
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgProgressBar = par as android.widget.LGProgressBar?
   }
}
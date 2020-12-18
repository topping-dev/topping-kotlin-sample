package dev.topping.kotlin

actual open class LGProgressBar : LGView()
{
   var lgProgressBar: cocoapods.Topping.LGProgressBar? = null
   actual companion object {
        actual fun Create(lc: LuaContext?): LGProgressBar?
        {
            val pobj = LGProgressBar()
            val pres = cocoapods.Topping.LGProgressBar.Create(lc?.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun SetProgress(v: Int?)
   {
       lgProgressBar?.SetProgress(v!!)
   }
   actual fun SetMax(v: Int?)
   {
       lgProgressBar?.SetMax(v!!)
   }
   actual fun SetIndeterminate(v: Boolean?)
   {
       lgProgressBar?.SetIndeterminate(v!!)
   }
    open override fun GetNativeObject(): Any?
   {
       return lgProgressBar
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgProgressBar = par as cocoapods.Topping.LGProgressBar?
   }
}
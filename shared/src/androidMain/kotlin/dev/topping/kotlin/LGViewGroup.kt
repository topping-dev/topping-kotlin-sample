package dev.topping.kotlin

actual open class LGViewGroup : LGView()
{
   var lgViewGroup: android.widget.LGViewGroup? = null
   actual companion object {
        actual fun create(lc: LuaContext): LGViewGroup {
            val pobj = LGViewGroup()
            val pres = android.widget.LGViewGroup.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   open override fun GetNativeObject(): Any?
   {
       return lgViewGroup
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgViewGroup = par as android.widget.LGViewGroup?
   }
}
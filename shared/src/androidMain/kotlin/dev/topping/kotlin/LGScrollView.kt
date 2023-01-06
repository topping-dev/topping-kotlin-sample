package dev.topping.kotlin

actual open class LGScrollView : LGFrameLayout()
{
   var lgScrollView: android.widget.LGScrollView? = null
   actual companion object {
        actual fun Create(lc: LuaContext): LGScrollView {
            val pobj = LGScrollView()
            val pres = android.widget.LGScrollView.Create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
    open override fun GetNativeObject(): Any?
   {
       return lgScrollView
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgScrollView = par as android.widget.LGScrollView?
   }
}
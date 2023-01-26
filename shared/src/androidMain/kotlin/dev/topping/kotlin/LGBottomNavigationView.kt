package dev.topping.kotlin

actual open class LGBottomNavigationView : LGFrameLayout()
{
   var lgBottomNavigationView: android.widget.LGBottomNavigationView? = null
   actual companion object {
        actual fun create(lc: LuaContext): LGBottomNavigationView {
            val pobj = LGBottomNavigationView()
            val pres = android.widget.LGBottomNavigationView.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
    actual fun setTabSelectedListener(func: ((LGBottomNavigationView, Int) -> Unit)?) {
        lgBottomNavigationView?.setTabSelectedListener(func.toLuaTranslator(this));
    }
    actual fun setCanSelectTab(func: ((LGBottomNavigationView, Int) -> Boolean)?) {
        lgBottomNavigationView?.setCanSelectTab(func.toLuaTranslator(this));
    }
    open override fun GetNativeObject(): Any?
   {
       return lgBottomNavigationView
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgBottomNavigationView = par as android.widget.LGBottomNavigationView?
   }
}
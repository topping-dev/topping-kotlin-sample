package dev.topping.kotlin

import kotlin.reflect.KCallable

actual open class LGBottomNavigationView : LGFrameLayout()
{
   var lgBottomNavigationView: cocoapods.Topping.LGBottomNavigationView? = null
   actual companion object {
        actual fun Create(lc: LuaContext): LGBottomNavigationView {
            val pobj = LGBottomNavigationView()
            val pres = cocoapods.Topping.LGBottomNavigationView.Create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
    actual fun SetTabSelectedListener(func: KCallable<Unit>?) {
        lgBottomNavigationView?.SetTabSelectedListener(func.toLuaTranslator(this));
    }
    actual fun SetCanSelectTab(func: KCallable<Boolean>?) {
        lgBottomNavigationView?.SetCanSelectTab(func.toLuaTranslator(this));
    }
    open override fun GetNativeObject(): Any?
   {
       return lgBottomNavigationView
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgBottomNavigationView = par as cocoapods.Topping.LGBottomNavigationView?
   }
}
package dev.topping.kotlin

actual open class LGAbsListView : LGViewGroup()
{
   var lgAbsListView: cocoapods.Topping.LGAbsListView? = null
   actual companion object {
        actual fun Create(lc: LuaContext?): LGAbsListView?
        {
            val pobj = LGAbsListView()
            val pres = cocoapods.Topping.LGAbsListView.Create(lc?.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }

    open override fun GetNativeObject(): Any? {
        return lgAbsListView
    }

    open override fun SetNativeObject(par: Any?) {
        super.SetNativeObject(par)
        lgAbsListView = par as cocoapods.Topping.LGAbsListView?
    }
}
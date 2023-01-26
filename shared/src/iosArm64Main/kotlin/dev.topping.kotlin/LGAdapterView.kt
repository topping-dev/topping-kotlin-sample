package dev.topping.kotlin

import platform.darwin.NSObject

actual open class LGAdapterView : KTInterface
{
   var lgAdapterView: cocoapods.Topping.LGAdapterView? = null
   actual companion object {
        actual fun create(lc: LuaContext, id: String): LGAdapterView {
            val pobj = LGAdapterView()
            val pres = cocoapods.Topping.LGAdapterView.create(lc.luaContext, id)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun addSection(header: String, id: String): LGAdapterView {
       val pobj = LGAdapterView()
       val obj = lgAdapterView?.addSection(header, id)
       pobj.SetNativeObject(obj)
       return pobj
   }
   actual fun removeSection(header: String)
   {
       lgAdapterView?.removeSection(header)
   }
   actual fun addValue(value: Any)
   {
       lgAdapterView?.addValue(value as NSObject)
   }
   actual fun removeValue(value: Any)
   {
       lgAdapterView?.removeValue(value as NSObject)
   }
   actual fun clear()
   {
       lgAdapterView?.clear()
   }
   actual fun setOnAdapterView(func: (LGAdapterView, LGView, Int, Any, LGView, LuaContext) -> LGView)
   {
       lgAdapterView?.setOnAdapterView(func.toLuaTranslator(this))
   }
    open override fun GetNativeObject(): Any?
   {
       return lgAdapterView
   }
        open override fun SetNativeObject(par :Any?)
   {
       lgAdapterView = par as cocoapods.Topping.LGAdapterView?
   }
}
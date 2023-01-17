package dev.topping.kotlin

import platform.darwin.NSObject

actual open class LGAdapterView : KTInterface
{
   var lgAdapterView: cocoapods.Topping.LGAdapterView? = null
   actual companion object {
        actual fun Create(lc: LuaContext, id: String): LGAdapterView {
            val pobj = LGAdapterView()
            val pres = cocoapods.Topping.LGAdapterView.Create(lc.luaContext, id)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun AddSection(header: String, id: String): LGAdapterView {
       val pobj = LGAdapterView()
       val obj = lgAdapterView?.AddSection(header, id)
       pobj.SetNativeObject(obj)
       return pobj
   }
   actual fun RemoveSection(header: String)
   {
       lgAdapterView?.RemoveSection(header)
   }
   actual fun AddValue(value: Any)
   {
       lgAdapterView?.AddValue(value as NSObject)
   }
   actual fun RemoveValue(value: Any)
   {
       lgAdapterView?.RemoveValue(value as NSObject)
   }
   actual fun Clear()
   {
       lgAdapterView?.Clear()
   }
   actual fun SetOnAdapterView(func: (LGAdapterView, LGView, Int, Any, LGView, LuaContext) -> LGView)
   {
       lgAdapterView?.SetOnAdapterView(func.toLuaTranslator(this))
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
package dev.topping.kotlin

import kotlin.reflect.KCallable

actual open class LGAdapterView : KTInterface
{
   var lgAdapterView: android.widget.LGAdapterView? = null
   actual companion object {
        actual fun Create(lc: LuaContext?, id: String?): LGAdapterView?
        {
            val pobj = LGAdapterView()
            val pres = android.widget.LGAdapterView.Create(lc?.luaContext, id)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun AddSection(header: String?, id: String?): LGAdapterView?
   {
       val pobj = LGAdapterView()
       val obj = lgAdapterView?.AddSection(header, id)
       pobj.SetNativeObject(obj)
       return pobj
   }
   actual fun RemoveSection(header: String?)
   {
       lgAdapterView?.RemoveSection(header)
   }
   actual fun AddValue(value: Any?)
   {
       lgAdapterView?.AddValue(value)
   }
   actual fun RemoveValue(value: Any?)
   {
       lgAdapterView?.RemoveValue(value)
   }
   actual fun Clear()
   {
       lgAdapterView?.Clear()
   }
   actual fun SetOnAdapterView(func: KCallable<Unit>?)
   {
       val kt: KTWrap<Unit> = KTWrap<Unit>()
       val lt: dev.topping.android.LuaTranslator = dev.topping.android.LuaTranslator(kt, kt.Init(this, func))
       lgAdapterView?.SetOnAdapterView(lt)
   }
    open override fun GetNativeObject(): Any?
   {
       return lgAdapterView
   }
        open override fun SetNativeObject(par :Any?)
   {
       lgAdapterView = par as android.widget.LGAdapterView?
   }
}
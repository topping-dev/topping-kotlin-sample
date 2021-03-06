package dev.topping.kotlin

import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.NativePlacement
import kotlinx.cinterop.objcPtr
import kotlinx.cinterop.*
import kotlinx.cinterop.staticCFunction
import platform.darwin.NSObject
import kotlin.reflect.KCallable

actual open class LGAdapterView : KTInterface
{
   var lgAdapterView: cocoapods.Topping.LGAdapterView? = null
   actual companion object {
        actual fun Create(lc: LuaContext?, id: String?): LGAdapterView?
        {
            val pobj = LGAdapterView()
            val pres = cocoapods.Topping.LGAdapterView.Create(lc?.luaContext, id)
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
   actual fun AddValue(id: Int?, value: Any?)
   {
       lgAdapterView?.AddValue(id!!, value as NSObject)
   }
   actual fun RemoveValue(id: Int?)
   {
       lgAdapterView?.RemoveValue(id!!)
   }
   actual fun Clear()
   {
       lgAdapterView?.Clear()
   }
   actual fun SetOnAdapterView(func: KCallable<Unit>?)
   {
       val kt: KTWrap = KTWrap()
       val lt: cocoapods.Topping.LuaTranslator = cocoapods.Topping.LuaTranslator()
       lt.nobj = StableRef.create(kt).asCPointer()
       lt.kFRetF = kt.Init(this, func)
       lgAdapterView?.SetOnAdapterView(lt)
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
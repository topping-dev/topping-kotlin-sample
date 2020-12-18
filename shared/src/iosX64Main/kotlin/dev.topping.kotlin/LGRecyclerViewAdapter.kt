package dev.topping.kotlin

import kotlinx.cinterop.StableRef
import kotlinx.cinterop.staticCFunction
import platform.darwin.NSObject
import kotlin.reflect.KCallable

actual open class LGRecyclerViewAdapter : KTInterface
{
   var lgRecyclerViewAdapter: cocoapods.Topping.LGRecyclerViewAdapter? = null
   actual companion object {
        actual fun Create(lc: LuaContext?, id: String?): LGRecyclerViewAdapter?
        {
            val pobj = LGRecyclerViewAdapter()
            val pres = cocoapods.Topping.LGRecyclerViewAdapter.Create(lc?.luaContext, id!!)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun AddValue(id: Int?, value: Any?)
   {
       lgRecyclerViewAdapter?.AddValue(id!!, value as NSObject)
   }
   actual fun RemoveValue(id: Int?)
   {
       lgRecyclerViewAdapter?.RemoveValue(id!!)
   }
   actual fun Clear()
   {
       lgRecyclerViewAdapter?.Clear()
   }
   actual fun Notify()
   {
       lgRecyclerViewAdapter?.Notify()
   }
   actual fun SetOnItemSelected(func: KCallable<Unit>?)
   {
       val kt: KTWrap<Unit> = KTWrap<Unit>()
       val lt: cocoapods.Topping.LuaTranslator = cocoapods.Topping.LuaTranslator()
       lt.nobj = StableRef.create(kt).asCPointer()
       lt.kFRetF = kt.Init(this, func)
       lgRecyclerViewAdapter?.SetOnItemSelected(lt)
   }
   actual fun SetOnCreateViewHolder(func: KCallable<Any>?)
   {
       val kt: KTWrap<Any> = KTWrap<Any>()
       val lt: cocoapods.Topping.LuaTranslator = cocoapods.Topping.LuaTranslator()
       lt.nobj = StableRef.create(kt).asCPointer()
       lt.kFRetF = kt.Init(this, func)
       lgRecyclerViewAdapter?.SetOnCreateViewHolder(lt)
   }
   actual fun SetOnBindViewHolder(func: KCallable<Unit>?)
   {
       val kt: KTWrap<Unit> = KTWrap<Unit>()
       val lt: cocoapods.Topping.LuaTranslator = cocoapods.Topping.LuaTranslator()
       lt.nobj = StableRef.create(kt).asCPointer()
       lt.kFRetF = kt.Init(this, func)
       lgRecyclerViewAdapter?.SetOnBindViewHolder(lt)
   }
   actual fun SetGetItemViewType(func: KCallable<Int>?)
   {
       val kt: KTWrap<Int> = KTWrap<Int>()
       val lt: cocoapods.Topping.LuaTranslator = cocoapods.Topping.LuaTranslator()
       lt.nobj = StableRef.create(kt).asCPointer()
       lt.kFRetF = kt.Init(this, func)
       lgRecyclerViewAdapter?.SetGetItemViewType(lt)
   }
    open override fun GetNativeObject(): Any?
   {
       return lgRecyclerViewAdapter
   }
    open override fun SetNativeObject(par :Any?)
   {
       lgRecyclerViewAdapter = par as cocoapods.Topping.LGRecyclerViewAdapter?
   }
}
package dev.topping.kotlin

import platform.darwin.NSObject
import kotlin.reflect.KCallable

actual open class LGRecyclerViewAdapter : KTInterface
{
   var lgRecyclerViewAdapter: cocoapods.Topping.LGRecyclerViewAdapter? = null
   actual companion object {
        actual fun Create(lc: LuaContext, id: String): LGRecyclerViewAdapter {
            val pobj = LGRecyclerViewAdapter()
            val pres = cocoapods.Topping.LGRecyclerViewAdapter.Create(lc.luaContext, id)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun AddValue(value: Any)
   {
       lgRecyclerViewAdapter?.AddValue(value as NSObject)
   }
   actual fun RemoveValue(value: Any)
   {
       lgRecyclerViewAdapter?.RemoveValue(value as NSObject)
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
       lgRecyclerViewAdapter?.SetOnItemSelected(func.toLuaTranslator(this))
   }
   actual fun SetOnCreateViewHolder(func: KCallable<Any>?)
   {
       lgRecyclerViewAdapter?.SetOnCreateViewHolder(func.toLuaTranslator(this))
   }
   actual fun SetOnBindViewHolder(func: KCallable<Unit>?)
   {
       lgRecyclerViewAdapter?.SetOnBindViewHolder(func.toLuaTranslator(this))
   }
   actual fun SetGetItemViewType(func: KCallable<Int>?)
   {
       lgRecyclerViewAdapter?.SetGetItemViewType(func.toLuaTranslator(this))
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
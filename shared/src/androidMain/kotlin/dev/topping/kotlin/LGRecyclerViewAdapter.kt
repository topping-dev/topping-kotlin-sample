package dev.topping.kotlin

import kotlin.reflect.KCallable

actual open class LGRecyclerViewAdapter : KTInterface
{
   var lgRecyclerViewAdapter: android.widget.LGRecyclerViewAdapter? = null
   actual companion object {
        actual fun Create(lc: LuaContext?, id: String?): LGRecyclerViewAdapter?
        {
            val pobj = LGRecyclerViewAdapter()
            val pres = android.widget.LGRecyclerViewAdapter.Create(lc?.luaContext, id)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun AddValue(id: Int?, value: Any?)
   {
       lgRecyclerViewAdapter?.AddValue(id, value)
   }
   actual fun RemoveValue(id: Int?)
   {
       lgRecyclerViewAdapter?.RemoveValue(id)
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
       val lt: dev.topping.android.LuaTranslator = dev.topping.android.LuaTranslator(kt, kt.Init(this, func))
       lgRecyclerViewAdapter?.SetOnItemSelected(lt)
   }
   actual fun SetOnCreateViewHolder(func: KCallable<Any>?)
   {
       val kt: KTWrap<Any> = KTWrap<Any>()
       val lt: dev.topping.android.LuaTranslator = dev.topping.android.LuaTranslator(kt, kt.Init(this, func))
       lgRecyclerViewAdapter?.SetOnCreateViewHolder(lt)
   }
   actual fun SetOnBindViewHolder(func: KCallable<Unit>?)
   {
       val kt: KTWrap<Unit> = KTWrap<Unit>()
       val lt: dev.topping.android.LuaTranslator = dev.topping.android.LuaTranslator(kt, kt.Init(this, func))
       lgRecyclerViewAdapter?.SetOnBindViewHolder(lt)
   }
   actual fun SetGetItemViewType(func: KCallable<Int>?)
   {
       val kt: KTWrap<Int> = KTWrap<Int>()
       val lt: dev.topping.android.LuaTranslator = dev.topping.android.LuaTranslator(kt, kt.Init(this, func))
       lgRecyclerViewAdapter?.SetGetItemViewType(lt)
   }
    open override fun GetNativeObject(): Any?
   {
       return lgRecyclerViewAdapter
   }
    open override fun SetNativeObject(par :Any?)
   {
       lgRecyclerViewAdapter = par as android.widget.LGRecyclerViewAdapter?
   }
}
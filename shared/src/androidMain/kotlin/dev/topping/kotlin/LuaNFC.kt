package dev.topping.kotlin

import kotlin.reflect.KCallable

open class LuaNFC : KTInterface
{
   var luaNFC: dev.topping.android.LuaNFC? = null
   fun SetOnTagReadListener(func: KCallable<Unit>?)
   {
       val kt: KTWrap<Unit> = KTWrap<Unit>()
       val lt: dev.topping.android.LuaTranslator = dev.topping.android.LuaTranslator(kt, kt.Init(this, func))
       luaNFC?.SetOnTagReadListener(lt)
   }
    open override fun GetNativeObject(): Any?
   {
       return luaNFC
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaNFC = par as dev.topping.android.LuaNFC?
   }
}
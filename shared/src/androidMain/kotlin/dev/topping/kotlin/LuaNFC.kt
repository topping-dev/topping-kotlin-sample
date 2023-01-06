package dev.topping.kotlin

import kotlin.reflect.KCallable

open class LuaNFC : KTInterface
{
   var luaNFC: dev.topping.android.LuaNFC? = null
   fun SetOnTagReadListener(func: KCallable<Unit>?)
   {
       luaNFC?.SetOnTagReadListener(func.toLuaTranslator(this))
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
package dev.topping.kotlin

open class LuaNFC : KTInterface
{
   var luaNFC: dev.topping.android.LuaNFC? = null
   fun SetOnTagReadListener(func: ((String) -> Unit)?)
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
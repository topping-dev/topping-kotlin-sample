package dev.topping.kotlin

actual open class LuaTranslator : KTInterface
{
   var luaTranslator: dev.topping.android.LuaTranslator? = null
   actual companion object {
        actual fun Register(obj: Any?, functionName: String?): LuaTranslator?
        {
            val pobj = LuaTranslator()
            val pres = dev.topping.android.LuaTranslator.Register(obj, functionName)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
    open override fun GetNativeObject(): Any?
   {
       return luaTranslator
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaTranslator = par as dev.topping.android.LuaTranslator?
   }
}
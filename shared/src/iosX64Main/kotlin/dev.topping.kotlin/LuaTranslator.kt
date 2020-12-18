package dev.topping.kotlin

actual open class LuaTranslator : KTInterface
{
   var luaTranslator: cocoapods.Topping.LuaTranslator? = null
   actual companion object {
        actual fun Register(obj: Any?, functionName: String?): LuaTranslator?
        {
            val pobj = LuaTranslator()
            return pobj
        }
   }
    open override fun GetNativeObject(): Any?
   {
       return luaTranslator
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaTranslator = par as cocoapods.Topping.LuaTranslator?
   }
}
package dev.topping.kotlin

expect open class LuaTranslator
{
   companion object {
        fun Register(obj: Any?, functionName: String?): LuaTranslator?
   }
}
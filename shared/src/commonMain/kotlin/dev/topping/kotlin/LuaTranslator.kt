package dev.topping.kotlin

expect open class LuaTranslator
{
   companion object {
        fun register(obj: Any?, functionName: String?): LuaTranslator?
   }
}
package dev.topping.kotlin

expect open class LuaRef
{
   companion object {
        fun withValue(key: String, obj: Any): LuaRef
        fun WithValue(key: String, obj: Any): LuaRef
        fun getRef(ctx: LuaContext?, id: String?): LuaRef?
   }
}
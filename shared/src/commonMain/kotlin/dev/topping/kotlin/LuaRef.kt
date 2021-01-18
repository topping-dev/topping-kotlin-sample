package dev.topping.kotlin

expect open class LuaRef
{
   companion object {
        fun WithValue(key: String, obj: Any): LuaRef
        fun GetRef(ctx: LuaContext?, id: String?): LuaRef?
   }
}
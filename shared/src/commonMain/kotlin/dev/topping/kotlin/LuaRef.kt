package dev.topping.kotlin

expect open class LuaRef
{
   companion object {
        fun GetRef(ctx: LuaContext?, id: String?): LuaRef?
   }
}
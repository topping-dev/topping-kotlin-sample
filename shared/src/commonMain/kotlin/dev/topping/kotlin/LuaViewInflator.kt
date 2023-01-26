package dev.topping.kotlin

expect open class LuaViewInflator
{
   companion object {
        fun create(lc: LuaContext): LuaViewInflator
   }
   fun parseFile(filename: String, parent: LGView?): LGView?
    fun inflate(id: LuaRef, parent: LGView?): LGView?
}
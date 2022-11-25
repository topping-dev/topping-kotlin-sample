package dev.topping.kotlin

expect open class LuaViewInflator
{
   companion object {
        fun Create(lc: LuaContext?): LuaViewInflator?
   }
   fun ParseFile(filename: String?, parent: LGView?): LGView?
    fun Inflate(id: LuaRef, parent: LGView?): LGView?
}
package dev.topping.kotlin

expect open class LuaNativeCall
{
   companion object {
        fun Call(self: Any?, func: String?, params: HashMap<Int?, Any?>?): LuaObjectStore?
   }
}
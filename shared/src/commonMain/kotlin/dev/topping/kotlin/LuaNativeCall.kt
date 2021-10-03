package dev.topping.kotlin

expect open class LuaNativeCall
{
   companion object {
        fun Call(obj: Any?, func: String?, params: ArrayList<Any?>?): LuaObjectStore?
        fun CallClass(cls: String?, func: String?, params: ArrayList<Any?>?): LuaObjectStore?
   }
}
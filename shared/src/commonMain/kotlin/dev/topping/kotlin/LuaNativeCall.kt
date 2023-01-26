package dev.topping.kotlin

expect open class LuaNativeCall
{
   companion object {
        fun call(obj: LuaNativeObject, func: String, params: ArrayList<Any?>): LuaObjectStore?
        fun callClass(cls: String, func: String, params: ArrayList<Any?>): LuaObjectStore?
   }
}
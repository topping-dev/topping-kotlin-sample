package dev.topping.kotlin

actual open class LuaObjectStore : KTInterface
{
   var luaObjectStore: cocoapods.Topping.LuaObjectStore? = null
    open override fun GetNativeObject(): Any?
   {
       return luaObjectStore
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaObjectStore = par as cocoapods.Topping.LuaObjectStore?
   }
}
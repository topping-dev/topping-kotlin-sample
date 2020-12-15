package dev.topping.kotlin

actual open class LuaDefines : KTInterface
{
   var luaDefines: dev.topping.android.LuaDefines? = null
    open override fun GetNativeObject(): Any?
   {
       return luaDefines
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaDefines = par as dev.topping.android.LuaDefines?
   }
}
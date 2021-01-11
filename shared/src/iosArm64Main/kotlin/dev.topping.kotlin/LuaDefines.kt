package dev.topping.kotlin

actual open class LuaDefines : KTInterface
{
   var luaDefines: cocoapods.Topping.LuaDefines? = null
    open override fun GetNativeObject(): Any?
   {
       return luaDefines
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaDefines = par as cocoapods.Topping.LuaDefines?
   }
}
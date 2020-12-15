package dev.topping.kotlin

actual open class LuaDefines : KTInterface
{
   var luaDefines: cocoapods.toppingios.LuaDefines? = null
    open override fun GetNativeObject(): Any?
   {
       return luaDefines
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaDefines = par as cocoapods.toppingios.LuaDefines?
   }
}
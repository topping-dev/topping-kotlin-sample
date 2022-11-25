package dev.topping.kotlin

actual open class LuaAppBarConfiguration : KTInterface
{
   var luaAppBarConfiguration: cocoapods.Topping.LuaAppBarConfiguration? = null
   actual companion object {
       actual fun create(singleTop: Boolean, popUpTo: LuaRef, popUpToInclusive: Boolean,
                  enterAnim: LuaRef, exitAnim: LuaRef,
                  popEnterAnim: LuaRef, popExitAnim: LuaRef
       ): LuaAppBarConfiguration
       {
           val pobj = LuaAppBarConfiguration()
           val pres = cocoapods.Topping.LuaAppBarConfiguration()
           pobj.SetNativeObject(pres)
           return pobj
       }
   }
   actual fun setTopLevelDestinations(ids: Array<LuaRef>)
   {
       luaAppBarConfiguration?.setTopLevelDestinations(ids.map {
           it.GetNativeObject() as cocoapods.Topping.LuaRef
       }.toMutableList())
   }
    open override fun GetNativeObject(): Any?
   {
       return luaAppBarConfiguration
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaAppBarConfiguration = par as cocoapods.Topping.LuaAppBarConfiguration?
   }
}
package dev.topping.kotlin

actual open class LuaAppBarConfiguration : KTInterface
{
   var luaAppBarConfiguration: dev.topping.android.LuaAppBarConfiguration? = null
   actual companion object {
       actual fun create(singleTop: Boolean, popUpTo: LuaRef, popUpToInclusive: Boolean,
                  enterAnim: LuaRef, exitAnim: LuaRef,
                  popEnterAnim: LuaRef, popExitAnim: LuaRef
       ): LuaAppBarConfiguration
       {
           val pobj = LuaAppBarConfiguration()
           val pres = dev.topping.android.LuaAppBarConfiguration.create(singleTop,
               popUpTo.GetNativeObject() as dev.topping.android.luagui.LuaRef, popUpToInclusive,
               enterAnim.GetNativeObject() as dev.topping.android.luagui.LuaRef,
               exitAnim.GetNativeObject() as dev.topping.android.luagui.LuaRef,
               popEnterAnim.GetNativeObject() as dev.topping.android.luagui.LuaRef,
               popExitAnim.GetNativeObject() as dev.topping.android.luagui.LuaRef)
           pobj.SetNativeObject(pres)
           return pobj
       }
   }
   actual fun setTopLevelDestinations(ids: Array<LuaRef>)
   {
       luaAppBarConfiguration?.setTopLevelDestinations(ids.map {
           it.GetNativeObject() as dev.topping.android.luagui.LuaRef
       }.toTypedArray())
   }
    open override fun GetNativeObject(): Any?
   {
       return luaAppBarConfiguration
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaAppBarConfiguration = par as dev.topping.android.LuaAppBarConfiguration?
   }
}
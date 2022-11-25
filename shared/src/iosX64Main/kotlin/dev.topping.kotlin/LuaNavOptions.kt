package dev.topping.kotlin

actual open class LuaNavOptions : KTInterface
{
   var luaNavOptions: cocoapods.Topping.NavOptions? = null

    actual companion object {
        actual fun create(
            singleTop: Boolean,
            popUpTo: LuaRef,
            popUpToInclusive: Boolean,
            enterAnim: LuaRef,
            exitAnim: LuaRef,
            popEnterAnim: LuaRef,
            popExitAnim: LuaRef
        ): LuaNavOptions {
            val pobj = LuaNavOptions()
            val pres = cocoapods.Topping.NavOptions.create(
                singleTop,
                KTWrap.Wrap(popUpTo.GetNativeObject()) as cocoapods.Topping.LuaRef,
                popUpToInclusive,
                KTWrap.Wrap(enterAnim.GetNativeObject()) as cocoapods.Topping.LuaRef,
                KTWrap.Wrap(exitAnim.GetNativeObject()) as cocoapods.Topping.LuaRef,
                KTWrap.Wrap(popEnterAnim.GetNativeObject()) as cocoapods.Topping.LuaRef,
                KTWrap.Wrap(popExitAnim.GetNativeObject()) as cocoapods.Topping.LuaRef,
            )
            pobj.SetNativeObject(pres)
            return pobj
        }

    }

    open override fun GetNativeObject(): Any?
    {
        return luaNavOptions
    }
    open override fun SetNativeObject(par :Any?)
    {
        luaNavOptions = par as cocoapods.Topping.NavOptions?
    }
}
package dev.topping.kotlin

actual open class LuaNavOptions : KTInterface
{
   var luaNavOptions: dev.topping.android.LuaNavOptions? = null

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
            val kt: KTWrap<Unit> = KTWrap()
            val pobj = LuaNavOptions()
            val pres = dev.topping.android.LuaNavOptions.create(
                singleTop,
                KTWrap.Wrap(popUpTo.GetNativeObject()) as dev.topping.android.luagui.LuaRef,
                popUpToInclusive,
                KTWrap.Wrap(enterAnim.GetNativeObject()) as dev.topping.android.luagui.LuaRef,
                KTWrap.Wrap(exitAnim.GetNativeObject()) as dev.topping.android.luagui.LuaRef,
                KTWrap.Wrap(popEnterAnim.GetNativeObject()) as dev.topping.android.luagui.LuaRef,
                KTWrap.Wrap(popExitAnim.GetNativeObject()) as dev.topping.android.luagui.LuaRef,
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
        luaNavOptions = par as dev.topping.android.LuaNavOptions?
    }
}
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
            val pobj = LuaNavOptions()
            val pres = dev.topping.android.LuaNavOptions.create(
                singleTop,
                popUpTo.luaRef!!,
                popUpToInclusive,
                enterAnim.luaRef!!,
                exitAnim.luaRef!!,
                popEnterAnim.luaRef!!,
                popExitAnim.luaRef!!
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
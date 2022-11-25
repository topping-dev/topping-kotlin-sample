package dev.topping.kotlin

actual open class LuaNavController : KTInterface
{
   var luaNavController: cocoapods.Topping.LuaNavController? = null

    actual fun navigate(target: LuaRef) {
        luaNavController?.navigateRef(KTWrap.Wrap(target.GetNativeObject()) as cocoapods.Topping.LuaRef)
    }

    actual fun navigate(
        target: LuaRef,
        args: Map<String, Any>
    ) {
        luaNavController?.navigateRef(KTWrap.Wrap(target.GetNativeObject()) as cocoapods.Topping.LuaRef,
            args as Map<Any?, *>
        )
    }

    actual fun navigate(
        target: LuaRef,
        args: Map<String, Any>,
        navOptions: LuaNavOptions
    ) {
        luaNavController?.navigateRef(KTWrap.Wrap(target.GetNativeObject()) as cocoapods.Topping.LuaRef,
            args as Map<Any?, *>,
            KTWrap.Wrap(navOptions.GetNativeObject()) as cocoapods.Topping.NavOptions
        )
    }

    actual fun navigateUp() {
        luaNavController?.navigateUp()
    }

    open override fun GetNativeObject(): Any?
    {
        return luaNavController
    }
    open override fun SetNativeObject(par :Any?)
    {
        luaNavController = par as cocoapods.Topping.LuaNavController?
    }
}
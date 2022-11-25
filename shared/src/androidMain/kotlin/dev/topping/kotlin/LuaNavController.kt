package dev.topping.kotlin

import java.util.HashMap
import kotlin.reflect.KCallable
import kotlin.reflect.typeOf

actual open class LuaNavController : KTInterface
{
   var luaNavController: dev.topping.android.LuaNavController? = null

    actual fun navigate(target: LuaRef) {
        luaNavController?.navigate(KTWrap.Wrap(target.GetNativeObject()) as dev.topping.android.luagui.LuaRef)
    }

    actual fun navigate(
        target: LuaRef,
        args: Map<String, Any>
    ) {
        luaNavController?.navigateArgs(KTWrap.Wrap(target.GetNativeObject()) as dev.topping.android.luagui.LuaRef,
            args as HashMap<String, Any>?
        )
    }

    actual fun navigate(
        target: LuaRef,
        args: Map<String, Any>,
        navOptions: LuaNavOptions
    ) {
        luaNavController?.navigateArgsOptions(KTWrap.Wrap(target.GetNativeObject()) as dev.topping.android.luagui.LuaRef,
            args as HashMap<String, Any>?,
            KTWrap.Wrap(navOptions.GetNativeObject()) as dev.topping.android.LuaNavOptions
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
        luaNavController = par as dev.topping.android.LuaNavController?
    }
}
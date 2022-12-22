package dev.topping.kotlin

import java.util.HashMap
import kotlin.reflect.KCallable
import kotlin.reflect.typeOf

actual open class LuaNavController : KTInterface
{
   var luaNavController: dev.topping.android.LuaNavController? = null

    actual fun navigate(target: LuaRef) {
        luaNavController?.navigate(target.luaRef)
    }

    actual fun navigate(
        target: LuaRef,
        args: Map<String, Any>
    ) {
        luaNavController?.navigateArgs(target.luaRef,
            args as HashMap<String, Any>?
        )
    }

    actual fun navigate(
        target: LuaRef,
        args: Map<String, Any>,
        navOptions: LuaNavOptions
    ) {
        luaNavController?.navigateArgsOptions(target.luaRef,
            args as HashMap<String, Any>?,
            navOptions.luaNavOptions
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
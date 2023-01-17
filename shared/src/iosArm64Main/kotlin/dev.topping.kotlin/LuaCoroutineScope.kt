package dev.topping.kotlin

import kotlin.reflect.KCallable

actual open class LuaCoroutineScope : KTInterface
{
   var luaCoroutineScope: cocoapods.Topping.LuaCoroutineScope? = null

    actual fun launch(func: () -> Unit): LuaJob {
        return KTWrap.Wrap(luaCoroutineScope?.launch(func.toLuaTranslator(null))) as LuaJob
    }
    actual fun launch(dispatcher: Int, func: () -> Unit): LuaJob {
        return KTWrap.Wrap(luaCoroutineScope?.launchDispatcher(dispatcher, func.toLuaTranslator(null))) as LuaJob
    }

    open override fun GetNativeObject(): Any?
    {
        return luaCoroutineScope
    }
    open override fun SetNativeObject(par :Any?)
    {
        luaCoroutineScope = par as cocoapods.Topping.LuaCoroutineScope?
    }
}
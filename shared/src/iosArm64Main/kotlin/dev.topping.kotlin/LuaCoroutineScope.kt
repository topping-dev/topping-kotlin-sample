package dev.topping.kotlin

import kotlin.reflect.KCallable

actual open class LuaCoroutineScope : KTInterface
{
   var luaCoroutineScope: cocoapods.Topping.LuaCoroutineScope? = null

    actual fun launch(func: KCallable<Unit>): LuaJob {
        return KTWrap.Wrap(luaCoroutineScope?.launch(func.toLuaTranslator(this))) as LuaJob
    }
    actual fun launch(dispatcher: Int, func: KCallable<Unit>): LuaJob {
        return KTWrap.Wrap(luaCoroutineScope?.launchDispatcher(dispatcher, func.toLuaTranslator(this))) as LuaJob
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
package dev.topping.kotlin

import kotlin.reflect.KCallable

actual open class LuaCoroutineScope : KTInterface
{
   var luaCoroutineScope: dev.topping.android.LuaCoroutineScope? = null

    actual fun launch(func: KCallable<Unit>)
    {
        luaCoroutineScope?.launch(func.toLuaTranslator(this))
    }
    actual fun launch(dispatcher: Int, func: KCallable<Unit>)
    {
        luaCoroutineScope?.launchDispatcher(dispatcher, func.toLuaTranslator(this))
    }

    open override fun GetNativeObject(): Any?
    {
        return luaCoroutineScope
    }
    open override fun SetNativeObject(par :Any?)
    {
        luaCoroutineScope = par as dev.topping.android.LuaCoroutineScope?
    }
}
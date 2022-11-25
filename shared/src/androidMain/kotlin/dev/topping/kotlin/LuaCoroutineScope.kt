package dev.topping.kotlin

import kotlin.reflect.KCallable

actual open class LuaCoroutineScope : KTInterface
{
   var luaCoroutineScope: dev.topping.android.LuaCoroutineScope? = null

    actual fun launch(func: KCallable<Unit>?)
    {
        val kt: KTWrap<Unit> = KTWrap<Unit>()
        val lt: dev.topping.android.LuaTranslator = dev.topping.android.LuaTranslator(kt, kt.Init(null, func))
        luaCoroutineScope?.launch(lt)
    }
    actual fun launch(dispatcher: Int, func: KCallable<Unit>?)
    {
        val kt: KTWrap<Unit> = KTWrap<Unit>()
        val lt: dev.topping.android.LuaTranslator = dev.topping.android.LuaTranslator(kt, kt.Init(null, func))
        luaCoroutineScope?.launchDispatcher(dispatcher, lt)
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
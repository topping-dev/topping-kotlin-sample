package dev.topping.kotlin

import kotlin.reflect.KCallable

actual open class LuaLifecycle : KTInterface
{
   var luaLifecycle: dev.topping.android.LuaLifecycle? = null

    actual fun addObserver(luaLifecycleObserver: LuaLifecycleObserver) {
        luaLifecycle?.addObserver(KTWrap.Wrap(luaLifecycleObserver) as dev.topping.android.LuaLifecycleObserver)
    }

    actual fun removeObserver(luaLifecycleObserver: LuaLifecycleObserver) {
        luaLifecycle?.removeObserver(KTWrap.Wrap(luaLifecycleObserver) as dev.topping.android.LuaLifecycleObserver)
    }

    actual fun launch(func: KCallable<Unit>)
    {
        val kt: KTWrap<Unit> = KTWrap<Unit>()
        val lt: dev.topping.android.LuaTranslator = dev.topping.android.LuaTranslator(kt, kt.Init(null, func))
        luaLifecycle?.launch(lt)
    }
    actual fun launch(dispatcher: Int, func: KCallable<Unit>)
    {
        val kt: KTWrap<Unit> = KTWrap<Unit>()
        val lt: dev.topping.android.LuaTranslator = dev.topping.android.LuaTranslator(kt, kt.Init(null, func))
        luaLifecycle?.launchDispatcher(dispatcher, lt)
    }

    open override fun GetNativeObject(): Any?
    {
        return luaLifecycle
    }
    open override fun SetNativeObject(par :Any?)
    {
        luaLifecycle = par as dev.topping.android.LuaLifecycle?
    }


}
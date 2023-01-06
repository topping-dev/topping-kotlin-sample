package dev.topping.kotlin

import kotlin.reflect.KCallable

actual open class LuaLifecycle : KTInterface
{
   var luaLifecycle: dev.topping.android.LuaLifecycle? = null

    actual fun addObserver(luaLifecycleObserver: LuaLifecycleObserver) {
        luaLifecycle?.addObserver(luaLifecycleObserver.luaLifecycleObserver!!)
    }

    actual fun removeObserver(luaLifecycleObserver: LuaLifecycleObserver) {
        luaLifecycle?.removeObserver(luaLifecycleObserver.luaLifecycleObserver!!)
    }

    actual fun launch(func: KCallable<Unit>)
    {
        luaLifecycle?.launch(func.toLuaTranslator(this))
    }
    actual fun launch(dispatcher: Int, func: KCallable<Unit>)
    {
        luaLifecycle?.launchDispatcher(dispatcher, func.toLuaTranslator(this))
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
package dev.topping.kotlin

import kotlinx.cinterop.StableRef
import kotlin.reflect.KCallable

actual open class LuaLifecycle : KTInterface
{
   var luaLifecycle: cocoapods.Topping.LuaLifecycle? = null

    actual fun addObserver(luaLifecycleObserver: LuaLifecycleObserver) {
        luaLifecycle?.addObserver(KTWrap.Wrap(luaLifecycleObserver) as cocoapods.Topping.LuaLifecycleObserver)
    }

    actual fun removeObserver(luaLifecycleObserver: LuaLifecycleObserver) {
        luaLifecycle?.removeObserver(KTWrap.Wrap(luaLifecycleObserver) as cocoapods.Topping.LuaLifecycleObserver)
    }

    actual fun launch(func: () -> Unit)
    {
        luaLifecycle?.launch(func.toLuaTranslator(null))
    }
    actual fun launch(dispatcher: Int, func: () -> Unit)
    {
        luaLifecycle?.launchDispatcher(dispatcher, func.toLuaTranslator(null))
    }

    open override fun GetNativeObject(): Any?
    {
        return luaLifecycle
    }
    open override fun SetNativeObject(par :Any?)
    {
        luaLifecycle = par as cocoapods.Topping.LuaLifecycle?
    }


}
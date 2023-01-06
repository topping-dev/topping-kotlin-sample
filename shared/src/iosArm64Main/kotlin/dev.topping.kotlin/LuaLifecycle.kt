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
        luaLifecycle = par as cocoapods.Topping.LuaLifecycle?
    }


}
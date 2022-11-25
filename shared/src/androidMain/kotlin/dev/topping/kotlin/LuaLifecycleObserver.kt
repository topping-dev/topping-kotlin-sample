package dev.topping.kotlin

import kotlin.reflect.KCallable

actual open class LuaLifecycleObserver : KTInterface
{
   var luaLifecycleObserver: dev.topping.android.LuaLifecycleObserver? = null

    actual companion object {
        actual val ON_CREATE: Int = 0
        actual val ON_DESTROY: Int = 1
        actual val ON_RESUME: Int = 2
        actual val ON_PAUSE: Int = 3
        actual val ON_START: Int = 4
        actual val ON_STOP: Int = 5

        actual fun create(func: KCallable<Unit>?): LuaLifecycleObserver {
            val kt: KTWrap<Unit> = KTWrap<Unit>()
            val lt: dev.topping.android.LuaTranslator = dev.topping.android.LuaTranslator(kt, kt.Init(null, func))
            val pobj = LuaLifecycleObserver()
            val pres = dev.topping.android.LuaLifecycleObserver.create(lt)
            pobj.SetNativeObject(pres)
            return pobj
        }

    }

    open override fun GetNativeObject(): Any?
    {
        return luaLifecycleObserver
    }
    open override fun SetNativeObject(par :Any?)
    {
        luaLifecycleObserver = par as dev.topping.android.LuaLifecycleObserver?
    }


}
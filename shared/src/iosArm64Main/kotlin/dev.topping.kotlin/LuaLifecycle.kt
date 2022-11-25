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

    actual fun launch(func: KCallable<Unit>?)
    {
        val kt = KTWrap()
        val lt: cocoapods.Topping.LuaTranslator = cocoapods.Topping.LuaTranslator()
        lt.nobj = StableRef.create(kt).asCPointer()
        lt.kFRetF = kt.Init(this, func)
        luaLifecycle?.launch(lt)
    }
    actual fun launch(dispatcher: Int, func: KCallable<Unit>?)
    {
        val kt = KTWrap()
        val lt: cocoapods.Topping.LuaTranslator = cocoapods.Topping.LuaTranslator()
        lt.nobj = StableRef.create(kt).asCPointer()
        lt.kFRetF = kt.Init(this, func)
        luaLifecycle?.launchDispatcher(dispatcher, lt)
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
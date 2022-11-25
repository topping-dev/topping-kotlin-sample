package dev.topping.kotlin

import kotlinx.cinterop.StableRef
import kotlin.reflect.KCallable

actual open class LuaCoroutineScope : KTInterface
{
   var luaCoroutineScope: cocoapods.Topping.LuaCoroutineScope? = null

    actual fun launch(func: KCallable<Unit>?)
    {
        val kt = KTWrap()
        val lt: cocoapods.Topping.LuaTranslator = cocoapods.Topping.LuaTranslator()
        lt.nobj = StableRef.create(kt).asCPointer()
        lt.kFRetF = kt.Init(this, func)
        luaCoroutineScope?.launch(lt)
    }
    actual fun launch(dispatcher: Int, func: KCallable<Unit>?)
    {
        val kt = KTWrap()
        val lt: cocoapods.Topping.LuaTranslator = cocoapods.Topping.LuaTranslator()
        lt.nobj = StableRef.create(kt).asCPointer()
        lt.kFRetF = kt.Init(this, func)
        luaCoroutineScope?.launchDispatcher(dispatcher, lt)
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
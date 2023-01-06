package dev.topping.kotlin

import kotlinx.cinterop.StableRef
import kotlin.reflect.KCallable

actual open class LuaTranslator : KTInterface
{
   var luaTranslator: cocoapods.Topping.LuaTranslator? = null
   actual companion object {
        actual fun Register(obj: Any?, functionName: String?): LuaTranslator?
        {
            val pobj = LuaTranslator()
            return pobj
        }
   }
    open override fun GetNativeObject(): Any?
   {
       return luaTranslator
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaTranslator = par as cocoapods.Topping.LuaTranslator?
   }
}

fun <V> KCallable<V>.toLuaTranslator(obj: Any): cocoapods.Topping.LuaTranslator {
    val kt = KTWrap()
    val lt: cocoapods.Topping.LuaTranslator = cocoapods.Topping.LuaTranslator()
    lt.nobj = StableRef.create(kt).asCPointer()
    lt.kFRetF = kt.Init(obj, this)
    return lt
}

fun <V> KCallable<V>?.toLuaTranslator(obj: Any): cocoapods.Topping.LuaTranslator? {
    if(this == null)
        return null
    val kt = KTWrap()
    val lt: cocoapods.Topping.LuaTranslator = cocoapods.Topping.LuaTranslator()
    lt.nobj = StableRef.create(kt).asCPointer()
    lt.kFRetF = kt.Init(obj, this)
    return lt
}
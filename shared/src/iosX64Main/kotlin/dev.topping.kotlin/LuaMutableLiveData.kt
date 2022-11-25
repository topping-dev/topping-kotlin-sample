package dev.topping.kotlin

import kotlinx.cinterop.StableRef
import platform.darwin.NSObject
import kotlin.reflect.KCallable

actual open class LuaMutableLiveData : KTInterface
{
   var luaMutableLiveData: cocoapods.Topping.LuaMutableLiveData? = null
    var functionMap = mutableMapOf<KCallable<Unit>, cocoapods.Topping.LuaTranslator>()

    actual companion object {
        actual fun create(): LuaMutableLiveData {
            val pobj = LuaMutableLiveData()
            val pres = cocoapods.Topping.LuaMutableLiveData.create()
            pobj.SetNativeObject(pres)
            return pobj
        }

    }

    actual fun observe(owner: LuaLifecycleOwner, func: KCallable<Unit>?) {
        val kt = KTWrap()
        val lt: cocoapods.Topping.LuaTranslator = cocoapods.Topping.LuaTranslator()
        lt.nobj = StableRef.create(kt).asCPointer()
        lt.kFRetF = kt.Init(this, func)
        luaMutableLiveData?.observeLua(owner.GetNativeObject() as cocoapods.Topping.LuaLifecycleOwner, lt)
        functionMap[func!!] = lt
    }
    actual fun removeObserver(func: KCallable<Unit>?) {
        luaMutableLiveData?.removeObserverLua(functionMap[func!!]!!)
    }

    actual fun setValue(value: Any?) {
        luaMutableLiveData?.setValue(KTWrap.UnWrap(value) as NSObject)
    }
    actual fun postValue(value: Any?) {
        luaMutableLiveData?.postValue(KTWrap.UnWrap(value) as NSObject)
    }

    open override fun GetNativeObject(): Any?
    {
        return luaMutableLiveData
    }
    open override fun SetNativeObject(par :Any?)
    {
        luaMutableLiveData = par as cocoapods.Topping.LuaMutableLiveData?
    }


}
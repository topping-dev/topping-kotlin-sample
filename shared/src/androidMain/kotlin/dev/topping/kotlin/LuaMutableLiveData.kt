package dev.topping.kotlin

import kotlin.reflect.KCallable

actual open class LuaMutableLiveData : KTInterface
{
   var luaMutableLiveData: dev.topping.android.LuaMutableLiveData? = null
    var functionMap = mutableMapOf<KCallable<Unit>, dev.topping.android.LuaTranslator>()

    actual companion object {
        actual fun create(): LuaMutableLiveData {
            val pobj = LuaMutableLiveData()
            val pres = dev.topping.android.LuaMutableLiveData.create()
            pobj.SetNativeObject(pres)
            return pobj
        }

    }

    actual fun observe(owner: LuaLifecycleOwner, func: KCallable<Unit>) {
        val lt = func.toLuaTranslator(this)
        luaMutableLiveData?.observe(owner.GetNativeObject() as dev.topping.android.LuaLifecycleOwner, lt)
        functionMap[func] = lt
    }
    actual fun removeObserver(func: KCallable<Unit>) {
        luaMutableLiveData?.removeObserver(functionMap[func]!!)
    }

    actual fun setValue(value: Any?) {
        luaMutableLiveData?.setValue(KTWrap.UnWrap(value))
    }
    actual fun postValue(value: Any?) {
        luaMutableLiveData?.postValue(KTWrap.UnWrap(value))
    }

    open override fun GetNativeObject(): Any?
    {
        return luaMutableLiveData
    }
    open override fun SetNativeObject(par :Any?)
    {
        luaMutableLiveData = par as dev.topping.android.LuaMutableLiveData?
    }


}
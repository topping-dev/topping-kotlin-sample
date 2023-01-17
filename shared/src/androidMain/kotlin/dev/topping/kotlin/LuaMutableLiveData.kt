package dev.topping.kotlin

actual open class LuaMutableLiveData : LuaLiveData()
{
    var luaMutableLiveData: dev.topping.android.LuaMutableLiveData? = null

    actual companion object {
        actual fun create(): LuaMutableLiveData {
            val pobj = LuaMutableLiveData()
            val pres = dev.topping.android.LuaMutableLiveData.create()
            pobj.SetNativeObject(pres)
            return pobj
        }

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
        super.SetNativeObject(par)
        luaMutableLiveData = par as dev.topping.android.LuaMutableLiveData?
    }


}
package dev.topping.kotlin

import platform.darwin.NSObject

actual open class LuaMutableLiveData : LuaLiveData()
{
   var luaMutableLiveData: cocoapods.Topping.LuaMutableLiveData? = null

    actual companion object {
        actual fun create(): LuaMutableLiveData {
            val pobj = LuaMutableLiveData()
            val pres = cocoapods.Topping.LuaMutableLiveData.create()
            pobj.SetNativeObject(pres)
            return pobj
        }

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
        super.SetNativeObject(par)
        luaMutableLiveData = par as cocoapods.Topping.LuaMutableLiveData?
    }


}
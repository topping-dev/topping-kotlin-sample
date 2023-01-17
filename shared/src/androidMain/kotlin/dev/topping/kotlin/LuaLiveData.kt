package dev.topping.kotlin

actual open class LuaLiveData : KTInterface
{
   var luaLiveData: dev.topping.android.LuaLiveData? = null
    var functionMap = mutableMapOf<(LuaLiveData, Any) -> Unit, dev.topping.android.LuaTranslator>()

    actual companion object {
        actual fun create(): LuaLiveData {
            val pobj = LuaLiveData()
            val pres = dev.topping.android.LuaMutableLiveData.create()
            pobj.SetNativeObject(pres)
            return pobj
        }

    }

    actual fun observe(owner: LuaLifecycleOwner, func: (LuaLiveData, Any) -> Unit) {
        val lt = func.toLuaTranslator(this)
        luaLiveData?.observe(owner.GetNativeObject() as dev.topping.android.LuaLifecycleOwner, lt)
        functionMap[func] = lt
    }
    actual fun removeObserver(func: (LuaLiveData, Any) -> Unit) {
        luaLiveData?.removeObserver(functionMap[func]!!)
    }

    actual fun getValue() : Any? {
        return KTWrap.Wrap(luaLiveData?.getValue())
    }

    open override fun GetNativeObject(): Any?
    {
        return luaLiveData
    }
    open override fun SetNativeObject(par :Any?)
    {
        luaLiveData = par as dev.topping.android.LuaLiveData?
    }
}
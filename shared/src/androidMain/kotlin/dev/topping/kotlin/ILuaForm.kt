package dev.topping.kotlin

actual open class ILuaForm actual constructor(form: Any) : KTInterface {
    var iLuaForm: dev.topping.android.ILuaForm? = null
    private var form: LuaForm

    init {
        this.form = KTWrap.Wrap(form) as LuaForm
        iLuaForm = dev.topping.android.ILuaForm()
        iLuaForm?.ltOnCreate = ::onCreate.toLuaTranslator(null)
        iLuaForm?.ltOnResume = ::onResume.toLuaTranslator(null)
        iLuaForm?.ltOnPause = ::onPause.toLuaTranslator(null)
        iLuaForm?.ltOnDestroy = ::onDestroy.toLuaTranslator(null)
    }

    actual open fun onCreate() {}
    actual open fun onResume() {}
    actual open fun onPause() {}
    actual open fun onDestroy() {}
    actual fun getForm(): LuaForm { return form }
    open override fun GetNativeObject(): Any?
    {
        return iLuaForm
    }
    open override fun SetNativeObject(par :Any?)
    {
        iLuaForm = par as dev.topping.android.ILuaForm?
    }
}
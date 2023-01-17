package dev.topping.kotlin

actual open class ILuaForm actual constructor(form: Any) : KTInterface {
    var luaFormInterface: dev.topping.android.ILuaForm? = null
    private var form: LuaForm

    init {
        this.form = KTWrap.Wrap(form) as LuaForm
        luaFormInterface = dev.topping.android.ILuaForm()
        luaFormInterface?.ltOnCreate = ::onCreate.toLuaTranslator(null)
        luaFormInterface?.ltOnResume = ::onResume.toLuaTranslator(null)
        luaFormInterface?.ltOnPause = ::onPause.toLuaTranslator(null)
        luaFormInterface?.ltOnDestroy = ::onDestroy.toLuaTranslator(null)
    }

    actual open fun onCreate() {}
    actual open fun onResume() {}
    actual open fun onPause() {}
    actual open fun onDestroy() {}
    actual fun getForm(): LuaForm { return form }
    open override fun GetNativeObject(): Any?
    {
        return luaFormInterface
    }
    open override fun SetNativeObject(par :Any?)
    {
        luaFormInterface = par as dev.topping.android.ILuaForm?
    }
}
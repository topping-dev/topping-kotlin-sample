package dev.topping.kotlin

actual open class ILuaFragment actual constructor(fragment: Any) : KTInterface {
    var luaFragmentInterface: dev.topping.android.ILuaFragment? = null
    private var fragment: LuaFragment

    init {
        this.fragment = KTWrap.Wrap(fragment) as LuaFragment
        luaFragmentInterface = dev.topping.android.ILuaFragment()
        luaFragmentInterface?.ltOnCreate = ::onCreate.toLuaTranslator(null)
        luaFragmentInterface?.ltOnCreateView = ::onCreateView.toLuaTranslator(null)
        luaFragmentInterface?.ltOnViewCreated = ::onViewCreated.toLuaTranslator(null)
        luaFragmentInterface?.ltOnResume = ::onResume.toLuaTranslator(null)
        luaFragmentInterface?.ltOnPause = ::onPause.toLuaTranslator(null)
        luaFragmentInterface?.ltOnDestroy = ::onDestroy.toLuaTranslator(null)
    }

    actual open fun onCreateView(
        luacontext: LuaContext,
        inflater: LuaViewInflator,
        container: LGView?,
        savedInstanceState: LuaBundle?
    ): LGView { return LGView() }

    actual open fun onCreate(savedInstanceState: LuaBundle?) {}
    actual open fun onViewCreated(
        view: LGView,
        savedInstanceState: LuaBundle?
    ) {}
    actual open fun onResume() {}
    actual open fun onPause() {}
    actual open fun onDestroy() {}
    actual fun getFragment(): LuaFragment { return fragment }
    open override fun GetNativeObject(): Any?
    {
        return luaFragmentInterface
    }
    open override fun SetNativeObject(par :Any?)
    {
        luaFragmentInterface = par as dev.topping.android.ILuaFragment?
    }
}
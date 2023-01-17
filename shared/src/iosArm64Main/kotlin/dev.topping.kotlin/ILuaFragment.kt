package dev.topping.kotlin

actual open class ILuaFragment actual constructor(fragment: Any) : KTInterface {
    var iLuaFragment: cocoapods.Topping.ILuaFragment? = null
    private var fragment: LuaFragment

    init {
        this.fragment = KTWrap.Wrap(fragment) as LuaFragment
        iLuaFragment = cocoapods.Topping.ILuaFragment.Create()
        iLuaFragment?.ltOnCreate = ::onCreate.toLuaTranslator(null)
        iLuaFragment?.ltOnCreateView = ::onCreateView.toLuaTranslator(null)
        iLuaFragment?.ltOnViewCreated = ::onViewCreated.toLuaTranslator(null)
        iLuaFragment?.ltOnResume = ::onResume.toLuaTranslator(null)
        iLuaFragment?.ltOnPause = ::onPause.toLuaTranslator(null)
        iLuaFragment?.ltOnDestroy = ::onDestroy.toLuaTranslator(null)
    }

    actual open fun onCreateView(
        luacontext: LuaContext,
        inflater: LuaViewInflator,
        container: LGView?,
        savedInstanceState: LuaBundle?
    ): LGView { return LGView()
    }

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
        return iLuaFragment
    }
    open override fun SetNativeObject(par :Any?)
    {
        iLuaFragment = par as cocoapods.Topping.ILuaFragment?
    }
}
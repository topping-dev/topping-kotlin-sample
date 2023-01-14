package dev.topping.kotlin

expect open class LuaFragmentInterface(fragment: Any) {
    open fun onCreate(savedInstanceState: Map<String, Any>)
    open fun onCreateView(luacontext: LuaContext,
                              inflater: LuaViewInflator,
                              container: LGView?,
                              savedInstanceState: Map<String, Any>?): LGView

    open fun onViewCreated(
        view: LGView,
        savedInstanceState: Map<String, Any>
    )
    open fun onResume()
    open fun onPause()
    open fun onDestroy()
    fun getFragment(): LuaFragment
}
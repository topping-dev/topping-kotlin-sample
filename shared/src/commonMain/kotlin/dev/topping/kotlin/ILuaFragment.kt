package dev.topping.kotlin

expect open class ILuaFragment(fragment: Any) {
    open fun onCreate(savedInstanceState: LuaBundle?)
    open fun onCreateView(luacontext: LuaContext,
                              inflater: LuaViewInflator,
                              container: LGView?,
                              savedInstanceState: LuaBundle?): LGView

    open fun onViewCreated(
        view: LGView,
        savedInstanceState: LuaBundle?
    )
    open fun onResume()
    open fun onPause()
    open fun onDestroy()
    fun getFragment(): LuaFragment
}
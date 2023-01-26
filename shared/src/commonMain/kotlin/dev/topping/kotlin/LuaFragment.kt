package dev.topping.kotlin

expect open class LuaFragment() {
   companion object {
        fun create(lc: LuaContext, luaId: LuaRef): LuaFragment
       fun create(lc: LuaContext, luaId: LuaRef, args: MutableMap<String, Any>): LuaFragment
       fun createWithUI(lc: LuaContext, luaId: LuaRef, ui: LuaRef, args: MutableMap<String, Any>): LuaFragment
   }
   fun getContext(): LuaContext
    fun isInitialized(): Boolean
    fun getViewById(lId: LuaRef): LGView?
   fun getView(): LGView?
   fun setView(v: LGView?)
   fun setViewXML(xml: LuaRef)
   fun setViewId(luaId: String)
   fun setTitle(str: String)
   fun close()
   fun getArguments(): LuaBundle
   fun getNavController(): LuaNavController
}
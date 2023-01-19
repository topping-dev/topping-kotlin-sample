package dev.topping.kotlin

expect open class LuaFragment() {
   companion object {
        fun Create(lc: LuaContext, luaId: LuaRef): LuaFragment
       fun Create(lc: LuaContext, luaId: LuaRef, args: MutableMap<String, Any>): LuaFragment
       fun CreateWithUI(lc: LuaContext, luaId: LuaRef, ui: LuaRef, args: MutableMap<String, Any>): LuaFragment
   }
   fun GetContext(): LuaContext
    fun IsInitialized(): Boolean
    fun GetViewById(lId: LuaRef): LGView?
   fun GetView(): LGView?
   fun SetView(v: LGView?)
   fun SetViewXML(xml: LuaRef)
   fun SetViewId(luaId: String)
   fun SetTitle(str: String)
   fun Close()
   fun getArguments(): LuaBundle
   fun getNavController(): LuaNavController
}
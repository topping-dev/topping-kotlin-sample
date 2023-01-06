package dev.topping.kotlin

expect open class LuaNavHostFragment
{
   fun GetContext(): LuaContext
   fun IsInitialized(): Boolean
   fun GetViewById(lId: LuaRef): LGView?
   fun GetView(): LGView?
   fun SetView(v: LGView?)
   fun SetViewXML(xml: LuaRef)
   fun SetViewId(luaId: String)
   fun SetTitle(str: String)
   fun Close()
   fun getNavController(): LuaNavController
}
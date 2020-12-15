package dev.topping.kotlin

expect open class LuaFragment
{
   companion object {
        fun Create(lc: LuaContext?, luaId: String?): LuaFragment?
        fun CreateWithUI(lc: LuaContext?, luaId: String?, ui: String?): LuaFragment?
   }
   fun GetContext(): LuaContext?
   fun IsInitialized(): Boolean?
   fun GetViewById(lId: String?): LGView?
   fun GetView(): LGView?
   fun SetView(v: LGView?)
   fun SetViewXML(xml: String?)
   fun SetViewId(luaId: String?)
   fun SetTitle(str: String?)
   fun Close()
}
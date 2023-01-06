package dev.topping.kotlin

expect open class LuaForm
{
   companion object {
        fun Create(lc: LuaContext, luaId: LuaRef)
        fun CreateWithUI(lc: LuaContext, luaId: LuaRef, ui: LuaRef)
        fun GetActiveForm(): LuaForm?
   }
   fun GetContext(): LuaContext?
   fun GetViewById(lId: LuaRef?): LGView?
   fun GetBindings(): Map<String, LGView>?
   fun GetView(): LGView?
   fun SetView(v: LGView?)
   fun SetViewXML(xml: LuaRef)
   fun SetTitle(str: String)
   fun Close()
   fun GetLifecycle() : LuaLifecycle?
   fun getFragmentManager() : LuaFragmentManager?
}
package dev.topping.kotlin

expect open class LuaForm
{
   companion object {
        fun create(lc: LuaContext, luaId: LuaRef)
        fun createWithUI(lc: LuaContext, luaId: LuaRef, ui: LuaRef)
        fun getActiveForm(): LuaForm?
   }
   fun getContext(): LuaContext?
   fun getViewById(lId: LuaRef?): LGView?
   fun getBindings(): Map<String, LGView>?
   fun getView(): LGView?
   fun setView(v: LGView?)
   fun setViewXML(xml: LuaRef)
   fun setTitle(str: String)
   fun close()
   fun getLifecycle() : LuaLifecycle?
   fun getFragmentManager() : LuaFragmentManager?
}
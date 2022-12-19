package dev.topping.kotlin

import kotlin.reflect.KCallable

expect open class LuaNavHostFragment
{
   companion object {
      fun RegisterFragmentEvent(luaId: LuaRef, event: Int, func: KCallable<Unit>?)
      fun Create(lc: LuaContext, luaId: String?): LuaNavHostFragment
      fun CreateWithUI(
         lc: LuaContext,
         luaId: String?,
         ui: String?
      ): LuaNavHostFragment
   }
   fun GetContext(): LuaContext?
   fun IsInitialized(): Boolean
   fun GetViewById(lId: LuaRef?): LGView?
   fun GetView(): LGView?
   fun SetView(v: LGView?)
   fun SetViewXML(xml: String?)
   fun SetViewId(luaId: String?)
   fun SetTitle(str: String?)
   fun Close()
   fun getNavController(): LuaNavController
}
package dev.topping.kotlin

import kotlin.reflect.KCallable

expect open class LuaFragment
{
   companion object {
        val FRAGMENT_EVENT_CREATE: Int
        val FRAGMENT_EVENT_CREATE_VIEW: Int
        val FRAGMENT_EVENT_VIEW_CREATED: Int
        val FRAGMENT_EVENT_RESUME: Int
        val FRAGMENT_EVENT_PAUSE: Int
        val FRAGMENT_EVENT_DESTROY: Int
        fun Create(lc: LuaContext?, luaId: String?): LuaFragment?
        fun CreateWithUI(lc: LuaContext?, luaId: String?, ui: String?): LuaFragment?
        fun RegisterFragmentEvent(luaId: String?, event: Int, func: KCallable<Any?>?)
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
   fun getNavController(): LuaNavController
}
package dev.topping.kotlin

import kotlin.reflect.KCallable

expect open class LuaForm
{
   companion object {
        val FORM_EVENT_CREATE: Int
        val FORM_EVENT_RESUME: Int
        val FORM_EVENT_PAUSE: Int
        val FORM_EVENT_DESTROY: Int
        val FORM_EVENT_UPDATE: Int
        val FORM_EVENT_PAINT: Int
        val FORM_EVENT_MOUSEDOWN: Int
        val FORM_EVENT_MOUSEUP: Int
        val FORM_EVENT_MOUSEMOVE: Int
        val FORM_EVENT_KEYDOWN: Int
        val FORM_EVENT_KEYUP: Int
        val FORM_EVENT_NFC: Int
        fun RegisterFormEvent(luaId: String?, event: Int, func: KCallable<Unit>?)
        fun Create(lc: LuaContext?, luaId: String?)
        fun CreateWithUI(lc: LuaContext?, luaId: String?, ui: String?)
        fun CreateForTab(lc: LuaContext?, luaId: String?): Any?
        fun GetActiveForm(): LuaForm?
   }
   fun GetContext(): LuaContext?
   fun GetViewById(lId: String?): LGView?
   fun GetViewById(lId: LuaRef?): LGView?
   fun GetBindings(): Map<String, LGView>?
   fun GetView(): LGView?
   fun SetView(v: LGView?)
   fun SetViewXML(xml: String?)
   fun SetTitle(str: String?)
   fun Close()
   fun GetLifecycle() : LuaLifecycle?
   fun getFragmentManager() : LuaFragmentManager?
}
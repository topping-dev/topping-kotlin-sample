package dev.topping.kotlin

import kotlin.reflect.KCallable
import kotlin.reflect.*

expect open class LuaEvent
{
   companion object {
        val UI_EVENT_CREATE: Int
        val UI_EVENT_VIEW_CREATE: Int
        val UI_EVENT_FRAGMENT_CREATE_VIEW: Int
        val UI_EVENT_FRAGMENT_VIEW_CREATED: Int
        val UI_EVENT_RESUME: Int
        val UI_EVENT_PAUSE: Int
        val UI_EVENT_DESTROY: Int
        val UI_EVENT_UPDATE: Int
        val UI_EVENT_PAINT: Int
        val UI_EVENT_MOUSEDOWN: Int
        val UI_EVENT_MOUSEUP: Int
        val UI_EVENT_MOUSEMOVE: Int
        val UI_EVENT_KEYDOWN: Int
        val UI_EVENT_KEYUP: Int
        val UI_EVENT_NFC: Int
        fun RegisterUIEvent(luaId: LuaRef, event: Int, func: KCallable<Any?>)
        fun RegisterForm(clsName: String, func: KCallable<ILuaForm>)
        //fun RegisterFragment(clsName: String, func: KCallable<ILuaFragment>)
        fun RegisterFragment(clsName: String, func: (Any) -> ILuaFragment)
   }
}
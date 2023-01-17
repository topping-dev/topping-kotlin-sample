package dev.topping.kotlin

import kotlin.reflect.KCallable

actual open class LuaEvent : KTInterface
{
   var luaEvent: cocoapods.Topping.LuaEvent? = null
   actual companion object {
        actual val UI_EVENT_CREATE: Int = 0
        actual val UI_EVENT_VIEW_CREATE: Int = 1
        actual val UI_EVENT_FRAGMENT_CREATE_VIEW: Int = 2
        actual val UI_EVENT_FRAGMENT_VIEW_CREATED: Int = 3
        actual val UI_EVENT_RESUME: Int = 4
        actual val UI_EVENT_PAUSE: Int = 5
        actual val UI_EVENT_DESTROY: Int = 6
        actual val UI_EVENT_UPDATE: Int = 7
        actual val UI_EVENT_PAINT: Int = 8
        actual val UI_EVENT_MOUSEDOWN: Int = 9
        actual val UI_EVENT_MOUSEUP: Int = 10
        actual val UI_EVENT_MOUSEMOVE: Int = 11
        actual val UI_EVENT_KEYDOWN: Int = 12
        actual val UI_EVENT_KEYUP: Int = 13
        actual val UI_EVENT_NFC: Int = 14
       actual fun RegisterUIEvent(luaId: LuaRef, event: Int, func: Function<Any?>)
       {
           cocoapods.Topping.LuaEvent.RegisterUIEvent(luaId.luaRef, event, func.toLuaTranslator(null))
       }
       actual fun RegisterForm(clsName: String, func: (Any) -> ILuaForm) {
           cocoapods.Topping.LuaEvent.RegisterForm(clsName, func.toLuaTranslator(null))
       }
       actual fun RegisterFragment(clsName: String, func: (Any) -> ILuaFragment) {
           cocoapods.Topping.LuaEvent.RegisterFragment(clsName, func.toLuaTranslator(null))
       }
   }
    open override fun GetNativeObject(): Any?
   {
       return luaEvent
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaEvent = par as cocoapods.Topping.LuaEvent?
   }
}
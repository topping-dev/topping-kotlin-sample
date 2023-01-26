package dev.topping.kotlin

import kotlin.reflect.*

actual open class LuaEvent : KTInterface
{
   var luaEvent: dev.topping.android.LuaEvent? = null
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
       actual fun registerUIEvent(luaId: LuaRef, event: Int, func: Function<Any?>)
       {
           dev.topping.android.LuaEvent.registerUIEvent(luaId.luaRef!!, event, func.toLuaTranslator(null))
       }
       actual fun registerForm(clsName: String, func: (Any) -> ILuaForm) {
           dev.topping.android.LuaEvent.registerForm(clsName, func.toLuaTranslator(null))
       }
       /*actual fun registerFragment(clsName: String, func: KCallable<ILuaFragment>) {
           dev.topping.android.LuaEvent.registerFragment(clsName, func.toLuaTranslator(null))
       }*/
       actual fun registerFragment(clsName: String, func: (Any) -> ILuaFragment) {
           dev.topping.android.LuaEvent.registerFragment(clsName, func.toLuaTranslator(null))
       }
   }
    open override fun GetNativeObject(): Any?
   {
       return luaEvent
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaEvent = par as dev.topping.android.LuaEvent?
   }
}

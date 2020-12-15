package dev.topping.kotlin

import kotlin.reflect.KCallable

actual open class LuaForm : KTInterface
{
   var luaForm: dev.topping.android.LuaForm? = null
   actual companion object {
        actual val FORM_EVENT_CREATE: Int = 0
        actual val FORM_EVENT_RESUME: Int = 1
        actual val FORM_EVENT_PAUSE: Int = 2
        actual val FORM_EVENT_DESTROY: Int = 3
        actual val FORM_EVENT_UPDATE: Int = 4
        actual val FORM_EVENT_PAINT: Int = 5
        actual val FORM_EVENT_MOUSEDOWN: Int = 6
        actual val FORM_EVENT_MOUSEUP: Int = 7
        actual val FORM_EVENT_MOUSEMOVE: Int = 8
        actual val FORM_EVENT_KEYDOWN: Int = 9
        actual val FORM_EVENT_KEYUP: Int = 10
        actual val FORM_EVENT_NFC: Int = 11
        actual fun RegisterFormEvent(luaId: String?, event: Int, func: KCallable<Unit>?)
        {
            val kt: KTWrap<Unit> = KTWrap<Unit>()
            val lt: dev.topping.android.LuaTranslator = dev.topping.android.LuaTranslator(kt, kt.Init(null, func))
            dev.topping.android.LuaForm.RegisterFormEvent(luaId, event, lt)
        }
        actual fun Create(lc: LuaContext?, luaId: String?)
        {
            dev.topping.android.LuaForm.Create(lc?.luaContext, luaId)
        }
        actual fun CreateWithUI(lc: LuaContext?, luaId: String?, ui: String?)
        {
            dev.topping.android.LuaForm.CreateWithUI(lc?.luaContext, luaId, ui)
        }
        actual fun CreateForTab(lc: LuaContext?, luaId: String?): Any?
        {
            val pobj = LuaForm()
            val pres = dev.topping.android.LuaForm.CreateForTab(lc?.luaContext, luaId)
            pobj.SetNativeObject(pres as dev.topping.android.LuaForm)
            return pobj
        }
        actual fun GetActiveForm(): LuaForm?
        {
            val pobj = LuaForm()
            val pres = dev.topping.android.LuaForm.GetActiveForm()
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun GetContext(): LuaContext?
   {
       val pobj = LuaContext()
       val obj = luaForm?.GetContext()
       pobj.SetNativeObject(obj)
       return pobj
   }
   actual fun GetViewById(lId: String?): LGView?
   {
       return KTWrap.Wrap(luaForm?.GetViewById(lId)) as LGView?
   }
   actual fun GetView(): LGView?
   {
       return KTWrap.Wrap(luaForm?.GetView()) as LGView?
   }
   actual fun SetView(v: LGView?)
   {
       luaForm?.SetView(v?.lgView)
   }
   actual fun SetViewXML(xml: String?)
   {
       luaForm?.SetViewXML(xml)
   }
   actual fun SetTitle(str: String?)
   {
       luaForm?.SetTitle(str)
   }
   actual fun Close()
   {
       luaForm?.Close()
   }
    open override fun GetNativeObject(): Any?
   {
       return luaForm
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaForm = par as dev.topping.android.LuaForm?
   }
}
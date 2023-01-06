package dev.topping.kotlin

actual open class LuaForm : KTInterface
{
   var luaForm: dev.topping.android.LuaForm? = null
   actual companion object {
        actual fun Create(lc: LuaContext, luaId: LuaRef)
        {
            dev.topping.android.LuaForm.Create(lc.luaContext!!, luaId.luaRef)
        }
        actual fun CreateWithUI(lc: LuaContext, luaId: LuaRef, ui: LuaRef)
        {
            dev.topping.android.LuaForm.CreateWithUI(lc.luaContext!!, luaId.luaRef, ui.luaRef)
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
    actual fun GetViewById(lId: LuaRef?): LGView?
    {
        return KTWrap.Wrap(luaForm?.GetViewById(lId?.luaRef!!)) as LGView?
    }
    actual fun GetBindings(): Map<String, LGView>? {
        val map = mutableMapOf<String, LGView>()
        luaForm?.GetBindings()?.forEach {
            map[it.key] = KTWrap.Wrap(it.value) as LGView
        }

        return map
    }
   actual fun GetView(): LGView?
   {
       return KTWrap.Wrap(luaForm?.GetView()) as LGView?
   }
   actual fun SetView(v: LGView?)
   {
       luaForm?.SetView(v?.lgView)
   }
   actual fun SetViewXML(xml: LuaRef)
   {
       luaForm?.SetViewXML(xml.luaRef)
   }
   actual fun SetTitle(str: String)
   {
       luaForm?.SetTitle(str)
   }
   actual fun Close()
   {
       luaForm?.Close()
   }
   actual fun GetLifecycle() : LuaLifecycle? {
        return null
    }
    actual fun getFragmentManager() : LuaFragmentManager? {
        val fragmentManager = LuaFragmentManager()
        fragmentManager.luaFragmentManager = luaForm?.getFragmentManagerInner()
        return fragmentManager
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
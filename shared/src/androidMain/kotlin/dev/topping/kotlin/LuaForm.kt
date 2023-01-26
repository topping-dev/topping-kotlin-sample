package dev.topping.kotlin

actual open class LuaForm : KTInterface
{
   var luaForm: dev.topping.android.LuaForm? = null
   actual companion object {
        actual fun create(lc: LuaContext, luaId: LuaRef)
        {
            dev.topping.android.LuaForm.create(lc.luaContext!!, luaId.luaRef)
        }
        actual fun createWithUI(lc: LuaContext, luaId: LuaRef, ui: LuaRef)
        {
            dev.topping.android.LuaForm.createWithUI(lc.luaContext!!, luaId.luaRef, ui.luaRef)
        }
        actual fun getActiveForm(): LuaForm?
        {
            val pobj = LuaForm()
            val pres = dev.topping.android.LuaForm.getActiveForm()
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun getContext(): LuaContext?
   {
       val pobj = LuaContext()
       val obj = luaForm?.getContext()
       pobj.SetNativeObject(obj)
       return pobj
   }
    actual fun getViewById(lId: LuaRef?): LGView?
    {
        return KTWrap.Wrap(luaForm?.getViewById(lId?.luaRef!!)) as LGView?
    }
    actual fun getBindings(): Map<String, LGView>? {
        val map = mutableMapOf<String, LGView>()
        luaForm?.getBindings()?.forEach {
            map[it.key] = KTWrap.Wrap(it.value) as LGView
        }

        return map
    }
   actual fun getView(): LGView?
   {
       return KTWrap.Wrap(luaForm?.getView()) as LGView?
   }
   actual fun setView(v: LGView?)
   {
       luaForm?.setView(v?.lgView)
   }
   actual fun setViewXML(xml: LuaRef)
   {
       luaForm?.setViewXML(xml.luaRef)
   }
   actual fun setTitle(str: String)
   {
       luaForm?.setTitle(str)
   }
   actual fun close()
   {
       luaForm?.close()
   }
   actual fun getLifecycle() : LuaLifecycle? {
        return KTWrap.Wrap(luaForm?.getLuaLifecycle()) as LuaLifecycle
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
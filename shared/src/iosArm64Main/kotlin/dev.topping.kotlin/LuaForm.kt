package dev.topping.kotlin

actual open class LuaForm : KTInterface
{
   var luaForm: cocoapods.Topping.LuaForm? = null
   actual companion object {
        actual fun create(lc: LuaContext, luaId: LuaRef)
        {
            cocoapods.Topping.LuaForm.create(lc.luaContext, luaId.luaRef)
        }
        actual fun createWithUI(lc: LuaContext, luaId: LuaRef, ui: LuaRef)
        {
            cocoapods.Topping.LuaForm.createWithUI(lc.luaContext, luaId.luaRef, ui.luaRef)
        }
        actual fun getActiveForm(): LuaForm?
        {
            val pobj = LuaForm()
            val pres = cocoapods.Topping.LuaForm.getActiveForm()
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
        return KTWrap.Wrap(luaForm?.getViewById((lId?.luaRef!!))) as LGView?
    }
    actual fun getBindings(): Map<String, LGView>?
    {
        return luaForm?.getBindings()?.entries?.associate {
            it.key.toString() to (KTWrap.Wrap(it.value) as LGView)
        }
    }
   actual fun getView(): LGView?
   {
       return KTWrap.Wrap(luaForm?.getLuaView()) as LGView?
   }
   actual fun setView(v: LGView?)
   {
       luaForm?.setLuaView(v?.lgView)
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
    actual fun getLifecycle() : LuaLifecycle?
    {
        return KTWrap.Wrap(luaForm?.getLifecycleInner()) as LuaLifecycle
    }
    actual fun getFragmentManager() : LuaFragmentManager?
    {
        return KTWrap.Wrap(luaForm?.getSupportFragmentManager()) as LuaFragmentManager
    }
    open override fun GetNativeObject(): Any?
   {
       return luaForm
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaForm = par as cocoapods.Topping.LuaForm?
   }
}
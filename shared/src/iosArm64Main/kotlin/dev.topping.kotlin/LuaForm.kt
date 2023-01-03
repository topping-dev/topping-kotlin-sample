package dev.topping.kotlin

actual open class LuaForm : KTInterface
{
   var luaForm: cocoapods.Topping.LuaForm? = null
   actual companion object {
        actual fun Create(lc: LuaContext?, luaId: LuaRef?)
        {
            cocoapods.Topping.LuaForm.Create(lc?.luaContext, luaId?.luaRef)
        }
        actual fun CreateWithUI(lc: LuaContext?, luaId: LuaRef?, ui: LuaRef?)
        {
            cocoapods.Topping.LuaForm.CreateWithUI(lc?.luaContext, luaId?.luaRef, ui?.luaRef)
        }
        actual fun GetActiveForm(): LuaForm?
        {
            val pobj = LuaForm()
            val pres = cocoapods.Topping.LuaForm.GetActiveForm()
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
        return KTWrap.Wrap(luaForm?.GetViewById((lId?.luaRef!!))) as LGView?
    }
    actual fun GetBindings(): Map<String, LGView>?
    {
        return luaForm?.GetBindings()?.entries?.associate {
            it.key.toString() to (KTWrap.Wrap(it.value) as LGView)
        }
    }
   actual fun GetView(): LGView?
   {
       return KTWrap.Wrap(luaForm?.GetView()) as LGView?
   }
   actual fun SetView(v: LGView?)
   {
       luaForm?.SetView(v?.lgView)
   }
   actual fun SetViewXML(xml: LuaRef?)
   {
       luaForm?.SetViewXML(xml?.luaRef)
   }
   actual fun SetTitle(str: String?)
   {
       luaForm?.SetTitle(str)
   }
   actual fun Close()
   {
       luaForm?.Close()
   }
    actual fun GetLifecycle() : LuaLifecycle?
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
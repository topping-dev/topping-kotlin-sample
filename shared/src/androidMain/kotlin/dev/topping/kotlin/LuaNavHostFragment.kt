package dev.topping.kotlin

import kotlin.reflect.KCallable

actual open class LuaNavHostFragment : LuaFragment()
{
   var luaNavHostFragment: dev.topping.android.LuaNavHostFragment? = null
   actual companion object {
       actual fun RegisterFragmentEvent(luaId: String, event: Int, func: KCallable<Unit>?)
       {
           val kt: KTWrap<Unit> = KTWrap<Unit>()
           val lt: dev.topping.android.LuaTranslator = dev.topping.android.LuaTranslator(kt, kt.Init(null, func))
           dev.topping.android.LuaFragment.RegisterFragmentEvent(luaId, event, lt)
       }
        actual fun Create(lc: LuaContext, luaId: String?): LuaNavHostFragment
        {
            val pobj = LuaNavHostFragment()
            val pres = dev.topping.android.LuaNavHostFragment.Create(lc.luaContext!!, luaId)
            pobj.SetNativeObject(pres)
            return pobj
        }
        actual fun CreateWithUI(
            lc: LuaContext,
            luaId: String?,
            ui: String?
        ): LuaNavHostFragment
        {
            val pobj = LuaNavHostFragment()
            val pres = dev.topping.android.LuaNavHostFragment.CreateWithUI(lc.luaContext!!, luaId, ui)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual override fun GetContext(): LuaContext?
   {
       val pobj = LuaContext()
       val obj = luaNavHostFragment?.GetContext()
       pobj.SetNativeObject(obj)
       return pobj
   }
   actual override fun IsInitialized(): Boolean
   {
       return luaNavHostFragment?.IsInitialized()!!
   }
   actual override fun GetViewById(lId: String?): LGView?
   {
       return KTWrap.Wrap(luaNavHostFragment?.GetViewById(lId)) as LGView?
   }
   actual override fun GetView(): LGView?
   {
       return KTWrap.Wrap(luaNavHostFragment?.GetView()) as LGView?
   }
   actual override fun SetView(v: LGView?)
   {
       luaNavHostFragment?.SetView(v?.lgView!!)
   }
   actual override fun SetViewXML(xml: String?)
   {
       luaNavHostFragment?.SetViewXML(xml)
   }
   actual override fun SetViewId(luaId: String?)
   {
       luaNavHostFragment?.SetViewId(luaId)
   }
   actual override fun SetTitle(str: String?)
   {
       luaNavHostFragment?.SetTitle(str)
   }
   actual override fun Close()
   {
       luaNavHostFragment?.Close()
   }
    actual override fun getNavController(): LuaNavController {
        return KTWrap.Wrap(luaNavHostFragment?.getNavControllerInternal()) as LuaNavController
    }
    open override fun GetNativeObject(): Any?
   {
       return luaNavHostFragment
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaNavHostFragment = par as dev.topping.android.LuaNavHostFragment?
   }
}
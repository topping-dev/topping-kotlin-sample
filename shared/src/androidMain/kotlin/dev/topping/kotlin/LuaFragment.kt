package dev.topping.kotlin

import kotlin.reflect.KCallable

actual open class LuaFragment : KTInterface
{
   var luaFragment: dev.topping.android.LuaFragment? = null
   actual companion object {
       actual val FRAGMENT_EVENT_CREATE = 0
       actual val FRAGMENT_EVENT_CREATE_VIEW = 1
       actual val FRAGMENT_EVENT_VIEW_CREATED = 2
       actual val FRAGMENT_EVENT_RESUME = 3
       actual val FRAGMENT_EVENT_PAUSE = 4
       actual val FRAGMENT_EVENT_DESTROY = 5

       actual fun RegisterFragmentEvent(luaId: LuaRef?, event: Int, func: KCallable<Any?>?)
       {
           val kt: KTWrap<Any?> = KTWrap()
           val lt: dev.topping.android.LuaTranslator = dev.topping.android.LuaTranslator(kt, kt.Init(null, func))
           dev.topping.android.LuaFragment.RegisterFragmentEvent(luaId?.luaRef!!, event, lt)
       }
        actual fun Create(lc: LuaContext?, luaId: String?): LuaFragment?
        {
            val pobj = LuaFragment()
            val pres = dev.topping.android.LuaFragment.Create(lc?.luaContext!!, luaId)
            pobj.SetNativeObject(pres)
            return pobj
        }
        actual fun CreateWithUI(lc: LuaContext?, luaId: String?, ui: String?): LuaFragment?
        {
            val pobj = LuaFragment()
            val pres = dev.topping.android.LuaFragment.CreateWithUI(lc?.luaContext!!, luaId, ui)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual open fun GetContext(): LuaContext?
   {
       val pobj = LuaContext()
       val obj = luaFragment?.GetContext()
       pobj.SetNativeObject(obj)
       return pobj
   }
   actual open fun IsInitialized(): Boolean?
   {
       return luaFragment?.IsInitialized()
   }
   actual open fun GetViewById(lId: LuaRef?): LGView?
   {
       return KTWrap.Wrap(luaFragment?.GetViewById(lId?.luaRef!!)) as LGView?
   }
   actual open fun GetView(): LGView?
   {
       return KTWrap.Wrap(luaFragment?.GetView()) as LGView?
   }
   actual open fun SetView(v: LGView?)
   {
       luaFragment?.SetView(v?.lgView!!)
   }
   actual open fun SetViewXML(xml: String?)
   {
       luaFragment?.SetViewXML(xml)
   }
   actual open fun SetViewId(luaId: String?)
   {
       luaFragment?.SetViewId(luaId)
   }
   actual open fun SetTitle(str: String?)
   {
       luaFragment?.SetTitle(str)
   }
   actual open fun Close()
   {
       luaFragment?.Close()
   }
    actual open fun getNavController(): LuaNavController {
        return KTWrap.Wrap(luaFragment?.getNavController()) as LuaNavController
    }
    open override fun GetNativeObject(): Any?
   {
       return luaFragment
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaFragment = par as dev.topping.android.LuaFragment?
   }
}
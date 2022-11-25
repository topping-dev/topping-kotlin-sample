package dev.topping.kotlin

import kotlinx.cinterop.StableRef
import kotlin.reflect.KCallable

actual open class LuaFragment : KTInterface
{
   var luaFragment: cocoapods.Topping.LuaFragment? = null
   actual companion object {
       actual val FRAGMENT_EVENT_CREATE = 0
       actual val FRAGMENT_EVENT_CREATE_VIEW = 1
       actual val FRAGMENT_EVENT_VIEW_CREATED = 2
       actual val FRAGMENT_EVENT_RESUME = 3
       actual val FRAGMENT_EVENT_PAUSE = 4
       actual val FRAGMENT_EVENT_DESTROY = 5

        actual fun Create(lc: LuaContext?, luaId: String?): LuaFragment?
        {
            val pobj = LuaFragment()
            val pres = cocoapods.Topping.LuaFragment.Create(lc?.luaContext, luaId)
            pobj.SetNativeObject(pres)
            return pobj
        }
        actual fun CreateWithUI(lc: LuaContext?, luaId: String?, ui: String?): LuaFragment?
        {
            val pobj = LuaFragment()
            val pres = cocoapods.Topping.LuaFragment.CreateWithUI(lc?.luaContext, luaId, ui)
            pobj.SetNativeObject(pres)
            return pobj
        }
       actual fun RegisterFragmentEvent(luaId: String?, event: Int, func: KCallable<Any?>?)
       {
           val kt: KTWrap = KTWrap()
           val lt: cocoapods.Topping.LuaTranslator = cocoapods.Topping.LuaTranslator()
           lt.nobj = StableRef.create(kt).asCPointer()
           lt.kFRetF = kt.Init(this, func)
           cocoapods.Topping.LuaFragment.RegisterFragmentEvent(luaId, event, lt)
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
   actual open fun GetViewById(lId: String?): LGView?
   {
       return KTWrap.Wrap(luaFragment?.GetViewById(lId)) as LGView?
   }
   actual open fun GetView(): LGView?
   {
       return KTWrap.Wrap(luaFragment?.GetView()) as LGView?
   }
   actual open fun SetView(v: LGView?)
   {
       luaFragment?.SetView(v?.lgView)
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
    actual open fun getNavController(): LuaNavController
    {
        return KTWrap.Wrap(luaFragment?.getNavController()) as LuaNavController
    }
    open override fun GetNativeObject(): Any?
   {
       return luaFragment
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaFragment = par as cocoapods.Topping.LuaFragment?
   }
}
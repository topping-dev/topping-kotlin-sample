package dev.topping.kotlin

actual open class LuaFragment : KTInterface
{
   var luaFragment: cocoapods.Topping.LuaFragment? = null
   actual companion object {
        actual fun Create(lc: LuaContext?, luaId: LuaRef?): LuaFragment?
        {
            val pobj = LuaFragment()
            val pres = cocoapods.Topping.LuaFragment.Create(lc?.luaContext, luaId?.luaRef)
            pobj.SetNativeObject(pres)
            return pobj
        }
       actual fun Create(lc: LuaContext?, luaId: LuaRef?, args: MutableMap<String, Any>): LuaFragment?
       {
           val pobj = LuaFragment()
           val pres = cocoapods.Topping.LuaFragment.Create(lc?.luaContext, luaId?.luaRef, args.toNSMutableDictionary())
           pobj.SetNativeObject(pres)
           return pobj
       }
        actual fun CreateWithUI(lc: LuaContext?, luaId: LuaRef?, ui: LuaRef?, args: MutableMap<String, Any>): LuaFragment?
        {
            val pobj = LuaFragment()
            val pres = cocoapods.Topping.LuaFragment.CreateWithUI(lc?.luaContext, luaId?.luaRef, ui?.luaRef, args.toNSMutableDictionary())
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
       return KTWrap.Wrap(luaFragment?.GetViewById(lId?.luaRef)) as LGView?
   }
   actual open fun GetView(): LGView?
   {
       return KTWrap.Wrap(luaFragment?.GetView()) as LGView?
   }
   actual open fun SetView(v: LGView?)
   {
       luaFragment?.SetView(v?.lgView)
   }
   actual open fun SetViewXML(xml: LuaRef?)
   {
       luaFragment?.SetViewXML(xml?.luaRef)
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
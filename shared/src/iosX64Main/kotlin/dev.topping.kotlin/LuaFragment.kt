package dev.topping.kotlin

actual open class LuaFragment : KTInterface
{
   var luaFragment: cocoapods.Topping.LuaFragment? = null
   actual companion object {
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
   }
   actual fun GetContext(): LuaContext?
   {
       val pobj = LuaContext()
       val obj = luaFragment?.GetContext()
       pobj.SetNativeObject(obj)
       return pobj
   }
   actual fun IsInitialized(): Boolean?
   {
       return luaFragment?.IsInitialized()
   }
   actual fun GetViewById(lId: String?): LGView?
   {
       return KTWrap.Wrap(luaFragment?.GetViewById(lId)) as LGView?
   }
   actual fun GetView(): LGView?
   {
       return KTWrap.Wrap(luaFragment?.GetView()) as LGView?
   }
   actual fun SetView(v: LGView?)
   {
       luaFragment?.SetView(v?.lgView)
   }
   actual fun SetViewXML(xml: String?)
   {
       luaFragment?.SetViewXML(xml)
   }
   actual fun SetViewId(luaId: String?)
   {
       luaFragment?.SetViewId(luaId)
   }
   actual fun SetTitle(str: String?)
   {
       luaFragment?.SetTitle(str)
   }
   actual fun Close()
   {
       luaFragment?.Close()
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
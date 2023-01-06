package dev.topping.kotlin

actual open class LuaNavHostFragment : LuaFragment()
{
   var luaNavHostFragment: dev.topping.android.LuaNavHostFragment? = null
   actual override fun GetContext(): LuaContext {
       val pobj = LuaContext()
       val obj = luaNavHostFragment?.GetContext()
       pobj.SetNativeObject(obj)
       return pobj
   }
   actual override fun IsInitialized(): Boolean {
       return luaNavHostFragment?.IsInitialized()!!
   }
   actual override fun GetViewById(lId: LuaRef): LGView?
   {
       return KTWrap.Wrap(luaNavHostFragment?.GetViewById(lId.luaRef!!)) as LGView?
   }
   actual override fun GetView(): LGView?
   {
       return KTWrap.Wrap(luaNavHostFragment?.GetView()) as LGView?
   }
   actual override fun SetView(v: LGView?)
   {
       luaNavHostFragment?.SetView(v?.lgView!!)
   }
   actual override fun SetViewXML(xml: LuaRef)
   {
       luaNavHostFragment?.SetViewXML(xml.luaRef)
   }
   actual override fun SetViewId(luaId: String)
   {
       luaNavHostFragment?.SetViewId(luaId)
   }
   actual override fun SetTitle(str: String)
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
package dev.topping.kotlin

actual open class LuaTabForm : KTInterface
{
   var luaTabForm: cocoapods.Topping.LuaTabForm? = null
   actual companion object {
        actual fun Create(lc: LuaContext?, luaId: String?): LuaTabForm?
        {
            val pobj = LuaTabForm()
            val pres = cocoapods.Topping.LuaTabForm.Create(lc?.luaContext, luaId)
            pobj.SetNativeObject(pres as cocoapods.Topping.LuaTabForm)
            return pobj
        }
   }
   actual fun AddTab(form: Any?, title: String?, image: LuaStream?, ui: String?)
   {
       luaTabForm?.AddTab(form as cocoapods.Topping.LuaForm, title, image?.luaStream, ui)
   }
    open override fun GetNativeObject(): Any?
   {
       return luaTabForm
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaTabForm = par as cocoapods.Topping.LuaTabForm?
   }
}
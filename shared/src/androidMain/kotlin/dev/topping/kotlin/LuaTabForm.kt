package dev.topping.kotlin

actual open class LuaTabForm : KTInterface
{
   var luaTabForm: dev.topping.android.LuaTabForm? = null
   actual companion object {
        actual fun Create(lc: LuaContext?, luaId: String?): LuaTabForm?
        {
            val pobj = LuaTabForm()
            val pres = dev.topping.android.LuaTabForm.Create(lc?.luaContext, luaId)
            pobj.SetNativeObject(pres as dev.topping.android.LuaTabForm)
            return pobj
        }
   }
   actual fun AddTab(form: Any?, title: String?, image: LuaStream?, ui: String?)
   {
       luaTabForm?.AddTab(form, title, image?.luaStream, ui)
   }
    open override fun GetNativeObject(): Any?
   {
       return luaTabForm
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaTabForm = par as dev.topping.android.LuaTabForm?
   }
}
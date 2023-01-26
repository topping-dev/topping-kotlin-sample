package dev.topping.kotlin

actual open class LuaTab : KTInterface
{
   var luaTab: dev.topping.android.LuaTab? = null
    actual companion object {
        actual fun create(): LuaTab {
            val pobj = LuaTab()
            val pres = dev.topping.android.LuaTab.create()
            pobj.SetNativeObject(pres as dev.topping.android.LuaTab)
            return pobj
        }
    }
    actual fun setText(text: String) {
        luaTab?.setText(text)
    }
    actual fun setText(text: LuaRef) {
        luaTab?.setTextRef(text.luaRef)
    }
    actual fun setIcon(icon: LuaRef) {
        luaTab?.setIcon(icon.luaRef)
    }
    actual fun setIcon(icon: LuaStream) {
        luaTab?.setIconStream(icon.luaStream)
    }
    actual fun setCustomView(view: LGView) {
        luaTab?.setCustomView(view.lgView)
    }
    open override fun GetNativeObject(): Any?
   {
       return luaTab
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaTab = par as dev.topping.android.LuaTab?
   }
}
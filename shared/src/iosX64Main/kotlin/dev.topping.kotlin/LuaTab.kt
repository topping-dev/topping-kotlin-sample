package dev.topping.kotlin

actual open class LuaTab : KTInterface
{
   var luaTab: cocoapods.Topping.LuaTab? = null
    actual companion object {
        actual fun Create(): LuaTab {
            val pobj = LuaTab()
            val pres = cocoapods.Topping.LuaTab.Create()
            pobj.SetNativeObject(pres as cocoapods.Topping.LuaTab)
            return pobj
        }
    }
    actual fun SetText(text: String) {
        luaTab?.SetText(text)
    }
    actual fun SetText(text: LuaRef) {
        luaTab?.SetTextRef(text.luaRef)
    }
    actual fun SetIcon(icon: LuaRef) {
        luaTab?.SetIcon(icon.luaRef)
    }
    actual fun SetIcon(icon: LuaStream) {
        luaTab?.SetIconStream(icon.luaStream)
    }
    actual fun SetCustomView(view: LGView) {
        luaTab?.SetCustomView(view.lgView)
    }
    open override fun GetNativeObject(): Any?
   {
       return luaTab
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaTab = par as cocoapods.Topping.LuaTab?
   }
}
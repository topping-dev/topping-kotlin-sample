package dev.topping.kotlin

actual open class LGToolbar : LGView()
{
   var lgToolbar: android.widget.LGToolbar? = null
    actual fun setMenu(ref: LuaRef?)
    {
        lgToolbar?.setMenu(ref?.luaRef)
    }
    actual fun setLogo(logo: LuaRef?)
    {
        lgToolbar?.setLogo(logo?.luaRef)
    }
    actual fun setNavigationIcon(logo: LuaRef?)
    {
        lgToolbar?.setNavigationIcon(logo?.luaRef)
    }
    actual fun setOverflowIcon(logo: LuaRef?)
    {
        lgToolbar?.setOverflowIcon(logo?.luaRef)
    }
    actual fun getTitle() : String?
    {
        return lgToolbar?.getTitle()
    }
    actual fun setTitleInternal(text: String?)
    {
        lgToolbar?.setTitleInternal(text)
    }
    actual fun setTitle(ref: LuaRef?)
    {
        lgToolbar?.setTitle(ref?.luaRef)
    }
    actual fun setTitleTextColor(ref: LuaRef?)
    {
        lgToolbar?.setMenu(ref?.luaRef)
    }
    actual fun setTitleTextApperance(ref: LuaRef?)
    {
        lgToolbar?.setMenu(ref?.luaRef)
    }
    actual fun getSubtitle() : String?
    {
        return lgToolbar?.getSubtitle()
    }
    actual fun setSubtitleInternal(text: String?)
    {
        lgToolbar?.setSubtitleInternal(text)
    }
    actual fun setSubtitle(ref: LuaRef?)
    {
        lgToolbar?.setMenu(ref?.luaRef)
    }
    actual fun setSubtitleTextColor(ref: LuaRef?)
    {
        lgToolbar?.setSubtitleTextColor(ref?.luaRef)
    }
    actual fun setSubtitleTextApperance(ref: LuaRef?)
    {
        lgToolbar?.setSubtitleTextApperance(ref?.luaRef)
    }
    actual fun setNavigationOnClickListener(func: ((LGToolbar) -> Unit)?)
    {
        lgToolbar?.setNavigationOnClickListener(func.toLuaTranslator(this))
    }
    actual fun setMenuItemClickListener(func: ((LGToolbar) -> Unit)?)
    {
        lgToolbar?.setMenuItemClickListener(func.toLuaTranslator(this))
    }
    open override fun GetNativeObject(): Any?
   {
       return lgToolbar
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgToolbar = par as android.widget.LGToolbar?
   }
}
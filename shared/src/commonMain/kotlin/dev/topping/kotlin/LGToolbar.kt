package dev.topping.kotlin

expect open class LGToolbar : LGView
{
    fun setMenu(ref: LuaRef?)
    fun setLogo(logo: LuaRef?)
    fun setNavigationIcon(logo: LuaRef?)
    fun setOverflowIcon(logo: LuaRef?)
    fun getTitle() : String?
    fun setTitleInternal(text: String?)
    fun setTitle(ref: LuaRef?)
    fun setTitleTextColor(ref: LuaRef?)
    fun setTitleTextApperance(ref: LuaRef?)
    fun getSubtitle() : String?
    fun setSubtitleInternal(text: String?)
    fun setSubtitle(ref: LuaRef?)
    fun setSubtitleTextColor(ref: LuaRef?)
    fun setSubtitleTextApperance(ref: LuaRef?)
    fun setNavigationOnClickListener(func: ((LGToolbar) -> Unit)?)
    fun setMenuItemClickListener(func: ((LGToolbar) -> Unit)?)

}
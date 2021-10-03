package dev.topping.kotlin

import kotlin.reflect.KCallable

expect open class LGToolbar : LGView
{
    fun SetMenu(ref: LuaRef?)
    fun SetLogo(logo: LuaStream?)
    fun SetNavigationIcon(logo: LuaStream?)
    fun SetOverflowIcon(logo: LuaStream?)
    fun GetTitle() : String?
    fun SetTitle(text: String?)
    fun SetTitleRef(ref: LuaRef?)
    fun SetTitleTextColor(color: String?)
    fun SetTitleTextColorRef(ref: LuaRef?)
    fun SetTitleTextApperance(ref: LuaRef?)
    fun GetSubtitle() : String?
    fun SetSubtitle(text: String?)
    fun SetSubtitleRef(ref: LuaRef?)
    fun SetSubtitleTextColor(color: String?)
    fun SetSubtitleTextColorRef(ref: LuaRef?)
    fun SetSubtitleTextApperance(ref: LuaRef?)
    fun SetNavigationOnClickListener(func: KCallable<Unit>?)
    fun SetMenuItemClickListener(func: KCallable<Unit>?)

}
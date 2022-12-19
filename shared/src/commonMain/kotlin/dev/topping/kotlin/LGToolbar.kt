package dev.topping.kotlin

import kotlin.reflect.KCallable

expect open class LGToolbar : LGView
{
    fun SetMenu(ref: LuaRef?)
    fun SetLogo(logo: LuaRef?)
    fun SetNavigationIcon(logo: LuaRef?)
    fun SetOverflowIcon(logo: LuaRef?)
    fun GetTitle() : String?
    fun SetTitleInternal(text: String?)
    fun SetTitle(ref: LuaRef?)
    fun SetTitleTextColor(ref: LuaRef?)
    fun SetTitleTextApperance(ref: LuaRef?)
    fun GetSubtitle() : String?
    fun SetSubtitleInternal(text: String?)
    fun SetSubtitle(ref: LuaRef?)
    fun SetSubtitleTextColor(ref: LuaRef?)
    fun SetSubtitleTextApperance(ref: LuaRef?)
    fun SetNavigationOnClickListener(func: KCallable<Unit>?)
    fun SetMenuItemClickListener(func: KCallable<Unit>?)

}
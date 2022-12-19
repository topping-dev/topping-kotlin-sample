package dev.topping.kotlin

import kotlin.reflect.KCallable

actual open class LGToolbar : LGView()
{
   var lgToolbar: android.widget.LGToolbar? = null
    actual fun SetMenu(ref: LuaRef?)
    {
        lgToolbar?.SetMenu(ref?.luaRef)
    }
    actual fun SetLogo(logo: LuaRef?)
    {
        lgToolbar?.SetLogo(logo?.luaRef)
    }
    actual fun SetNavigationIcon(logo: LuaRef?)
    {
        lgToolbar?.SetNavigationIcon(logo?.luaRef)
    }
    actual fun SetOverflowIcon(logo: LuaRef?)
    {
        lgToolbar?.SetOverflowIcon(logo?.luaRef)
    }
    actual fun GetTitle() : String?
    {
        return lgToolbar?.GetTitle()
    }
    actual fun SetTitleInternal(text: String?)
    {
        lgToolbar?.SetTitleInternal(text)
    }
    actual fun SetTitle(ref: LuaRef?)
    {
        lgToolbar?.SetTitle(ref?.luaRef)
    }
    actual fun SetTitleTextColor(ref: LuaRef?)
    {
        lgToolbar?.SetMenu(ref?.luaRef)
    }
    actual fun SetTitleTextApperance(ref: LuaRef?)
    {
        lgToolbar?.SetMenu(ref?.luaRef)
    }
    actual fun GetSubtitle() : String?
    {
        return lgToolbar?.GetSubtitle()
    }
    actual fun SetSubtitleInternal(text: String?)
    {
        lgToolbar?.SetSubtitleInternal(text)
    }
    actual fun SetSubtitle(ref: LuaRef?)
    {
        lgToolbar?.SetMenu(ref?.luaRef)
    }
    actual fun SetSubtitleTextColor(ref: LuaRef?)
    {
        lgToolbar?.SetSubtitleTextColor(ref?.luaRef)
    }
    actual fun SetSubtitleTextApperance(ref: LuaRef?)
    {
        lgToolbar?.SetSubtitleTextApperance(ref?.luaRef)
    }
    actual fun SetNavigationOnClickListener(func: KCallable<Unit>?)
    {
        val kt: KTWrap<Unit> = KTWrap<Unit>()
        val lt: dev.topping.android.LuaTranslator = dev.topping.android.LuaTranslator(kt, kt.Init(this, func))
        lgToolbar?.SetNavigationOnClickListener(lt)
    }
    actual fun SetMenuItemClickListener(func: KCallable<Unit>?)
    {
        val kt: KTWrap<Unit> = KTWrap<Unit>()
        val lt: dev.topping.android.LuaTranslator = dev.topping.android.LuaTranslator(kt, kt.Init(this, func))
        lgToolbar?.SetMenuItemClickListener(lt)
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
package dev.topping.kotlin

import kotlin.reflect.KCallable

actual open class LGToolbar : LGView()
{
   var lgToolbar: android.widget.LGToolbar? = null
    actual fun SetMenu(ref: LuaRef?)
    {
        lgToolbar?.SetMenu(ref?.GetNativeObject() as dev.topping.android.luagui.LuaRef)
    }
    actual fun SetLogo(logo: LuaStream?)
    {
        lgToolbar?.SetLogo(logo?.GetNativeObject() as dev.topping.android.LuaStream)
    }
    actual fun SetNavigationIcon(logo: LuaStream?)
    {
        lgToolbar?.SetNavigationIcon(logo?.GetNativeObject() as dev.topping.android.LuaStream)
    }
    actual fun SetOverflowIcon(logo: LuaStream?)
    {
        lgToolbar?.SetOverflowIcon(logo?.GetNativeObject() as dev.topping.android.LuaStream)
    }
    actual fun GetTitle() : String?
    {
        return lgToolbar?.GetTitle()
    }
    actual fun SetTitle(text: String?)
    {
        lgToolbar?.SetTitle(text)
    }
    actual fun SetTitleRef(ref: LuaRef?)
    {
        lgToolbar?.SetTitleRef(ref?.GetNativeObject() as dev.topping.android.luagui.LuaRef)
    }
    actual fun SetTitleTextColor(color: String?)
    {
        lgToolbar?.SetTitleTextColor(color)
    }
    actual fun SetTitleTextColorRef(ref: LuaRef?)
    {
        lgToolbar?.SetMenu(ref?.GetNativeObject() as dev.topping.android.luagui.LuaRef)
    }
    actual fun SetTitleTextApperance(ref: LuaRef?)
    {
        lgToolbar?.SetMenu(ref?.GetNativeObject() as dev.topping.android.luagui.LuaRef)
    }
    actual fun GetSubtitle() : String?
    {
        return lgToolbar?.GetSubtitle()
    }
    actual fun SetSubtitle(text: String?)
    {
        lgToolbar?.SetSubtitle(text)
    }
    actual fun SetSubtitleRef(ref: LuaRef?)
    {
        lgToolbar?.SetMenu(ref?.GetNativeObject() as dev.topping.android.luagui.LuaRef)
    }
    actual fun SetSubtitleTextColor(color: String?)
    {
        lgToolbar?.SetSubtitleTextColor(color)
    }
    actual fun SetSubtitleTextColorRef(ref: LuaRef?)
    {
        lgToolbar?.SetSubtitleTextColorRef(ref?.GetNativeObject() as dev.topping.android.luagui.LuaRef)
    }
    actual fun SetSubtitleTextApperance(ref: LuaRef?)
    {
        lgToolbar?.SetSubtitleTextApperance(ref?.GetNativeObject() as dev.topping.android.luagui.LuaRef)
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
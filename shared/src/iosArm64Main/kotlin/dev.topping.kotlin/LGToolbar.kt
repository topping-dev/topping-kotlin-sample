package dev.topping.kotlin

import kotlinx.cinterop.StableRef
import kotlin.reflect.KCallable

actual open class LGToolbar : LGView()
{
   var lgToolbar: cocoapods.Topping.LGToolbar? = null
    actual fun SetMenu(ref: LuaRef?)
    {
        lgToolbar?.SetMenu(ref?.GetNativeObject() as cocoapods.Topping.LuaRef)
    }
    actual fun SetLogo(logo: LuaStream?)
    {
        lgToolbar?.SetLogo(logo?.GetNativeObject() as cocoapods.Topping.LuaStream)
    }
    actual fun SetNavigationIcon(logo: LuaStream?)
    {
        lgToolbar?.SetNavigationIcon(logo?.GetNativeObject() as cocoapods.Topping.LuaStream)
    }
    actual fun SetOverflowIcon(logo: LuaStream?)
    {
        lgToolbar?.SetOverflowIcon(logo?.GetNativeObject() as cocoapods.Topping.LuaStream)
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
        lgToolbar?.SetTitleRef(ref?.GetNativeObject() as cocoapods.Topping.LuaRef)
    }
    actual fun SetTitleTextColor(color: String?)
    {
        lgToolbar?.SetTitleTextColor(color)
    }
    actual fun SetTitleTextColorRef(ref: LuaRef?)
    {
        lgToolbar?.SetMenu(ref?.GetNativeObject() as cocoapods.Topping.LuaRef)
    }
    actual fun SetTitleTextApperance(ref: LuaRef?)
    {
        lgToolbar?.SetMenu(ref?.GetNativeObject() as cocoapods.Topping.LuaRef)
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
        lgToolbar?.SetMenu(ref?.GetNativeObject() as cocoapods.Topping.LuaRef)
    }
    actual fun SetSubtitleTextColor(color: String?)
    {
        lgToolbar?.SetSubtitleTextColor(color)
    }
    actual fun SetSubtitleTextColorRef(ref: LuaRef?)
    {
        lgToolbar?.SetSubtitleTextColorRef(ref?.GetNativeObject() as cocoapods.Topping.LuaRef)
    }
    actual fun SetSubtitleTextApperance(ref: LuaRef?)
    {
        lgToolbar?.SetSubtitleTextApperance(ref?.GetNativeObject() as cocoapods.Topping.LuaRef)
    }
    actual fun SetNavigationOnClickListener(func: KCallable<Unit>?)
    {
        val kt: KTWrap = KTWrap()
        val lt: cocoapods.Topping.LuaTranslator = cocoapods.Topping.LuaTranslator()
        lt.nobj = StableRef.create(kt).asCPointer()
        lt.kFRetF = kt.Init(this, func)
        lgToolbar?.SetNavigationOnClickListener(lt)
    }
    actual fun SetMenuItemClickListener(func: KCallable<Unit>?)
    {
        val kt: KTWrap = KTWrap()
        val lt: cocoapods.Topping.LuaTranslator = cocoapods.Topping.LuaTranslator()
        lt.nobj = StableRef.create(kt).asCPointer()
        lt.kFRetF = kt.Init(this, func)
        lgToolbar?.SetMenuItemClickListener(lt)
    }
    open override fun GetNativeObject(): Any?
   {
       return lgToolbar
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgToolbar = par as cocoapods.Topping.LGToolbar?
   }
}
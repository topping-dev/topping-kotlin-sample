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
        lgToolbar?.SetTitleTextColor(ref?.luaRef)
    }
    actual fun SetTitleTextApperance(ref: LuaRef?)
    {
        lgToolbar?.SetTitleTextApperance(ref?.luaRef)
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
        lgToolbar?.SetSubtitle(ref?.luaRef)
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
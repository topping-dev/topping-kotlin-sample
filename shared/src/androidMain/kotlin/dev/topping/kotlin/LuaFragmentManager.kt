package dev.topping.kotlin

import androidx.fragment.app.FragmentManager

actual open class LuaFragmentManager : KTInterface
{
   var luaFragmentManager: dev.topping.android.LuaFragmentManager? = null

    actual companion object {
        actual fun findFragment(view: LGView) : LuaFragment? {
            return KTWrap.Wrap(FragmentManager.findFragment((KTWrap.UnWrap(view) as android.widget.LGView).view)) as LuaFragment?
        }
    }

    actual fun findFragmentById(id: Any) : LuaFragment? {
        val fragment = luaFragmentManager?.findFragmentById((id as LuaRef).luaRef?.ref ?: 0)
        if(fragment == null)
            return null
        return KTWrap.Wrap(fragment) as LuaFragment?
    }

    actual fun findFragmentByTag(tag: String) : LuaFragment? {
        return KTWrap.Wrap(luaFragmentManager?.findFragmentByTag(tag)) as LuaFragment?
    }

    open override fun GetNativeObject(): Any?
    {
        return luaFragmentManager
    }
    open override fun SetNativeObject(par :Any?)
    {
        luaFragmentManager = par as dev.topping.android.LuaFragmentManager?
    }
}
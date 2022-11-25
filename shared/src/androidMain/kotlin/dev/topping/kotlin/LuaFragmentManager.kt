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
        return KTWrap.Wrap(luaFragmentManager?.findFragmentById(id as Int)) as LuaFragment?
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
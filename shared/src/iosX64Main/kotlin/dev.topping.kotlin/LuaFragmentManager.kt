package dev.topping.kotlin

actual open class LuaFragmentManager : KTInterface
{
   var luaFragmentManager: cocoapods.Topping.FragmentManager? = null
    actual companion object {
        actual fun findFragment(view: LGView) : LuaFragment?
        {
            return KTWrap.Wrap(cocoapods.Topping.FragmentManager.findFragmentWithView(KTWrap.UnWrap(view) as cocoapods.Topping.LGView)) as LuaFragment?
        }
    }

    actual fun findFragmentById(id: Any) : LuaFragment?
    {
        val idVal = if(id is LuaRef) id.luaRef?.GetCleanId() ?: "" else id as String
        return KTWrap.Wrap(luaFragmentManager?.findFragmentByIdWithId(idVal)) as LuaFragment?
    }

    actual fun findFragmentByTag(tag: String) : LuaFragment?
    {
        return KTWrap.Wrap(luaFragmentManager?.findFragmentByTagWithTag(tag)) as LuaFragment?
    }

    open override fun GetNativeObject(): Any?
    {
        return luaFragmentManager
    }
    open override fun SetNativeObject(par :Any?)
    {
        luaFragmentManager = par as cocoapods.Topping.FragmentManager?
    }
}
package dev.topping.kotlin

actual open class LuaDispatchers : KTInterface
{
   var luaDispatchers: cocoapods.Topping.LuaDispatchers? = null

    actual companion object {
        actual val DEFAULT: Int = 0
        actual val MAIN: Int = 1
        actual val UNCONFINED: Int = 2
        actual val IO: Int = 3
    }

    open override fun GetNativeObject(): Any?
    {
        return luaDispatchers
    }
    open override fun SetNativeObject(par :Any?)
    {
        luaDispatchers = par as cocoapods.Topping.LuaDispatchers?
    }
}
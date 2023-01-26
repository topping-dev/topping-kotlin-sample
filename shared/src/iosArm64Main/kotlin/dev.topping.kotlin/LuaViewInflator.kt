package dev.topping.kotlin

actual open class LuaViewInflator : KTInterface
{
   var luaViewInflator: cocoapods.Topping.LuaViewInflator? = null
   actual companion object {
        actual fun create(lc: LuaContext): LuaViewInflator {
            val pobj = LuaViewInflator()
            val pres = cocoapods.Topping.LuaViewInflator.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun parseFile(filename: String, parent: LGView?): LGView?
   {
       return KTWrap.Wrap(luaViewInflator?.parseFile(filename, parent?.lgView)) as LGView?
   }
    actual fun inflate(id: LuaRef, parent: LGView?): LGView?
    {
        return KTWrap.Wrap(luaViewInflator?.inflate(id.luaRef, parent?.lgView)) as LGView?
    }
    open override fun GetNativeObject(): Any?
   {
       return luaViewInflator
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaViewInflator = par as cocoapods.Topping.LuaViewInflator?
   }
}
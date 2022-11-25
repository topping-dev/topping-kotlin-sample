package dev.topping.kotlin

actual open class LuaViewInflator : KTInterface
{
   var luaViewInflator: cocoapods.Topping.LuaViewInflator? = null
   actual companion object {
        actual fun Create(lc: LuaContext?): LuaViewInflator?
        {
            val pobj = LuaViewInflator()
            val pres = cocoapods.Topping.LuaViewInflator.Create(lc?.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun ParseFile(filename: String?, parent: LGView?): LGView?
   {
       return KTWrap.Wrap(luaViewInflator?.ParseFile(filename, parent?.lgView)) as LGView?
   }
    actual fun Inflate(id: LuaRef, parent: LGView?): LGView?
    {
        return KTWrap.Wrap(luaViewInflator?.Inflate(id.luaRef, parent?.lgView)) as LGView?
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
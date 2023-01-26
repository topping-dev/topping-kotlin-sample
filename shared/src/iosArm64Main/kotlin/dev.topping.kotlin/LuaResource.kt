package dev.topping.kotlin

actual open class LuaResource : KTInterface
{
   var luaResource: cocoapods.Topping.LuaResource? = null
   actual companion object {
        actual fun getResourceAssetSd(path: String, resName: String): LuaStream?
        {
            val pobj = LuaStream()
            val pres = cocoapods.Topping.LuaResource.getResourceAssetSd(path, resName)
            pobj.SetNativeObject(pres)
            return pobj
        }
        actual fun getResourceSdAsset(path: String, resName: String): LuaStream?
        {
            val pobj = LuaStream()
            val pres = cocoapods.Topping.LuaResource.getResourceSdAsset(path, resName)
            pobj.SetNativeObject(pres)
            return pobj
        }
        actual fun getResourceAsset(path: String, resName: String): LuaStream?
        {
            val pobj = LuaStream()
            val pres = cocoapods.Topping.LuaResource.getResourceAsset(path, resName)
            pobj.SetNativeObject(pres)
            return pobj
        }
        actual fun getResourceSd(path: String, resName: String): LuaStream?
        {
            val pobj = LuaStream()
            val pres = cocoapods.Topping.LuaResource.getResourceSd(path, resName)
            pobj.SetNativeObject(pres)
            return pobj
        }
        actual fun getResource(path: String, resName: String): LuaStream?
        {
            val pobj = LuaStream()
            val pres = cocoapods.Topping.LuaResource.getResource(path, resName)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
    open override fun GetNativeObject(): Any?
   {
       return luaResource
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaResource = par as cocoapods.Topping.LuaResource?
   }
}
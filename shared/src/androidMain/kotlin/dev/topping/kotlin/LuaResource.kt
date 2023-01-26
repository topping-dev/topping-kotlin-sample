package dev.topping.kotlin

actual open class LuaResource : KTInterface
{
   var luaResource: dev.topping.android.LuaResource? = null
   actual companion object {
        actual fun getResourceAssetSd(path: String, resName: String): LuaStream?
        {
            val pobj = LuaStream()
            val pres = dev.topping.android.LuaResource.getResourceAssetSd(path, resName)
            pobj.SetNativeObject(pres)
            return pobj
        }
        actual fun getResourceSdAsset(path: String, resName: String): LuaStream?
        {
            val pobj = LuaStream()
            val pres = dev.topping.android.LuaResource.getResourceSdAsset(path, resName)
            pobj.SetNativeObject(pres)
            return pobj
        }
        actual fun getResourceAsset(path: String, resName: String): LuaStream?
        {
            val pobj = LuaStream()
            val pres = dev.topping.android.LuaResource.getResourceAsset(path, resName)
            pobj.SetNativeObject(pres)
            return pobj
        }
        actual fun getResourceSd(path: String, resName: String): LuaStream?
        {
            val pobj = LuaStream()
            val pres = dev.topping.android.LuaResource.getResourceSd(path, resName)
            pobj.SetNativeObject(pres)
            return pobj
        }
        actual fun getResource(path: String, resName: String): LuaStream?
        {
            val pobj = LuaStream()
            val pres = dev.topping.android.LuaResource.getResource(path, resName)
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
       luaResource = par as dev.topping.android.LuaResource?
   }
}
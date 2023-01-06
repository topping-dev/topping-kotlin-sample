package dev.topping.kotlin

actual open class LuaResource : KTInterface
{
   var luaResource: dev.topping.android.LuaResource? = null
   actual companion object {
        actual fun GetResourceAssetSd(path: String, resName: String): LuaStream?
        {
            val pobj = LuaStream()
            val pres = dev.topping.android.LuaResource.GetResourceAssetSd(path, resName)
            pobj.SetNativeObject(pres)
            return pobj
        }
        actual fun GetResourceSdAsset(path: String, resName: String): LuaStream?
        {
            val pobj = LuaStream()
            val pres = dev.topping.android.LuaResource.GetResourceSdAsset(path, resName)
            pobj.SetNativeObject(pres)
            return pobj
        }
        actual fun GetResourceAsset(path: String, resName: String): LuaStream?
        {
            val pobj = LuaStream()
            val pres = dev.topping.android.LuaResource.GetResourceAsset(path, resName)
            pobj.SetNativeObject(pres)
            return pobj
        }
        actual fun GetResourceSd(path: String, resName: String): LuaStream?
        {
            val pobj = LuaStream()
            val pres = dev.topping.android.LuaResource.GetResourceSd(path, resName)
            pobj.SetNativeObject(pres)
            return pobj
        }
        actual fun GetResource(path: String, resName: String): LuaStream?
        {
            val pobj = LuaStream()
            val pres = dev.topping.android.LuaResource.GetResource(path, resName)
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
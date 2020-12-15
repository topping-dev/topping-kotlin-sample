package dev.topping.kotlin

expect open class LuaResource
{
   companion object {
        fun GetResourceAssetSd(path: String?, resName: String?): LuaStream?
        fun GetResourceSdAsset(path: String?, resName: String?): LuaStream?
        fun GetResourceAsset(path: String?, resName: String?): LuaStream?
        fun GetResourceSd(path: String?, resName: String?): LuaStream?
        fun GetResource(path: String?, resName: String?): LuaStream?
   }
}
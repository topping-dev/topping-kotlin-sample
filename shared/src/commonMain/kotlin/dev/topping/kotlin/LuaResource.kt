package dev.topping.kotlin

expect open class LuaResource
{
   companion object {
        fun getResourceAssetSd(path: String, resName: String): LuaStream?
        fun getResourceSdAsset(path: String, resName: String): LuaStream?
        fun getResourceAsset(path: String, resName: String): LuaStream?
        fun getResourceSd(path: String, resName: String): LuaStream?
        fun getResource(path: String, resName: String): LuaStream?
   }
}
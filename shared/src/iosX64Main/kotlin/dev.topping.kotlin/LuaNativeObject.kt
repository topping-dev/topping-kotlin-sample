package dev.topping.kotlin

actual open class LuaNativeObject : KTInterface
{
   var luaNativeObject: cocoapods.toppingios.LuaNativeObject? = null
    open override fun GetNativeObject(): Any?
   {
       return luaNativeObject
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaNativeObject = par as cocoapods.toppingios.LuaNativeObject?
   }
}
package dev.topping.kotlin

import cocoapods.Topping.LuaNativeObject
import kotlinx.cinterop.StableRef
import platform.darwin.NSObject
import kotlin.reflect.KCallable

actual open class LuaHttpClient : KTInterface
{
   var luaHttpClient: cocoapods.Topping.LuaHttpClient? = null
   actual companion object {
        actual fun Create(tag: String): LuaHttpClient {
            val pobj = LuaHttpClient()
            val pres = cocoapods.Topping.LuaHttpClient.Create(tag)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun SetContentType(type: String)
   {
       luaHttpClient?.SetContentType(type)
   }
   actual fun StartForm(): LuaObjectStore?
   {
       val pobj = LuaObjectStore()
       val obj = luaHttpClient?.StartForm()
       pobj.SetNativeObject(obj)
       return pobj
   }
   actual fun AppendPostData(formData: Any?, name: String?, value: String?)
   {
       luaHttpClient?.AppendPostData(formData as LuaNativeObject, name, value)
   }
   actual fun AppendFileData(formData: Any?, name: String?, file: Any?)
   {
       luaHttpClient?.AppendFileData(formData as LuaNativeObject, name, file as NSObject)
   }
   actual fun EndForm(formData: Any?)
   {
       luaHttpClient?.EndForm(formData as LuaNativeObject)
   }
   actual fun StartAsyncLoadForm(url: String?, formData: Any?, tag: String?)
   {
       luaHttpClient?.StartAsyncLoadForm(url, formData as LuaNativeObject, tag)
   }
   actual fun StartAsyncLoad(url: String?, data: String?, tag: String?)
   {
       luaHttpClient?.StartAsyncLoad(url, data, tag)
   }
   actual fun StartAsyncLoadGet(url: String?, tag: String?)
   {
       luaHttpClient?.StartAsyncLoadGet(url, tag)
   }
   actual fun StartLoad(url: String?, data: String?): String?
   {
       return luaHttpClient?.StartLoad(url, data)
   }
   actual fun StartLoadGet(url: String?): String?
   {
       return luaHttpClient?.StartLoadGet(url)
   }
   actual fun SetTimeout(timeout: Int?)
   {
       luaHttpClient?.SetTimeout(timeout!!)
   }
   actual fun SetOnFinishListener(func: KCallable<Unit>?)
   {
       luaHttpClient?.SetOnFinishListener(func.toLuaTranslator(this))
   }
   actual fun SetOnFailListener(func: KCallable<Unit>?)
   {
       luaHttpClient?.SetOnFailListener(func.toLuaTranslator(this))
   }
    open override fun GetNativeObject(): Any?
   {
       return luaHttpClient
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaHttpClient = par as cocoapods.Topping.LuaHttpClient?
   }
}
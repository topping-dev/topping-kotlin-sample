package dev.topping.kotlin

actual open class LuaHttpClient : KTInterface
{
   var luaHttpClient: dev.topping.android.LuaHttpClient? = null
   actual companion object {
        actual fun Create(tag: String): LuaHttpClient {
            val pobj = LuaHttpClient()
            val pres = dev.topping.android.LuaHttpClient.Create(tag)
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
       luaHttpClient?.AppendPostData(formData, name, value)
   }
   actual fun AppendFileData(formData: Any?, name: String?, file: Any?)
   {
       luaHttpClient?.AppendFileData(formData, name, file)
   }
   actual fun EndForm(formData: Any?)
   {
       luaHttpClient?.EndForm(formData)
   }
   actual fun StartAsyncLoadForm(url: String?, formData: Any?, tag: String?)
   {
       luaHttpClient?.StartAsyncLoadForm(url, formData, tag)
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
       luaHttpClient?.SetTimeout(timeout)
   }
   actual fun SetOnFinishListener(func: ((LuaHttpClient, String) -> Unit)?)
   {
       luaHttpClient?.SetOnFinishListener(func.toLuaTranslator(this))
   }
   actual fun SetOnFailListener(func: ((LuaHttpClient, String) -> Unit)?)
   {
       luaHttpClient?.SetOnFailListener(func.toLuaTranslator(this))
   }
    open override fun GetNativeObject(): Any?
   {
       return luaHttpClient
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaHttpClient = par as dev.topping.android.LuaHttpClient?
   }
}
package dev.topping.kotlin

expect open class LuaHttpClient
{
   companion object {
        fun create(tag: String): LuaHttpClient
   }
   fun setContentType(type: String)
   fun startForm(): LuaObjectStore?
   fun appendPostData(formData: Any?, name: String?, value: String?)
   fun appendFileData(formData: Any?, name: String?, file: Any?)
   fun endForm(formData: Any?)
   fun startAsyncLoadForm(url: String?, formData: Any?, tag: String?)
   fun startAsyncLoad(url: String?, data: String?, tag: String?)
   fun startAsyncLoadGet(url: String?, tag: String?)
   fun startLoad(url: String?, data: String?): String?
   fun startLoadGet(url: String?): String?
   fun setTimeout(timeout: Int?)
   fun setOnFinishListener(func: ((LuaHttpClient, String) -> Unit)?)
   fun setOnFailListener(func: ((LuaHttpClient, String) -> Unit)?)
}
package dev.topping.kotlin

import kotlin.reflect.KCallable

expect open class LuaHttpClient
{
   companion object {
        fun Create(tag: String): LuaHttpClient
   }
   fun SetContentType(type: String)
   fun StartForm(): LuaObjectStore?
   fun AppendPostData(formData: Any?, name: String?, value: String?)
   fun AppendFileData(formData: Any?, name: String?, file: Any?)
   fun EndForm(formData: Any?)
   fun StartAsyncLoadForm(url: String?, formData: Any?, tag: String?)
   fun StartAsyncLoad(url: String?, data: String?, tag: String?)
   fun StartAsyncLoadGet(url: String?, tag: String?)
   fun StartLoad(url: String?, data: String?): String?
   fun StartLoadGet(url: String?): String?
   fun SetTimeout(timeout: Int?)
   fun SetOnFinishListener(func: KCallable<Unit>?)
   fun SetOnFailListener(func: KCallable<Unit>?)
}
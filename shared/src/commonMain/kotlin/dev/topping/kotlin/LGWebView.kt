package dev.topping.kotlin

import kotlin.reflect.KCallable

expect open class LGWebView : LGView
{
   companion object {
        fun Create(lc: LuaContext): LGWebView
   }
    fun SetConfiguration(enableJavascript: Boolean, enableDomStorage: Boolean)
    fun Load(url: String)
    fun LoadData(data: String, mimeType: String, encoding: String, baseUrl: String)
    fun StopLoading()
    fun IsLoading(): Boolean
    fun CanGoBack(): Boolean
    fun CanGoForward(): Boolean
    fun GoBack()
    fun GoForward()
    fun SetReqestAction(func: KCallable<Unit>?)
}
package dev.topping.kotlin

expect open class LGWebView : LGView
{
   companion object {
        fun create(lc: LuaContext): LGWebView
   }
    fun setConfiguration(enableJavascript: Boolean, enableDomStorage: Boolean)
    fun load(url: String)
    fun loadData(data: String, mimeType: String, encoding: String, baseUrl: String)
    fun stopLoading()
    fun isLoading(): Boolean
    fun canGoBack(): Boolean
    fun canGoForward(): Boolean
    fun goBack()
    fun goForward()
    fun setReqestAction(func: ((LGWebView, String) -> Boolean)?)
}
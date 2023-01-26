package dev.topping.kotlin

actual open class LGWebView : LGView()
{
   var lgWebView: cocoapods.Topping.LGWebView? = null
   actual companion object {
        actual fun create(lc: LuaContext): LGWebView {
            val pobj = LGWebView()
            val pres = cocoapods.Topping.LGButton.create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
    actual fun setConfiguration(enableJavascript: Boolean, enableDomStorage: Boolean) {
        lgWebView?.setConfiguration(enableJavascript, enableDomStorage)
    }

    actual fun load(url: String) {
        lgWebView?.load(url)
    }

    actual fun loadData(data: String, mimeType: String, encoding: String, baseUrl: String) {
        lgWebView?.loadData(data, mimeType, encoding, baseUrl)
    }

    actual fun stopLoading() {
        lgWebView?.stopLoading()
    }

    actual fun isLoading(): Boolean {
        return lgWebView?.isLoading()!!
    }

    actual fun canGoBack(): Boolean {
        return lgWebView?.canGoBack()!!
    }

    actual fun canGoForward(): Boolean {
        return lgWebView?.canGoForward()!!
    }

    actual fun goBack() {
        lgWebView?.goBack()
    }

    actual fun goForward() {
        lgWebView?.goForward()
    }

    actual fun setReqestAction(func: ((LGWebView, String) -> Boolean)?) {
        lgWebView?.setRequestAction(func.toLuaTranslator(this))
    }

    open override fun GetNativeObject(): Any?
   {
       return lgWebView
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgWebView = par as cocoapods.Topping.LGWebView?
   }
}
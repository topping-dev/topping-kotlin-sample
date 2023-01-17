package dev.topping.kotlin

actual open class LGWebView : LGView()
{
   var lgWebView: android.widget.LGWebView? = null
   actual companion object {
        actual fun Create(lc: LuaContext): LGWebView {
            val pobj = LGWebView()
            val pres = android.widget.LGButton.Create(lc.luaContext)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
    actual fun SetConfiguration(enableJavascript: Boolean, enableDomStorage: Boolean) {
        lgWebView?.SetConfiguration(enableJavascript, enableDomStorage)
    }

    actual fun Load(url: String) {
        lgWebView?.Load(url)
    }

    actual fun LoadData(data: String, mimeType: String, encoding: String, baseUrl: String) {
        lgWebView?.LoadData(data, mimeType, encoding, baseUrl)
    }

    actual fun StopLoading() {
        lgWebView?.StopLoading()
    }

    actual fun IsLoading(): Boolean {
        return lgWebView?.IsLoading()!!
    }

    actual fun CanGoBack(): Boolean {
        return lgWebView?.CanGoBack()!!
    }

    actual fun CanGoForward(): Boolean {
        return lgWebView?.CanGoForward()!!
    }

    actual fun GoBack() {
        lgWebView?.GoBack()
    }

    actual fun GoForward() {
        lgWebView?.GoForward()
    }

    actual fun SetReqestAction(func: ((LGWebView, String) -> Boolean)?) {
        lgWebView?.SetRequestAction(func.toLuaTranslator(this))
    }

    open override fun GetNativeObject(): Any?
   {
       return lgWebView
   }
    open override fun SetNativeObject(par :Any?)
   {
       super.SetNativeObject(par)
       lgWebView = par as android.widget.LGWebView?
   }
}
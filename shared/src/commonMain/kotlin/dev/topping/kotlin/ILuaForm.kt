package dev.topping.kotlin

expect open class ILuaForm(form: Any) {
    open fun onCreate()
    open fun onResume()
    open fun onPause()
    open fun onDestroy()
    fun getForm(): LuaForm
}
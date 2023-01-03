package dev.topping.kotlin

expect open class LuaTab
{
   companion object {
        fun Create(): LuaTab
   }
    fun SetText(text: String)
    fun SetText(text: LuaRef)
    fun SetIcon(icon: LuaRef)
    fun SetIcon(icon: LuaStream)
    fun SetCustomView(view: LGView)
}
package dev.topping.kotlin

expect open class LuaTab
{
   companion object {
        fun create(): LuaTab
   }
    fun setText(text: String)
    fun setText(text: LuaRef)
    fun setIcon(icon: LuaRef)
    fun setIcon(icon: LuaStream)
    fun setCustomView(view: LGView)
}
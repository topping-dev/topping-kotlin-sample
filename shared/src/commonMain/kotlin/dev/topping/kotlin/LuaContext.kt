package dev.topping.kotlin

expect open class LuaContext
{
   companion object {
        fun createLuaContext(context: Any): LuaContext
   }
    fun getForm(): LuaForm
    fun startForm(luaFormIntent: LuaFormIntent)
}
package dev.topping.kotlin

expect open class LuaContext
{
   companion object {
        fun CreateLuaContext(context: Any): LuaContext
   }
    fun GetForm(): LuaForm
    fun StartForm(luaFormIntent: LuaFormIntent)
}
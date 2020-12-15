package dev.topping.kotlin

expect open class LuaTabForm
{
   companion object {
        fun Create(lc: LuaContext?, luaId: String?): LuaTabForm?
   }
   fun AddTab(form: Any?, title: String?, image: LuaStream?, ui: String?)
}
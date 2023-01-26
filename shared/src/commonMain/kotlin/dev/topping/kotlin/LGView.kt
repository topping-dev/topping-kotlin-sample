package dev.topping.kotlin

expect open class LGView
{
   companion object {
        fun create(lc: LuaContext): LGView
   }
   fun getViewById(lId: LuaRef): LGView?
   fun setEnabled(value: Boolean)
   fun setFocusable(value: Boolean)
   fun setBackground(background: LuaRef?)
   fun setOnClickListener(func: ((LGView, LuaContext) -> Unit)?)
   fun findNavController() : LuaNavController
}
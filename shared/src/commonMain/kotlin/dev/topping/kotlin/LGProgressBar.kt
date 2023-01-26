package dev.topping.kotlin

expect open class LGProgressBar : LGView
{
   companion object {
        fun create(lc: LuaContext): LGProgressBar
   }
   fun setProgress(v: Int)
   fun setMax(v: Int)
   fun setIndeterminate(v: Boolean)
}
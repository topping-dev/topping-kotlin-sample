package dev.topping.kotlin

expect open class LGProgressBar : LGView
{
   companion object {
        fun Create(lc: LuaContext): LGProgressBar
   }
   fun SetProgress(v: Int)
   fun SetMax(v: Int)
   fun SetIndeterminate(v: Boolean)
}
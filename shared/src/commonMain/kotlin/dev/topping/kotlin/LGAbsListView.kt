package dev.topping.kotlin

expect open class LGAbsListView : LGViewGroup
{
   companion object {
        fun create(lc: LuaContext): LGAbsListView?
   }
}
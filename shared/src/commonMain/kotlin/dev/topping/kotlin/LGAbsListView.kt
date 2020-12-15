package dev.topping.kotlin

expect open class LGAbsListView : LGViewGroup
{
   companion object {
        fun Create(lc: LuaContext?): LGAbsListView?
   }
}
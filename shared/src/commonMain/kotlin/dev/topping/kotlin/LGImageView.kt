package dev.topping.kotlin

expect open class LGImageView : LGView
{
   companion object {
        fun Create(lc: LuaContext?, luaId: String?): LGImageView?
   }
   fun SetImage(stream: LuaStream?)
   fun SetImageRef(ref: LuaRef?)
}
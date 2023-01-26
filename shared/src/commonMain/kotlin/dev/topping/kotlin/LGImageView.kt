package dev.topping.kotlin

expect open class LGImageView : LGView
{
   companion object {
        fun create(lc: LuaContext, luaId: String): LGImageView
   }
   fun setImage(stream: LuaStream?)
   fun setImageRef(ref: LuaRef?)
}
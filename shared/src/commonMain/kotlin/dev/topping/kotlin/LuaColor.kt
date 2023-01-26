package dev.topping.kotlin

expect open class LuaColor
{
   companion object {
        val BLACK: Int
        val BLUE: Int
        val CYAN: Int
        val DKGRAY: Int
        val GRAY: Int
        val GREEN: Int
        val LTGRAY: Int
        val MAGENTA: Int
        val RED: Int
        val TRANSPARENT: Int
        val WHITE: Int
        val YELLOW: Int
        fun fromString(colorStr: String): LuaColor?
        fun createFromARGB(alpha: Int, red: Int, green: Int, blue: Int): LuaColor?
        fun createFromRGB(red: Int, green: Int, blue: Int): LuaColor?
   }
   fun getColorValue(): Int?
}
package dev.topping.kotlin

expect class LuaBundle
{
    fun getString(key: String): String?
    fun getString(key: String, def: String) : String?
    fun putString(key: String, value: String)
    fun getByte(key: String): Byte
    fun getByte(key: String, def: Byte): Byte
    fun putByte(key: String, value: Byte)
    fun getInt(key: String): Int
    fun getInt(key: String, def: Int): Int
    fun putInt(key: String, value: Int)
    fun getLong(key: String): Long
    fun getLong(key: String, def: Long): Long
    fun putLong(key: String, value: Long)
    fun getFloat(key: String): Float
    fun getFloat(key: String, def: Float): Float
    fun putFloat(key: String, value: Float)
    fun getDouble(key: String): Double
    fun getDouble(key: String, def: Double): Double
    fun putDouble(key: String, value: Double)
}
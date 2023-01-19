package dev.topping.kotlin

actual class LuaBundle : KTInterface {
    var luaBundle: dev.topping.android.LuaBundle? = null

    actual fun getString(key: String): String? {
        return luaBundle?.getString(key)
    }

    actual fun getString(key: String, def: String): String? {
        return luaBundle?.getString(key, def)
    }

    actual fun putString(key: String, value: String) {
        luaBundle?.putString(key, value)
    }

    actual fun getByte(key: String): Byte {
        return luaBundle?.getByte(key) ?: 0
    }

    actual fun getByte(key: String, def: Byte): Byte {
        return luaBundle?.getByte(key, def) ?: 0
    }

    actual fun putByte(key: String, value: Byte) {
        luaBundle?.putByte(key, value)
    }

    actual fun getChar(key: String): Byte {
        return (luaBundle?.getChar(key) ?: 0) as Byte
    }

    actual fun getChar(key: String, def: Byte): Byte {
        return (luaBundle?.getChar(key, def.toInt().toChar()) ?: 0) as Byte
    }

    actual fun putChar(key: String, value: Byte) {
        luaBundle?.putChar(key, value.toInt().toChar())
    }

    actual fun getShort(key: String): Short {
        return luaBundle?.getShort(key) ?: 0
    }

    actual fun getShort(key: String, def: Short): Short {
        return luaBundle?.getShort(key, def) ?: 0
    }

    actual fun putShort(key: String, value: Short) {
        luaBundle?.putShort(key, value)
    }

    actual fun getInt(key: String): Int {
        return luaBundle?.getInt(key) ?: 0
    }

    actual fun getInt(key: String, def: Int): Int {
        return luaBundle?.getInt(key, def) ?: 0
    }

    actual fun putInt(key: String, value: Int) {
        luaBundle?.putInt(key, value)
    }

    actual fun getLong(key: String): Long {
        return luaBundle?.getLong(key) ?: 0
    }

    actual fun getLong(key: String, def: Long): Long {
        return luaBundle?.getLong(key, def) ?: 0
    }

    actual fun putLong(key: String, value: Long) {
        luaBundle?.putLong(key, value)
    }

    actual fun getFloat(key: String): Float {
        return luaBundle?.getFloat(key) ?: 0F
    }

    actual fun getFloat(key: String, def: Float): Float {
        return luaBundle?.getFloat(key, def) ?: 0F
    }

    actual fun putFloat(key: String, value: Float) {
        luaBundle?.putFloat(key, value)
    }

    actual fun getDouble(key: String): Double {
        return luaBundle?.getDouble(key) ?: 0.0
    }

    actual fun getDouble(key: String, def: Double): Double {
        return luaBundle?.getDouble(key, def) ?: 0.0
    }

    actual fun putDouble(key: String, value: Double) {
        luaBundle?.putDouble(key, value)
    }

    override fun GetNativeObject(): Any?
    {
        return luaBundle
    }

    override fun SetNativeObject(par :Any?)
    {
        luaBundle = par as dev.topping.android.LuaBundle?
    }
}
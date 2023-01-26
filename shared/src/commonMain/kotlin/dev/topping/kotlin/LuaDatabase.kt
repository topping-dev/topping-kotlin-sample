package dev.topping.kotlin

expect open class LuaDatabase
{
   companion object {
        fun create(context: LuaContext): LuaDatabase
   }
   fun checkAndCreateDatabase()
   fun open(): LuaObjectStore?
   fun query(conn: LuaObjectStore?, str: String): LuaObjectStore?
   fun insert(conn: LuaObjectStore?, str: String): LuaObjectStore?
   fun finalize(stmt: LuaObjectStore?)
   fun close(conn: LuaObjectStore?)
   fun getInt(stmt: LuaObjectStore?, column: Int): Int?
   fun getFloat(stmt: LuaObjectStore?, column: Int): Float?
   fun getString(stmt: LuaObjectStore?, column: Int): String?
   fun getDouble(stmt: LuaObjectStore?, column: Int): Double?
   fun getLong(stmt: LuaObjectStore?, column: Int): Long?
}
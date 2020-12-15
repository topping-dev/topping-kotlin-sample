package dev.topping.kotlin

expect open class LuaDatabase
{
   companion object {
        fun Create(context: LuaContext?): LuaDatabase?
   }
   fun CheckAndCreateDatabase()
   fun Open(): LuaObjectStore?
   fun Query(conn: LuaObjectStore?, str: String?): LuaObjectStore?
   fun Insert(conn: LuaObjectStore?, str: String?): LuaObjectStore?
   fun Finalize(stmt: LuaObjectStore?)
   fun Close(conn: LuaObjectStore?)
   fun GetInt(stmt: LuaObjectStore?, column: Int?): Int?
   fun GetFloat(stmt: LuaObjectStore?, column: Int?): Float?
   fun GetString(stmt: LuaObjectStore?, column: Int?): String?
   fun GetDouble(stmt: LuaObjectStore?, column: Int?): Double?
   fun GetLong(stmt: LuaObjectStore?, column: Int?): Long?
}
package dev.topping.kotlin

actual open class LuaDatabase : KTInterface
{
   var luaDatabase: dev.topping.android.LuaDatabase? = null
   actual companion object {
        actual fun Create(context: LuaContext?): LuaDatabase?
        {
            val pobj = LuaDatabase()
            val pres = dev.topping.android.LuaDatabase.Create(context?.luaContext)
            pobj.SetNativeObject(pres as dev.topping.android.LuaDatabase)
            return pobj
        }
   }
   actual fun CheckAndCreateDatabase()
   {
       luaDatabase?.CheckAndCreateDatabase()
   }
   actual fun Open(): LuaObjectStore?
   {
       val pobj = LuaObjectStore()
       val obj = luaDatabase?.Open()
       pobj.SetNativeObject(obj)
       return pobj
   }
   actual fun Query(conn: LuaObjectStore?, str: String?): LuaObjectStore?
   {
       val pobj = LuaObjectStore()
       val obj = luaDatabase?.Query(conn?.luaObjectStore, str)
       pobj.SetNativeObject(obj)
       return pobj
   }
   actual fun Insert(conn: LuaObjectStore?, str: String?): LuaObjectStore?
   {
       val pobj = LuaObjectStore()
       val obj = luaDatabase?.Insert(conn?.luaObjectStore, str)
       pobj.SetNativeObject(obj)
       return pobj
   }
   actual fun Finalize(stmt: LuaObjectStore?)
   {
       luaDatabase?.Finalize(stmt?.luaObjectStore)
   }
   actual fun Close(conn: LuaObjectStore?)
   {
       luaDatabase?.Close(conn?.luaObjectStore)
   }
   actual fun GetInt(stmt: LuaObjectStore?, column: Int?): Int?
   {
       return luaDatabase?.GetInt(stmt?.luaObjectStore, column)
   }
   actual fun GetFloat(stmt: LuaObjectStore?, column: Int?): Float?
   {
       return luaDatabase?.GetFloat(stmt?.luaObjectStore, column)
   }
   actual fun GetString(stmt: LuaObjectStore?, column: Int?): String?
   {
       return luaDatabase?.GetString(stmt?.luaObjectStore, column)
   }
   actual fun GetDouble(stmt: LuaObjectStore?, column: Int?): Double?
   {
       return luaDatabase?.GetDouble(stmt?.luaObjectStore, column)
   }
   actual fun GetLong(stmt: LuaObjectStore?, column: Int?): Long?
   {
       return luaDatabase?.GetLong(stmt?.luaObjectStore, column)
   }
    open override fun GetNativeObject(): Any?
   {
       return luaDatabase
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaDatabase = par as dev.topping.android.LuaDatabase?
   }
}
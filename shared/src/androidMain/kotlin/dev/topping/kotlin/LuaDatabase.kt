package dev.topping.kotlin

actual open class LuaDatabase : KTInterface
{
   var luaDatabase: dev.topping.android.LuaDatabase? = null
   actual companion object {
        actual fun create(context: LuaContext): LuaDatabase {
            val pobj = LuaDatabase()
            val pres = dev.topping.android.LuaDatabase.create(context.luaContext)
            pobj.SetNativeObject(pres as dev.topping.android.LuaDatabase)
            return pobj
        }
   }
   actual fun checkAndCreateDatabase()
   {
       luaDatabase?.checkAndCreateDatabase()
   }
   actual fun open(): LuaObjectStore?
   {
       val pobj = LuaObjectStore()
       val obj = luaDatabase?.open()
       pobj.SetNativeObject(obj)
       return pobj
   }
   actual fun query(conn: LuaObjectStore?, str: String): LuaObjectStore?
   {
       val pobj = LuaObjectStore()
       val obj = luaDatabase?.query(conn?.luaObjectStore, str)
       pobj.SetNativeObject(obj)
       return pobj
   }
   actual fun insert(conn: LuaObjectStore?, str: String): LuaObjectStore?
   {
       val pobj = LuaObjectStore()
       val obj = luaDatabase?.insert(conn?.luaObjectStore, str)
       pobj.SetNativeObject(obj)
       return pobj
   }
   actual fun finalize(stmt: LuaObjectStore?)
   {
       luaDatabase?.finalize(stmt?.luaObjectStore)
   }
   actual fun close(conn: LuaObjectStore?)
   {
       luaDatabase?.close(conn?.luaObjectStore)
   }
   actual fun getInt(stmt: LuaObjectStore?, column: Int): Int?
   {
       return luaDatabase?.getInt(stmt?.luaObjectStore, column)
   }
   actual fun getFloat(stmt: LuaObjectStore?, column: Int): Float?
   {
       return luaDatabase?.getFloat(stmt?.luaObjectStore, column)
   }
   actual fun getString(stmt: LuaObjectStore?, column: Int): String?
   {
       return luaDatabase?.getString(stmt?.luaObjectStore, column)
   }
   actual fun getDouble(stmt: LuaObjectStore?, column: Int): Double?
   {
       return luaDatabase?.getDouble(stmt?.luaObjectStore, column)
   }
   actual fun getLong(stmt: LuaObjectStore?, column: Int): Long?
   {
       return luaDatabase?.getLong(stmt?.luaObjectStore, column)
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
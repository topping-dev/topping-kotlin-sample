package dev.topping.kotlin

expect open class LuaNavigationUI
{
   companion object {
      fun navigateUp(navController: LuaNavController, configuration: LuaAppBarConfiguration)
      fun navigateUp(navController: LuaNavController, openableLayout: LGView)
      fun setupActionBarWithNavController(form: LuaForm, navController: LuaNavController)
      fun setupActionBarWithNavController(form: LuaForm, navController: LuaNavController, openableLayout: LGView)
      fun setupActionBarWithNavController(form: LuaForm, navController: LuaNavController, configuration: LuaAppBarConfiguration)
      fun setupWithNavController(toolbar: LGToolbar, navController: LuaNavController)
      fun setupWithNavController(toolbar: LGToolbar, navController: LuaNavController, openableLayout: LGView)
      fun setupWithNavController(toolbar: LGToolbar, navController: LuaNavController, configuration: LuaAppBarConfiguration)
   }
}
package dev.topping.kotlin

import androidx.appcompat.widget.Toolbar
import androidx.customview.widget.Openable
import androidx.navigation.ui.NavigationUI

actual open class LuaNavigationUI : KTInterface
{
   var luaNavigationUI: NavigationUI? = null

    actual companion object {
        actual fun navigateUp(navController: LuaNavController, configuration: LuaAppBarConfiguration) {
            NavigationUI.navigateUp(navController.luaNavController?.navController!!, configuration.luaAppBarConfiguration?.appBarConfiguration!!)
        }
        actual fun navigateUp(navController: LuaNavController, openableLayout: LGView) {
            NavigationUI.navigateUp(navController.luaNavController?.navController!!, openableLayout.lgView?.view as Openable?)
        }
        actual fun setupActionBarWithNavController(form: LuaForm, navController: LuaNavController) {
            NavigationUI.setupActionBarWithNavController(form.luaForm!!, navController.luaNavController?.navController!!)
        }
        actual fun setupActionBarWithNavController(form: LuaForm, navController: LuaNavController, openableLayout: LGView) {
            NavigationUI.setupActionBarWithNavController(form.luaForm!!, navController.luaNavController?.navController!!, openableLayout.lgView?.view as Openable?)
        }
        actual fun setupActionBarWithNavController(form: LuaForm, navController: LuaNavController, configuration: LuaAppBarConfiguration) {
            NavigationUI.setupActionBarWithNavController(form.luaForm!!, navController.luaNavController?.navController!!, configuration.luaAppBarConfiguration?.appBarConfiguration!!)
        }
        actual fun setupWithNavController(toolbar: LGToolbar, navController: LuaNavController) {
            NavigationUI.setupWithNavController(toolbar.lgToolbar?.view as Toolbar, navController.luaNavController?.navController!!)
        }
        actual fun setupWithNavController(toolbar: LGToolbar, navController: LuaNavController, openableLayout: LGView) {
            NavigationUI.setupWithNavController(toolbar.lgToolbar?.view as Toolbar, navController.luaNavController?.navController!!, openableLayout.lgView?.view as Openable?)
        }
        actual fun setupWithNavController(toolbar: LGToolbar, navController: LuaNavController, configuration: LuaAppBarConfiguration) {
            NavigationUI.setupWithNavController(toolbar.lgToolbar?.view as Toolbar, navController.luaNavController?.navController!!, configuration.luaAppBarConfiguration?.appBarConfiguration!!)
        }
    }

    open override fun GetNativeObject(): Any?
    {
        return luaNavigationUI
    }
    open override fun SetNativeObject(par :Any?)
    {
        luaNavigationUI = par as NavigationUI?
    }
}
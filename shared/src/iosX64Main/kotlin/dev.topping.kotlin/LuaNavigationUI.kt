package dev.topping.kotlin

import cocoapods.Topping.NavigationUI

actual open class LuaNavigationUI : KTInterface
{
   var luaNavigationUI: NavigationUI? = null

    actual companion object {
        actual fun navigateUp(navController: LuaNavController, configuration: LuaAppBarConfiguration) {
            NavigationUI.navigateUpWithNavController((KTWrap.UnWrap(navController) as cocoapods.Topping.LuaNavController), (KTWrap.UnWrap(configuration) as cocoapods.Topping.LuaAppBarConfiguration))
        }
        actual fun navigateUp(navController: LuaNavController, openableLayout: LGView) {
            NavigationUI.navigateUpWithNavController((KTWrap.UnWrap(navController) as cocoapods.Topping.LuaNavController), KTWrap.UnWrap(openableLayout) as cocoapods.Topping.LGView)
        }
        actual fun setupActionBarWithNavController(form: LuaForm, navController: LuaNavController) {
            NavigationUI.setupActionBarWithNavControllerWithForm(KTWrap.UnWrap(form) as cocoapods.Topping.LuaForm, (KTWrap.UnWrap(navController) as cocoapods.Topping.LuaNavController))
        }
        actual fun setupActionBarWithNavController(form: LuaForm, navController: LuaNavController, openableLayout: LGView) {
            NavigationUI.setupActionBarWithNavControllerWithForm(KTWrap.UnWrap(form) as cocoapods.Topping.LuaForm, (KTWrap.UnWrap(navController) as cocoapods.Topping.LuaNavController), KTWrap.UnWrap(openableLayout) as cocoapods.Topping.LGView)
        }
        actual fun setupActionBarWithNavController(form: LuaForm, navController: LuaNavController, configuration: LuaAppBarConfiguration) {
            NavigationUI.setupActionBarWithNavControllerWithForm(KTWrap.UnWrap(form) as cocoapods.Topping.LuaForm, (KTWrap.UnWrap(navController) as cocoapods.Topping.LuaNavController), (KTWrap.UnWrap(configuration) as cocoapods.Topping.LuaAppBarConfiguration))
        }
        actual fun setupWithNavController(toolbar: LGToolbar, navController: LuaNavController) {
            NavigationUI.setupWithNavControllerWithToolbar(KTWrap.UnWrap(toolbar) as cocoapods.Topping.LGToolbar, (KTWrap.UnWrap(navController) as cocoapods.Topping.LuaNavController))
        }
        actual fun setupWithNavController(toolbar: LGToolbar, navController: LuaNavController, openableLayout: LGView) {
            NavigationUI.setupWithNavControllerWithToolbar(KTWrap.UnWrap(toolbar) as cocoapods.Topping.LGToolbar, (KTWrap.UnWrap(navController) as cocoapods.Topping.LuaNavController), KTWrap.UnWrap(openableLayout) as cocoapods.Topping.LGView)
        }
        actual fun setupWithNavController(toolbar: LGToolbar, navController: LuaNavController, configuration: LuaAppBarConfiguration) {
            NavigationUI.setupWithNavControllerWithToolbar(KTWrap.UnWrap(toolbar) as cocoapods.Topping.LGToolbar, (KTWrap.UnWrap(navController) as cocoapods.Topping.LuaNavController), (KTWrap.UnWrap(configuration) as cocoapods.Topping.LuaAppBarConfiguration))
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
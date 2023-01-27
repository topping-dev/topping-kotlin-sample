package dev.topping.kotlinsample

import dev.topping.kotlin.*

class MainForm(form: Any) : ILuaForm(form) {

    override fun onCreate() {
        val navController = getForm().getFragmentManager()?.findFragmentById(LR.id.nav_host_fragment)
            ?.getNavController()
        val toolbar:LGToolbar? = getForm().getViewById(LR.id.ToolbarTest)
        LuaNavigationUI.setupWithNavController(toolbar!!, navController!!)
    }

    override fun onResume() {
    }

    override fun onPause() {
    }

    override fun onDestroy() {
    }
}
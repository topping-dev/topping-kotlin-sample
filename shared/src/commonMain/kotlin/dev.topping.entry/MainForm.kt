package dev.topping.entry

import dev.topping.kotlin.*
import dev.topping.kotlinsample.Form

class MainForm(form: Any) : ILuaForm(form) {
    lateinit var binding: MainBinding

    override fun onCreate() {
        binding = MainBinding.inflate(LuaViewInflator.Create(getForm().GetContext()!!))
        getForm().SetView(binding.getRoot())
    }

    override fun onResume() {
    }

    override fun onPause() {
    }

    override fun onDestroy() {
    }
}
package dev.topping.kotlinsample

import dev.topping.kotlin.*

class MainForm(form: Any) : ILuaForm(form) {
    lateinit var binding: MainBinding

    override fun onCreate() {
        binding = MainBinding.inflate(LuaViewInflator.create(getForm().getContext()!!))
        getForm().setView(binding.getRoot())
    }

    override fun onResume() {
    }

    override fun onPause() {
    }

    override fun onDestroy() {
    }
}
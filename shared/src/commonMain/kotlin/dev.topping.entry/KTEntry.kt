package dev.topping.entry

import dev.topping.kotlin.LuaForm
import org.sombrenuit.dk.luaandroidkotlin.shared.scripts.Form
import org.sombrenuit.dk.luaandroidkotlin.shared.scripts.TestBed

class KTEntry {
    companion object {
        fun Init() {
            LuaForm.RegisterFormEvent(
                "ListViewTest",
                LuaForm.FORM_EVENT_CREATE,
                TestBed::ListViewTest_Constructor
            )
            LuaForm.RegisterFormEvent(
                "formTestLL",
                LuaForm.FORM_EVENT_CREATE,
                Form::FormTestLL_Constructor
            )
        }
    }
}
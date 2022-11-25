package dev.topping.entry

import dev.topping.kotlin.LuaForm
import dev.topping.kotlin.LuaFragment
import dev.topping.kotlinsample.Form
import dev.topping.kotlinsample.TestBed

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
            LuaForm.RegisterFormEvent(
                "Main",
                LuaForm.FORM_EVENT_CREATE,
                Form::Main_Constructor
            )
            LuaFragment.RegisterFragmentEvent("menuFragment", LuaFragment.FRAGMENT_EVENT_CREATE_VIEW, Form::MenuFragment_Create_View)
            LuaFragment.RegisterFragmentEvent("receiveFragment", LuaFragment.FRAGMENT_EVENT_CREATE_VIEW, Form::ReceiveFragment_Create_View)
            LuaFragment.RegisterFragmentEvent(
                "formTestLL",
                LuaFragment.FRAGMENT_EVENT_CREATE,
                Form::FormTestLL_Constructor
            )
        }
    }
}
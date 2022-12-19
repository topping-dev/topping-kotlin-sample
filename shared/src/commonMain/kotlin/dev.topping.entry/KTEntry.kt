package dev.topping.entry

import dev.topping.kotlin.LR
import dev.topping.kotlin.LuaForm
import dev.topping.kotlin.LuaFragment
import dev.topping.kotlinsample.Form
import dev.topping.kotlinsample.TestBed

class KTEntry {
    companion object {
        fun Init() {
            LuaForm.RegisterFormEvent(
                LR.id.ListViewTest,
                LuaForm.FORM_EVENT_CREATE,
                TestBed::ListViewTest_Constructor
            )
            LuaForm.RegisterFormEvent(
                LR.id.formTestLL,
                LuaForm.FORM_EVENT_CREATE,
                Form::FormTestLL_Constructor
            )
            LuaForm.RegisterFormEvent(
                LR.id.Main,
                LuaForm.FORM_EVENT_CREATE,
                Form::Main_Constructor
            )
            LuaFragment.RegisterFragmentEvent(LR.id.menuFragment, LuaFragment.FRAGMENT_EVENT_CREATE_VIEW, Form::MenuFragment_Create_View)
            LuaFragment.RegisterFragmentEvent(LR.id.receiveFragment, LuaFragment.FRAGMENT_EVENT_CREATE_VIEW, Form::ReceiveFragment_Create_View)
            LuaFragment.RegisterFragmentEvent(
                LR.id.formTestLL,
                LuaFragment.FRAGMENT_EVENT_CREATE,
                Form::FormTestLL_Constructor
            )
        }
    }
}
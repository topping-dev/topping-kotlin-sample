package dev.topping.entry

import dev.topping.kotlin.LR
import dev.topping.kotlin.LuaEvent
import dev.topping.kotlin.LuaForm
import dev.topping.kotlin.LuaFragment
import dev.topping.kotlinsample.Form
import dev.topping.kotlinsample.TestBed

class KTEntry {
    companion object {
        fun Init() {
            LuaEvent.RegisterUIEvent(
                LR.id.ListViewTest,
                LuaEvent.UI_EVENT_VIEW_CREATE,
                TestBed::ListViewTest_Constructor
            )
            LuaEvent.RegisterUIEvent(
                LR.id.formTestLL,
                LuaEvent.UI_EVENT_VIEW_CREATE,
                Form::FormTestLL_Constructor
            )
            LuaEvent.RegisterUIEvent(
                LR.id.Main,
                LuaEvent.UI_EVENT_CREATE,
                Form::Main_Constructor
            )
            LuaEvent.RegisterUIEvent(LR.id.menuFragment, LuaEvent.UI_EVENT_FRAGMENT_CREATE_VIEW, Form::MenuFragment_Create_View)
            LuaEvent.RegisterUIEvent(LR.id.receiveFragment, LuaEvent.UI_EVENT_FRAGMENT_CREATE_VIEW, Form::ReceiveFragment_Create_View)
        }
    }
}
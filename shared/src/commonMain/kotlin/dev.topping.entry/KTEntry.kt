package dev.topping.entry

import dev.topping.kotlin.*
import dev.topping.kotlinsample.Form
import dev.topping.kotlinsample.MainForm
import dev.topping.kotlinsample.MenuFragment

class KTEntry {
    companion object {
        fun Init() {
            LuaEvent.registerFragment("menuFragment", ::MenuFragment)
            LuaEvent.registerForm("Main", ::MainForm)
            /*LuaEvent.registerUIEvent(
                LR.id.ListViewTest,
                LuaEvent.UI_EVENT_VIEW_CREATE,
                TestBed::ListViewTest_Constructor
            )
            LuaEvent.registerUIEvent(
                LR.id.formTestLL,
                LuaEvent.UI_EVENT_VIEW_CREATE,
                Form::FormTestLL_Constructor
            )
            LuaEvent.registerUIEvent(
                LR.id.Main,
                LuaEvent.UI_EVENT_CREATE,
                Form::Main_Constructor
            )*/
            //LuaEvent.registerUIEvent(LR.id.menuFragment, LuaEvent.UI_EVENT_FRAGMENT_CREATE_VIEW, Form::MenuFragment_Create_View)
            LuaEvent.registerUIEvent(LR.id.receiveFragment, LuaEvent.UI_EVENT_FRAGMENT_CREATE_VIEW, Form::ReceiveFragment_Create_View)
        }
    }
}
package org.sombrenuit.dk.luaandroidkotlin.shared.scripts

import dev.topping.kotlin.*

class Form {
    companion object {
        fun TestCheckBox_CheckedChanged(pGUI: LGView, context: LuaContext, isChecked: Boolean) {
            LuaToast.Show(context, "CheckBox value is $isChecked", 1000)
        }

        fun TestButton_Click(pGUI: LGView, context: LuaContext) {
            LuaToast.Show(context, "Test button clicked", 1000)
        }

        fun TestComboBox_Changed(pGUI: LGView, context: LuaContext, name: String, value: Any) {
            LuaToast.Show(context, "Combobox id $name", 1000)
        }

        fun FormTestLL_Constructor(pGUI: LGView, luacontext: LuaContext) {
            val button = pGUI.GetViewById("formTestButton") as LGButton
            button.SetOnClickListener(::TestButton_Click)
            val checkbox = pGUI.GetViewById ("formTestCheckBox") as LGCheckBox
            checkbox.SetOnCheckedChangedListener(::TestCheckBox_CheckedChanged)
            val combobox = pGUI.GetViewById ("formTestComboBox") as LGComboBox
            combobox.AddComboItem("Item 1", 1)
            combobox.AddComboItem("Item 2", 2)
            combobox.AddComboItem("Item 3", 3)
            combobox.AddComboItem("Item 4", 4)
            combobox.SetOnComboChangedListener(::TestComboBox_Changed)
            val edittext = pGUI.GetViewById ("formTestEt") as LGEditText
            val pb = pGUI.GetViewById ("formTestProgressBar") as LGProgressBar
            pb.SetMax(100)
            pb.SetProgress(15)
        }
    }
}
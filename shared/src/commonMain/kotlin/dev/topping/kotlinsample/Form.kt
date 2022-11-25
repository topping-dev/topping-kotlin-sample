package dev.topping.kotlinsample

import dev.topping.kotlin.*

class Form {
    companion object {
        fun TestCheckBox_CheckedChanged(pGUI: LGView, context: LuaContext, isChecked: Boolean) {
            LuaToast.Show(context, "CheckBox value is $isChecked", 1000)
        }

        fun TestButton_Click(pGUI: LGView, context: LuaContext) {
            LuaToast.Show(context, "Test button clicked", 1000)
            pGUI.findNavController().navigate(LR.id.action_menuFragment_to_receiveFragment)
        }

        fun TestComboBox_Changed(pGUI: LGView, context: LuaContext, name: String, value: Any) {
            LuaToast.Show(context, "Combobox id $name", 1000)
        }

        fun FormTestLL_Constructor(pGUI: LGView, luacontext: LuaContext) {
            val button = pGUI.GetViewById("formTestButton") as LGButton
            button.SetOnClickListener(Companion::TestButton_Click)
            val checkbox = pGUI.GetViewById("formTestCheckBox") as LGCheckBox
            checkbox.SetOnCheckedChangedListener(Companion::TestCheckBox_CheckedChanged)
            val combobox = pGUI.GetViewById("formTestComboBox") as LGComboBox
            combobox.AddItem("Item 1", 1)
            combobox.AddItem("Item 2", 2)
            combobox.AddItem("Item 3", 3)
            combobox.AddItem("Item 4", 4)
            combobox.SetOnComboChangedListener(Companion::TestComboBox_Changed)
            val edittext = pGUI.GetViewById("formTestEt") as LGEditText
            val pb = pGUI.GetViewById("formTestProgressBar") as LGProgressBar
            pb.SetMax(100)
            pb.SetProgress(15)
        }

        fun Main_Constructor(pGUI: LuaForm, luacontext: LuaContext) {
            val navController = pGUI.getFragmentManager()?.findFragmentById(LR.id.nav_host_fragment)
                ?.getNavController()
            val toolbar = pGUI.GetViewById("ToolbarTest") as LGToolbar?
            LuaNavigationUI.setupWithNavController(toolbar!!, navController!!)
        }

        fun MenuFragment_Create_View(
            pFragment: LuaFragment,
            luacontext: LuaContext,
            inflater: LuaViewInflator,
            container: LGView,
            savedInstanceState: Any
        ): LGView? {
            return inflater.Inflate(LR.layout.form, container)
        }

        fun ReceiveFragment_Create_View(
            pFragment: LuaFragment,
            luacontext: LuaContext,
            inflater: LuaViewInflator,
            container: LGView,
            savedInstanceState: Any
        ): LGView? {
            return inflater.Inflate(LR.layout.frame, container)
        }
    }
}
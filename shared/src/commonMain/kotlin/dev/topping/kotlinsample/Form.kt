package dev.topping.kotlinsample

import dev.topping.kotlin.*

class Form {
    companion object {
        fun TestCheckBox_CheckedChanged(pGUI: LGView, context: LuaContext, isChecked: Boolean) {
            LuaToast.show(context, "CheckBox value is $isChecked", 1000)
        }

        fun TestButton_Click(pGUI: LGView, context: LuaContext) {
            LuaToast.show(context, "Test button clicked", 1000)
            pGUI.findNavController().navigate(LR.id.action_menuFragment_to_receiveFragment)
        }

        fun TestComboBox_Changed(pGUI: LGView, context: LuaContext, name: String, value: Any) {
            LuaToast.show(context, "Combobox id $name", 1000)
        }

        fun FormTestLL_Constructor(pGUI: LGView, luacontext: LuaContext) {
            val button = pGUI.getViewById(LR.id.formTestButton) as LGButton
            button.setOnClickListener(Companion::TestButton_Click)
            val checkbox = pGUI.getViewById(LR.id.formTestCheckBox) as LGCheckBox
            checkbox.setOnCheckedChangedListener(Companion::TestCheckBox_CheckedChanged)
            /*val combobox = pGUI.getViewById(LR.id.formTestComboBox) as LGComboBox
            combobox.addItem("Item 1", 1)
            combobox.addItem("Item 2", 2)
            combobox.addItem("Item 3", 3)
            combobox.addItem("Item 4", 4)
            combobox.setOnComboChangedListener(Companion::TestComboBox_Changed)*/
            val edittext = pGUI.getViewById(LR.id.formTestEt) as LGEditText
            val pb = pGUI.getViewById(LR.id.formTestProgressBar) as LGProgressBar
            pb.setMax(100)
            pb.setProgress(15)
        }

        fun Main_Constructor(pGUI: LuaForm, luacontext: LuaContext) {
            val navController = pGUI.getFragmentManager()?.findFragmentById(LR.id.nav_host_fragment)
                ?.getNavController()
            val toolbar = pGUI.getViewById(LR.id.ToolbarTest) as LGToolbar?
            LuaNavigationUI.setupWithNavController(toolbar!!, navController!!)
        }

        fun MenuFragment_Create_View(
            pFragment: LuaFragment,
            luacontext: LuaContext,
            inflater: LuaViewInflator,
            container: LGView?,
            savedInstanceState: Any?
        ): LGView? {
            return inflater.inflate(LR.layout.form, container)
        }

        fun ReceiveFragment_Create_View(
            pFragment: LuaFragment,
            luacontext: LuaContext,
            inflater: LuaViewInflator,
            container: LGView?,
            savedInstanceState: Any?
        ): LGView? {
            return inflater.inflate(LR.layout.frame, container)
        }
    }
}
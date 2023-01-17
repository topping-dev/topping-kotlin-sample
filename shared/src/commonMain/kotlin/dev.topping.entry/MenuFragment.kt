package dev.topping.entry

import dev.topping.kotlin.*
import dev.topping.kotlinsample.Form

class MenuFragment(fragment: Any) : ILuaFragment(fragment) {
    lateinit var binding: FormBinding
    var viewModel = LuaViewModelProvider.Of(getFragment()).Get("key", MenuViewModel())

    override fun onCreate(savedInstanceState: LuaBundle?) {

    }

    override fun onCreateView(
        luacontext: LuaContext,
        inflater: LuaViewInflator,
        container: LGView?,
        savedInstanceState: LuaBundle?
    ): LGView {
        binding = FormBinding.inflate(inflater)
        binding.formTestButton.SetOnClickListener { lgView, luaContext ->
            LuaToast.Show(luaContext, "Test button clicked", 1000)
            lgView.findNavController().navigate(LR.id.action_menuFragment_to_receiveFragment)
        }
        binding.formTestCheckBox.SetOnCheckedChangedListener { lgCheckBox, luaContext, isChecked ->
            LuaToast.Show(luaContext, "CheckBox value is $isChecked", 1000)
        }
        val combobox = binding.formTestComboBox
        combobox.AddItem("Item 1", 1)
        combobox.AddItem("Item 2", 2)
        combobox.AddItem("Item 3", 3)
        combobox.AddItem("Item 4", 4)
        combobox.SetOnComboChangedListener(Form.Companion::TestComboBox_Changed)
        binding.formTestProgressBar.SetMax(100)
        binding.formTestProgressBar.SetProgress(15)
        return binding.getRoot()
    }

    override fun onViewCreated(view: LGView, savedInstanceState: LuaBundle?) {
    }

    override fun onResume() {
    }

    override fun onPause() {
    }

    override fun onDestroy() {
    }
}
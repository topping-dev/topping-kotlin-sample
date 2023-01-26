package dev.topping.kotlinsample

import dev.topping.kotlin.*

class MenuFragment(fragment: Any) : ILuaFragment(fragment) {
    lateinit var binding: FormBinding
    var viewModel = LuaViewModelProvider.of(getFragment()).get("key", MenuViewModel())

    override fun onCreate(savedInstanceState: LuaBundle?) {
    }

    override fun onCreateView(
        luacontext: LuaContext,
        inflater: LuaViewInflator,
        container: LGView?,
        savedInstanceState: LuaBundle?
    ): LGView {
        binding = FormBinding.inflate(inflater)
        binding.formTestButton.setOnClickListener { lgView, luaContext ->
            LuaToast.show(luaContext, "Test button clicked", 1000)
            lgView.findNavController().navigate(LR.id.action_menuFragment_to_receiveFragment)
        }
        binding.formTestCheckBox.setOnCheckedChangedListener { lgCheckBox, luaContext, isChecked ->
            LuaToast.show(luaContext, "CheckBox value is $isChecked", 1000)
        }
        val combobox = binding.formTestComboBox
        combobox.addItem("Item 1", 1)
        combobox.addItem("Item 2", 2)
        combobox.addItem("Item 3", 3)
        combobox.addItem("Item 4", 4)
        combobox.setOnComboChangedListener(Form.Companion::TestComboBox_Changed)
        binding.formTestProgressBar.setMax(100)
        binding.formTestProgressBar.setProgress(15)
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
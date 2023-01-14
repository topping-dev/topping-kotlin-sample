package dev.topping.entry

import dev.topping.kotlin.*
import dev.topping.kotlinsample.Form
import dev.topping.kotlinsample.TestBed

class XViewModel : LuaViewModel() {

}

class MenuFragment(fragment: Any) : LuaFragmentInterface(fragment) {
    lateinit var binding: FormBinding
    var viewModel = LuaViewModelProvider.Of(getFragment()).Get("key", XViewModel())

    override fun onCreate(savedInstanceState: Map<String, Any>) {

    }

    override fun onCreateView(
        luacontext: LuaContext,
        inflater: LuaViewInflator,
        container: LGView?,
        savedInstanceState: Map<String, Any>?
    ): LGView {
        binding = FormBinding.inflate(inflater)
        return binding.getRoot()
    }

    override fun onViewCreated(view: LGView, savedInstanceState: Map<String, Any>) {
    }

    override fun onResume() {
    }

    override fun onPause() {
    }

    override fun onDestroy() {
    }
}

class KTEntry {
    companion object {
        fun Init() {
            LuaEvent.RegisterFragment("menuFragment", ::MenuFragment)
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
            //LuaEvent.RegisterUIEvent(LR.id.menuFragment, LuaEvent.UI_EVENT_FRAGMENT_CREATE_VIEW, Form::MenuFragment_Create_View)
            LuaEvent.RegisterUIEvent(LR.id.receiveFragment, LuaEvent.UI_EVENT_FRAGMENT_CREATE_VIEW, Form::ReceiveFragment_Create_View)
        }
    }
}
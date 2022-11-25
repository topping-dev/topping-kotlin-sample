package dev.topping.kotlin

import kotlin.reflect.KClass

actual class KTClass {
    actual companion object
    {
        actual fun createInstance(cls: KClass<*>): Any?
        {
            //TODO:No createInstance on ios for now
            when(cls.simpleName)
            {
                "LGAbsListView" -> return LGAbsListView()
                "LGAdapterView" -> return LGAdapterView()
                "LGAutoCompleteTextView" -> return LGAutoCompleteTextView()
                "LGButton" -> return LGButton()
                "LGCheckBox" -> return LGCheckBox()
                "LGComboBox" -> return LGComboBox()
                "LGCompoundButton" -> return LGCompoundButton()
                "LGConstraintLayout" -> return LGConstraintLayout()
                "LGDatePicker" -> return LGDatePicker()
                "LGEditText" -> return LGEditText()
                "LGFragmentContainerView" -> return LGFragmentContainerView()
                "LGFrameLayout" -> return LGFrameLayout()
                "LGHorizontalScrollView" -> return LGHorizontalScrollView()
                "LGImageView" -> return LGImageView()
                "LGLinearLayout" -> return LGLinearLayout()
                "LGListView" -> return LGListView()
                "LGProgressBar" -> return LGProgressBar()
                "LGRadioButton" -> return LGRadioButton()
                "LGRecyclerView" -> return LGRecyclerView()
                "LGRecyclerViewAdapter" -> return LGRecyclerViewAdapter()
                "LGRelativeLayout" -> return LGRelativeLayout()
                "LGScrollView" -> return LGScrollView()
                "LGTextView" -> return LGTextView()
                "LGToolbar" -> return LGToolbar()
                "LGView" -> return LGView()
                "LGViewGroup" -> return LGViewGroup()
                "LuaAppBarConfiguration" -> return LuaAppBarConfiguration()
                "LuaBuffer" -> return LuaBuffer()
                "LuaColor" -> return LuaColor()
                "LuaContext" -> return LuaContext()
                "LuaCoroutineScope" -> return LuaCoroutineScope()
                "LuaDatabase" -> return LuaDatabase()
                "LuaDate" -> return LuaDate()
                "LuaDefines" -> return LuaDefines()
                "LuaDialog" -> return LuaDialog()
                "LuaDispatchers" -> return LuaDispatchers()
                "LuaForm" -> return LuaForm()
                "LuaFragment" -> return LuaFragment()
                "LuaFragmentManager" -> return LuaFragmentManager()
                "LuaGraphics" -> return LuaGraphics()
                "LuaHttpClient" -> return LuaHttpClient()
                "LuaJSONArray" -> return LuaJSONArray()
                "LuaJSONObject" -> return LuaJSONObject()
                "LuaLifecycle" -> return LuaLifecycle()
                "LuaLifecycleObserver" -> return LuaLifecycleObserver()
                "LuaLifecycleOwner" -> return LuaLifecycleOwner()
                "LuaLog" -> return LuaLog()
                "LuaMutableLiveData" -> return LuaMutableLiveData()
                "LuaNativeCall" -> return LuaNativeCall()
                "LuaNativeObject" -> return LuaNativeObject()
                "LuaNavController" -> return LuaNavController()
                "LuaNavHostFragment" -> return LuaNavHostFragment()
                "LuaNavOptions" -> return LuaNavOptions()
                "LuaObjectStore" -> return LuaObjectStore()
                "LuaPoint" -> return LuaPoint()
                "LuaRect" -> return LuaRect()
                "LuaResource" -> return LuaResource()
                "LuaStore" -> return LuaStore()
                "LuaStream" -> return LuaStream()
                "LuaTabForm" -> return LuaTabForm()
                "LuaThread" -> return LuaThread()
                "LuaToast" -> return LuaToast()
                "LuaTranslator" -> return LuaTranslator()
                "LuaViewInflator" -> return LuaViewInflator()
                "LuaViewModel" -> return LuaViewModel()
                "LuaViewModelProvider" -> return LuaViewModelProvider()
            }
            return null
        }
    }
}
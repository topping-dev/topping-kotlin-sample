package dev.topping.kotlin

import platform.Foundation.NSLog
import kotlin.reflect.KClass

actual class KTClass {
    actual companion object
    {
        actual fun createInstance(cls: KClass<*>): Any?
        {
            //TODO:No createInstance on ios for now
            when(cls.simpleName)
            {
                "LGAdapterView" -> return LGAdapterView()
                "LGAutoCompleteTextView" -> return LGAutoCompleteTextView()
                "LGButton" -> return LGButton()
                "LGCheckBox" -> return LGCheckBox()
                "LGComboBox" -> return LGComboBox()
                "LGCompoundButton" -> return LGCompoundButton()
                "LGDatePicker" -> return LGDatePicker()
                "LGEditText" -> return LGEditText()
                "LGFrameLayout" -> return LGFrameLayout()
                "LGHorizontalScrollView" -> return LGHorizontalScrollView()
                "LGImageView" -> return LGImageView()
                "LGLinearLayout" -> return LGLinearLayout()
                "LGListView" -> return LGListView()
                "LGMapView" -> return LGMapView()
                "LGProgressBar" -> return LGProgressBar()
                "LGRadioButton" -> return LGRadioButton()
                "LGRecyclerView" -> return LGRecyclerView()
                "LGRecyclerViewAdapter" -> return LGRecyclerViewAdapter()
                "LGRelativeLayout" -> return LGRelativeLayout()
                "LGScrollView" -> return LGScrollView()
                "LGTableLayout" -> return LGTableLayout()
                "LGTableRow" -> return LGTableRow()
                "LGTextView" -> return LGTextView()
                "LGToolbar" -> return LGToolbar()
                "LGView" -> return LGView()
                "LGViewGroup" -> return LGViewGroup()
                "LuaColor" -> return LuaColor()
                "LuaContext" -> return LuaContext()
                "LuaDatabase" -> return LuaDatabase()
                "LuaDate" -> return LuaDate()
                "LuaDefines" -> return LuaDefines()
                "LuaDialog" -> return LuaDialog()
                "LuaForm" -> return LuaForm()
                "LuaFragment" -> return LuaFragment()
                "LuaGraphics" -> return LuaGraphics()
                "LuaHttpClient" -> return LuaHttpClient()
                "LuaJSONArray" -> return LuaJSONArray()
                "LuaJSONObject" -> return LuaJSONObject()
                "LuaLog" -> return LuaLog()
                "LuaMapCircle" -> return LuaMapCircle()
                "LuaMapImage" -> return LuaMapImage()
                "LuaMapMarker" -> return LuaMapMarker()
                "LuaMapPolygon" -> return LuaMapPolygon()
                "LuaMapPolyline" -> return LuaMapPolyline()
                "LuaNativeObject" -> return LuaNativeObject()
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
            }
            return null
        }
    }
}
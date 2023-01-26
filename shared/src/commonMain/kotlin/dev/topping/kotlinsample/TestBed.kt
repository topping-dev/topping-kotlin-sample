package dev.topping.kotlinsample

import dev.topping.kotlin.*

class TestBed {
    companion object {
        private fun onItemSelected(adapter: LGRecyclerViewAdapter?, parent: LGView?, detail: LGView?, index: Int, data: Any?) {
            val form = LuaForm.getActiveForm()
            if(index == 0)
                LuaForm.createWithUI(form?.getContext()!!, LR.id.formTestLL, LR.layout.form)
            else if(index == 1)
                LuaForm.createWithUI(form?.getContext()!!, LR.id.hsvTestLL, LR.layout.hsv)
            else if(index == 2)
                LuaForm.createWithUI(form?.getContext()!!, LR.id.svTestLL, LR.layout.sv)
            else if(index == 3)
                LuaLog.d("asd", "asd")
            else if(index == 4)
                LuaDialog.messageBoxInternal(form?.getContext()!!, "Title", "Message")
            else if(index == 5) {
                val datePicker = LuaDialog.create(form?.getContext()!!, LuaDialog.DIALOG_TYPE_DATEPICKER)
                datePicker.setPositiveButtonInternal("Ok", null)
                datePicker.setNegativeButtonInternal("Cancel", null)
                datePicker.setTitle("Title")
                datePicker.setMessage("Message")
                datePicker.setDateManual(17, 7, 1985)
                datePicker.show()
            }
            else if(index == 6) {
                val timePicker = LuaDialog.create(form?.getContext()!!, LuaDialog.DIALOG_TYPE_TIMEPICKER)
                timePicker.setPositiveButtonInternal("Ok", null)
                timePicker.setNegativeButtonInternal("Cancel", null)
                timePicker.setTitle("Title")
                timePicker.setMessage("Message")
                timePicker.setTimeManual(17, 7)
                timePicker.show()
            }
            else
                LuaToast.show(form?.getContext()!!, "Toast test", 2000)
        }

        private fun onCreateViewHolder(adapter: LGRecyclerViewAdapter?, parent: LGView?, type: Int, context: LuaContext?) : LGView
        {
            val inflator = LuaViewInflator.create(context!!)
            val viewToRet = inflator.inflate(LR.layout.testbedadapter, parent)
            return viewToRet!!
        }

        private fun onBindViewHolder(adapter: LGRecyclerViewAdapter?, view: LGView?, index: Int, obj:Any?)
        {
            val tvTitle:LGTextView? = view?.getViewById(LR.id.testBedTitle) as LGTextView?
            tvTitle?.setTextInternal(obj as String)
        }

        private fun onGetItemViewType(adapter: LGRecyclerViewAdapter?, type: Int) : Int {
            return 1
        }

        fun ListViewTest_Constructor(pGUI: LGView, luacontext : LuaContext)
        {
            val pAdapter = LGRecyclerViewAdapter.create(luacontext, "ListAdapterTest")
            pAdapter.setOnItemSelected(Companion::onItemSelected)
            pAdapter.setOnCreateViewHolder(Companion::onCreateViewHolder)
            pAdapter.setOnBindViewHolder(Companion::onBindViewHolder)
            pAdapter.setGetItemViewType(Companion::onGetItemViewType)
            pAdapter.addValue("Form Ui")
            pAdapter.addValue("Horizontal Scroll View")
            pAdapter.addValue("Vertical Scroll View")
            pAdapter.addValue("Map")
            pAdapter.addValue("Message Box")
            pAdapter.addValue("Date Picker Dialog")
            pAdapter.addValue("Time Picker Dialog")
            pAdapter.addValue("Toast")
            (pGUI as LGRecyclerView).setAdapter(pAdapter)
            pAdapter.notifyData()
        }
    }
}
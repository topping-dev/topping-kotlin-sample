package dev.topping.kotlinsample

import dev.topping.kotlin.*

class TestBed {
    companion object {
        private fun onItemSelected(adapter: LGRecyclerViewAdapter?, parent: LGView?, detail: LGView?, index: Int, data: Any?) {
            val form = LuaForm.GetActiveForm()
            if(index == 0)
                LuaForm.CreateWithUI(form?.GetContext()!!, LR.id.formTestLL, LR.layout.form)
            else if(index == 1)
                LuaForm.CreateWithUI(form?.GetContext()!!, LR.id.hsvTestLL, LR.layout.hsv)
            else if(index == 2)
                LuaForm.CreateWithUI(form?.GetContext()!!, LR.id.svTestLL, LR.layout.sv)
            else if(index == 3)
                LuaLog.D("asd", "asd")
            else if(index == 4)
                LuaDialog.MessageBoxInternal(form?.GetContext()!!, "Title", "Message")
            else if(index == 5) {
                val datePicker = LuaDialog.Create(form?.GetContext()!!, LuaDialog.DIALOG_TYPE_DATEPICKER)
                datePicker.SetPositiveButtonInternal("Ok", null)
                datePicker.SetNegativeButtonInternal("Cancel", null)
                datePicker.SetTitle("Title")
                datePicker.SetMessage("Message")
                datePicker.SetDateManual(17, 7, 1985)
                datePicker.Show()
            }
            else if(index == 6) {
                val timePicker = LuaDialog.Create(form?.GetContext()!!, LuaDialog.DIALOG_TYPE_TIMEPICKER)
                timePicker.SetPositiveButtonInternal("Ok", null)
                timePicker.SetNegativeButtonInternal("Cancel", null)
                timePicker.SetTitle("Title")
                timePicker.SetMessage("Message")
                timePicker.SetTimeManual(17, 7)
                timePicker.Show()
            }
            else
                LuaToast.Show(form?.GetContext()!!, "Toast test", 2000)
        }

        private fun onCreateViewHolder(adapter: LGRecyclerViewAdapter?, parent: LGView?, type: Int, context: LuaContext?) : LGView
        {
            val inflator = LuaViewInflator.Create(context!!)
            val viewToRet = inflator.Inflate(LR.layout.testbedadapter, parent)
            return viewToRet!!
        }

        private fun onBindViewHolder(adapter: LGRecyclerViewAdapter?, view: LGView?, index: Int, obj:Any?)
        {
            val tvTitle:LGTextView? = view?.GetViewById(LR.id.testBedTitle) as LGTextView?
            tvTitle?.SetTextInternal(obj as String)
        }

        private fun onGetItemViewType(adapter: LGRecyclerViewAdapter?, type: Int) : Int {
            return 1
        }

        fun ListViewTest_Constructor(pGUI: LGView, luacontext : LuaContext)
        {
            val pAdapter = LGRecyclerViewAdapter.Create(luacontext, "ListAdapterTest")
            pAdapter.SetOnItemSelected(Companion::onItemSelected)
            pAdapter.SetOnCreateViewHolder(Companion::onCreateViewHolder)
            pAdapter.SetOnBindViewHolder(Companion::onBindViewHolder)
            pAdapter.SetGetItemViewType(Companion::onGetItemViewType)
            pAdapter.AddValue("Form Ui")
            pAdapter.AddValue("Horizontal Scroll View")
            pAdapter.AddValue("Vertical Scroll View")
            pAdapter.AddValue("Map")
            pAdapter.AddValue("Message Box")
            pAdapter.AddValue("Date Picker Dialog")
            pAdapter.AddValue("Time Picker Dialog")
            pAdapter.AddValue("Toast")
            (pGUI as LGRecyclerView).SetAdapter(pAdapter)
            pAdapter.Notify()
        }
    }
}
package dev.topping.kotlinsample

import dev.topping.kotlin.*
import kotlin.reflect.KCallable

class TestBed {
    companion object {
        fun onItemSelected(adapter: LGRecyclerViewAdapter?, parent: LGView?, detail: LGView?, index: Int, data: Any?) {
            val form = LuaForm.GetActiveForm()
            if(index == 0)
                LuaForm.CreateWithUI(form?.GetContext(), "formTest", "form.xml")
            else if(index == 1)
                LuaForm.CreateWithUI(form?.GetContext(), "hsvTest", "hsv.xml")
            else if(index == 2)
                LuaForm.CreateWithUI(form?.GetContext(), "svTest", "sv.xml")
            else if(index == 3)
                LuaLog.D("asd", "asd")
            else if(index == 4)
                LuaDialog.MessageBox(form?.GetContext(), "Title", "Message");
            else if(index == 5) {
                val datePicker = LuaDialog.Create(form?.GetContext(), LuaDialog.DIALOG_TYPE_DATEPICKER);
                datePicker?.SetPositiveButton("Ok", null)
                datePicker?.SetNegativeButton("Cancel", null)
                datePicker?.SetTitle("Title")
                datePicker?.SetMessage("Message")
                datePicker?.SetDateManual(17, 7, 1985)
                datePicker?.Show()
            }
            else if(index == 6) {
                val timePicker = LuaDialog.Create(form?.GetContext(), LuaDialog.DIALOG_TYPE_TIMEPICKER);
                timePicker?.SetPositiveButton("Ok", null)
                timePicker?.SetNegativeButton("Cancel", null)
                timePicker?.SetTitle("Title")
                timePicker?.SetMessage("Message")
                timePicker?.SetTimeManual(17, 7)
                timePicker?.Show()
            }
            else
                LuaToast.Show(form?.GetContext(), "Toast test", 2000);
        }

        fun onCreateViewHolder(adapter: LGRecyclerViewAdapter?, parent: LGView?, type: Int, context: LuaContext?) : Any
        {
            val inflator = LuaViewInflator.Create(context)
            val viewToRet = inflator?.Inflate(LR.layout.testbedadapter, parent)
            return viewToRet!!
        }

        fun onBindViewHolder(adapter: LGRecyclerViewAdapter?, view: LGView?, index: Int, obj:Any?)
        {
            val tvTitle:LGTextView? = view?.GetViewById("testBedTitle") as LGTextView?
            tvTitle?.SetText(obj as String)
        }

        fun onGetItemViewType(adapter: LGRecyclerViewAdapter?, type: Int) : Int {
            return 1
        }

        fun ListViewTest_Constructor(pGUI: LGView, luacontext : LuaContext)
        {
            var pAdapter = LGRecyclerViewAdapter.Create(luacontext, "ListAdapterTest")
            pAdapter?.SetOnItemSelected(Companion::onItemSelected)
            pAdapter?.SetOnCreateViewHolder(Companion::onCreateViewHolder as KCallable<Any>)
            pAdapter?.SetOnBindViewHolder(Companion::onBindViewHolder)
            pAdapter?.SetGetItemViewType(Companion::onGetItemViewType as KCallable<Int>)
            pAdapter?.AddValue("Form Ui")
            pAdapter?.AddValue("Horizontal Scroll View")
            pAdapter?.AddValue("Vertical Scroll View")
            pAdapter?.AddValue("Map")
            pAdapter?.AddValue("Message Box")
            pAdapter?.AddValue("Date Picker Dialog")
            pAdapter?.AddValue("Time Picker Dialog")
            pAdapter?.AddValue("Toast")
            (pGUI as LGRecyclerView).SetAdapter(pAdapter)
            pAdapter?.Notify()
        }
    }
}
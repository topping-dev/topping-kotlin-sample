package dev.topping.kotlin

import android.app.Activity
import android.os.HandlerThread
import android.os.Process
import dev.topping.entry.KTEntry

actual class Platform actual constructor() {
    actual companion object {
        var luaContext: dev.topping.android.luagui.LuaContext? = null
        var luaId: String? = null
        private var bindingMap: HashMap<Any, Any>? = null
        private var retBindingMap: HashMap<Any, Any>? = null

        actual fun Init(activityOrWindow: Any, onComplete: GenericOnComplete) {
            KTEntry.Init()
            luaContext = dev.topping.android.luagui.LuaContext.CreateLuaContext(activityOrWindow as Activity?)

            val luaEngine = dev.topping.android.ToppingEngine.getInstance()
            val ht = HandlerThread("Lua Loader Thread", Process.THREAD_PRIORITY_URGENT_DISPLAY)
            ht.start()

            val handler: dev.topping.android.backend.LuaLoadHandler = object : dev.topping.android.backend.LuaLoadHandler(activityOrWindow as Activity?, ht.looper) {
                override fun OnFinished() {
                    var lf: dev.topping.android.LuaForm = activityOrWindow as dev.topping.android.LuaForm;
                    luaId = luaEngine.GetMainForm()
                    val initUI = luaEngine.GetMainUI()
                    if (initUI.compareTo("") != 0) {
                        val inflater = dev.topping.android.luagui.LuaViewInflator(luaContext)
                        var view: android.widget.LGView? = inflater.ParseFile(initUI, null)
                        lf.SetView(view)
                        lf.setContentView(view?.view);
                    }
                    else dev.topping.android.LuaForm.OnFormEvent(lf, LuaForm.FORM_EVENT_CREATE, luaContext)
                    ht.quit()
                    onComplete.onComplete();
                }
            }
            handler.sendEmptyMessage(dev.topping.android.backend.LuaLoadHandler.INIT_MESSAGE)
        }

        actual fun GetRetBindings(): HashMap<Any, Any>? {
            return retBindingMap
        }

        actual fun GetBindings(): HashMap<Any, Any>? {
            if(bindingMap == null)
            {
                bindingMap = hashMapOf(
                    android.widget.LGAbsListView::class to LGAbsListView::class,
                    android.widget.LGAdapterView::class to LGAdapterView::class,
                    android.widget.LGAutoCompleteTextView::class to LGAutoCompleteTextView::class,
                    android.widget.LGButton::class to LGButton::class,
                    android.widget.LGCheckBox::class to LGCheckBox::class,
                    android.widget.LGComboBox::class to LGComboBox::class,
                    android.widget.LGCompoundButton::class to LGCompoundButton::class,
                    android.widget.LGDatePicker::class to LGDatePicker::class,
                    android.widget.LGEditText::class to LGEditText::class,
                    android.widget.LGFragmentContainerView::class to LGFragmentContainerView::class,
                    android.widget.LGFrameLayout::class to LGFrameLayout::class,
                    android.widget.LGHorizontalScrollView::class to LGHorizontalScrollView::class,
                    android.widget.LGImageView::class to LGImageView::class,
                    android.widget.LGLinearLayout::class to LGLinearLayout::class,
                    android.widget.LGListView::class to LGListView::class,
                    android.widget.LGListViewFragment::class to LGListViewFragment::class,
                    android.widget.LGProgressBar::class to LGProgressBar::class,
                    android.widget.LGRadioButton::class to LGRadioButton::class,
                    android.widget.LGRecyclerView::class to LGRecyclerView::class,
                    android.widget.LGRecyclerViewAdapter::class to LGRecyclerViewAdapter::class,
                    android.widget.LGRelativeLayout::class to LGRelativeLayout::class,
                    android.widget.LGScrollView::class to LGScrollView::class,
                    android.widget.LGTextView::class to LGTextView::class,
                    android.widget.LGToolbar::class to LGToolbar::class,
                    android.widget.LGView::class to LGView::class,
                    android.widget.LGViewGroup::class to LGViewGroup::class,
                    dev.topping.android.LuaAppBarConfiguration::class to LuaAppBarConfiguration::class,
                    dev.topping.android.LuaBuffer::class to LuaBuffer::class,
                    dev.topping.android.LuaColor::class to LuaColor::class,
                    dev.topping.android.luagui.LuaContext::class to LuaContext::class,
                    dev.topping.android.LuaCoroutineScope::class to LuaCoroutineScope::class,
                    dev.topping.android.LuaDatabase::class to LuaDatabase::class,
                    dev.topping.android.LuaDate::class to LuaDate::class,
                    dev.topping.android.LuaDefines::class to LuaDefines::class,
                    dev.topping.android.LuaDialog::class to LuaDialog::class,
                    dev.topping.android.LuaDispatchers::class to LuaDispatchers::class,
                    dev.topping.android.LuaForm::class to LuaForm::class,
                    dev.topping.android.LuaFragment::class to LuaFragment::class,
                    dev.topping.android.LuaFragmentManager::class to LuaFragmentManager::class,
                    dev.topping.android.LuaGraphics::class to LuaGraphics::class,
                    dev.topping.android.LuaHttpClient::class to LuaHttpClient::class,
                    dev.topping.android.LuaJSONArray::class to LuaJSONArray::class,
                    dev.topping.android.LuaJSONObject::class to LuaJSONObject::class,
                    dev.topping.android.LuaLifecycle::class to LuaLifecycle::class,
                    dev.topping.android.LuaLifecycleObserver::class to LuaLifecycleObserver::class,
                    dev.topping.android.LuaLifecycleOwner::class to LuaLifecycleOwner::class,
                    dev.topping.android.LuaLog::class to LuaLog::class,
                    dev.topping.android.LuaMutableLiveData::class to LuaMutableLiveData::class,
                    dev.topping.android.LuaNativeCall::class to LuaNativeCall::class,
                    dev.topping.android.LuaNativeObject::class to LuaNativeObject::class,
                    dev.topping.android.LuaNFC::class to LuaNFC::class,
                    dev.topping.android.LuaNavController::class to LuaNavController::class,
                    dev.topping.android.LuaNavHostFragment::class to LuaNavHostFragment::class,
                    dev.topping.android.LuaNavigationUI::class to LuaNavigationUI::class,
                    dev.topping.android.LuaNavOptions::class to LuaNavOptions::class,
                    dev.topping.android.LuaObjectStore::class to LuaObjectStore::class,
                    dev.topping.android.LuaPoint::class to LuaPoint::class,
                    dev.topping.android.LuaRect::class to LuaRect::class,
                    dev.topping.android.luagui.LuaRef::class to LuaRef::class,
                    dev.topping.android.LuaResource::class to LuaResource::class,
                    dev.topping.android.LuaStore::class to LuaStore::class,
                    dev.topping.android.LuaStream::class to LuaStream::class,
                    dev.topping.android.LuaTabForm::class to LuaTabForm::class,
                    dev.topping.android.LuaThread::class to LuaThread::class,
                    dev.topping.android.LuaToast::class to LuaToast::class,
                    dev.topping.android.LuaTranslator::class to LuaTranslator::class,
                    dev.topping.android.luagui.LuaViewInflator::class to LuaViewInflator::class,
                    dev.topping.android.LuaViewModel::class to LuaViewModel::class,
                    dev.topping.android.LuaViewModelProvider::class to LuaViewModelProvider::class
                )
                retBindingMap = HashMap<Any, Any>()
                for ((k, v) in bindingMap!!) {
                    retBindingMap?.put(v, k)
                }
            }
            return bindingMap;
        }
    }

}
package dev.topping.kotlin

import dev.topping.entry.KTEntry
import platform.UIKit.UIWindow

actual class Platform actual constructor() {
    actual companion object {
        private val bindingMap: HashMap<Any, Any>? = hashMapOf(
            cocoapods.Topping.LGAbsListView.className().toString() to LGAbsListView::class,
            cocoapods.Topping.LGAdapterView.className().toString() to LGAdapterView::class,
            cocoapods.Topping.LGAutoCompleteTextView.className().toString() to LGAutoCompleteTextView::class,
            cocoapods.Topping.LGBottomNavigationView.className().toString() to LGBottomNavigationView::class,
            cocoapods.Topping.LGButton.className().toString() to LGButton::class,
            cocoapods.Topping.LGCheckBox.className().toString() to LGCheckBox::class,
            cocoapods.Topping.LGComboBox.className().toString() to LGComboBox::class,
            cocoapods.Topping.LGCompoundButton.className().toString() to LGCompoundButton::class,
            cocoapods.Topping.LGConstraintLayout.className().toString() to LGConstraintLayout::class,
            cocoapods.Topping.LGDatePicker.className().toString() to LGDatePicker::class,
            cocoapods.Topping.LGEditText.className().toString() to LGEditText::class,
            cocoapods.Topping.LGFragmentContainerView.className().toString() to LGFragmentContainerView::class,
            cocoapods.Topping.LGFragmentStateAdapter.className().toString() to LGFragmentStateAdapter::class,
            cocoapods.Topping.LGFrameLayout.className().toString() to LGFrameLayout::class,
            cocoapods.Topping.LGHorizontalScrollView.className().toString() to LGHorizontalScrollView::class,
            cocoapods.Topping.LGImageView.className().toString() to LGImageView::class,
            cocoapods.Topping.LGLinearLayout.className().toString() to LGLinearLayout::class,
            cocoapods.Topping.LGListView.className().toString() to LGListView::class,
            cocoapods.Topping.LGProgressBar.className().toString() to LGProgressBar::class,
            cocoapods.Topping.LGRadioButton.className().toString() to LGRadioButton::class,
            cocoapods.Topping.LGRecyclerView.className().toString() to LGRecyclerView::class,
            cocoapods.Topping.LGRecyclerViewAdapter.className().toString() to LGRecyclerViewAdapter::class,
            cocoapods.Topping.LGRelativeLayout.className().toString() to LGRelativeLayout::class,
            cocoapods.Topping.LGScrollView.className().toString() to LGScrollView::class,
            cocoapods.Topping.LGTabLayout.className().toString() to LGTabLayout::class,
            cocoapods.Topping.LGTextView.className().toString() to LGTextView::class,
            cocoapods.Topping.LGToolbar.className().toString() to LGToolbar::class,
            cocoapods.Topping.LGView.className().toString() to LGView::class,
            cocoapods.Topping.LGViewGroup.className().toString() to LGViewGroup::class,
            cocoapods.Topping.LGViewPager.className().toString() to LGViewPager::class,
            cocoapods.Topping.LuaAppBarConfiguration.className().toString() to LuaAppBarConfiguration::class,
            cocoapods.Topping.LuaBuffer.className().toString() to LuaBuffer::class,
            cocoapods.Topping.LuaColor.className().toString() to LuaColor::class,
            cocoapods.Topping.LuaContext.className().toString() to LuaContext::class,
            cocoapods.Topping.LuaCoroutineScope.className().toString() to LuaCoroutineScope::class,
            cocoapods.Topping.LuaDatabase.className().toString() to LuaDatabase::class,
            cocoapods.Topping.LuaDate.className().toString() to LuaDate::class,
            cocoapods.Topping.LuaDefines.className().toString() to LuaDefines::class,
            cocoapods.Topping.LuaDialog.className().toString() to LuaDialog::class,
            cocoapods.Topping.LuaDispatchers.className().toString() to LuaDispatchers::class,
            cocoapods.Topping.LuaEvent.className().toString() to LuaEvent::class,
            cocoapods.Topping.LuaForm.className().toString() to LuaForm::class,
            cocoapods.Topping.LuaFragment.className().toString() to LuaFragment::class,
            cocoapods.Topping.FragmentManager.className().toString() to LuaFragmentManager::class,
            cocoapods.Topping.LuaGraphics.className().toString() to LuaGraphics::class,
            cocoapods.Topping.LuaHttpClient.className().toString() to LuaHttpClient::class,
            cocoapods.Topping.LuaJSONArray.className().toString() to LuaJSONArray::class,
            cocoapods.Topping.LuaJSONObject.className().toString() to LuaJSONObject::class,
            cocoapods.Topping.LuaLifecycle.className().toString() to LuaLifecycle::class,
            cocoapods.Topping.LuaLifecycleObserver.className().toString() to cocoapods.Topping.LuaLifecycleObserver::class,
            cocoapods.Topping.LuaLifecycleOwner.className().toString() to LuaLifecycleOwner::class,
            cocoapods.Topping.LuaLog.className().toString() to LuaLog::class,
            cocoapods.Topping.LuaMutableLiveData.className().toString() to LuaMutableLiveData::class,
            cocoapods.Topping.LuaNativeCall.className().toString() to LuaNativeCall::class,
            cocoapods.Topping.LuaNativeObject.className().toString() to LuaNativeObject::class,
            cocoapods.Topping.LuaNavController.className().toString() to LuaNavController::class,
            cocoapods.Topping.LuaNavHostFragment.className().toString() to LuaNavHostFragment::class,
            cocoapods.Topping.NavOptions.className().toString() to LuaNavOptions::class,
            cocoapods.Topping.LuaObjectStore.className().toString() to LuaObjectStore::class,
            cocoapods.Topping.LuaPoint.className().toString() to LuaPoint::class,
            cocoapods.Topping.LuaRect.className().toString() to LuaRect::class,
            cocoapods.Topping.LuaRef.className().toString() to LuaRef::class,
            cocoapods.Topping.LuaResource.className().toString() to LuaResource::class,
            cocoapods.Topping.LuaStore.className().toString() to LuaStore::class,
            cocoapods.Topping.LuaStream.className().toString() to LuaStream::class,
            cocoapods.Topping.LuaTab.className().toString() to LuaTab::class,
            cocoapods.Topping.LuaThread.className().toString() to LuaThread::class,
            cocoapods.Topping.LuaToast.className().toString() to LuaToast::class,
            cocoapods.Topping.LuaTranslator.className().toString() to LuaTranslator::class,
            cocoapods.Topping.LuaViewInflator.className().toString() to LuaViewInflator::class,
            cocoapods.Topping.LuaViewModel.className().toString() to LuaViewModel::class,
            cocoapods.Topping.LuaViewModelProvider.className().toString() to LuaViewModelProvider::class,
        )
        private val retBindingMap: HashMap<Any, Any>? = null

        actual fun Init(activityOrWindow: Any, onComplete: GenericOnComplete) {
            KTEntry.Init()
            cocoapods.Topping.CommonDelegate.GetInstance()?.InitMain(activityOrWindow as UIWindow, null)
        }

        actual fun GetRetBindings(): HashMap<Any, Any>? {
            return retBindingMap
        }

        actual fun GetBindings(): HashMap<Any, Any>? {
            /*if(bindingMap == null)
            {
                retBindingMap = HashMap<Any, Any>()
                for ((k, v) in bindingMap!!) {
                    retBindingMap?.put(v, k)
                }
            }*/
            return bindingMap;
        }
    }

}
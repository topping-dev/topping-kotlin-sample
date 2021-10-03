package dev.topping.kotlin

import dev.topping.entry.KTEntry
import platform.UIKit.UIWindow

actual class Platform actual constructor() {
    actual companion object {
        private val bindingMap: HashMap<Any, Any>? = hashMapOf(
            cocoapods.Topping.LGAbsListView.className().toString() to LGAbsListView::class,
            cocoapods.Topping.LGAdapterView.className().toString() to LGAdapterView::class,
            cocoapods.Topping.LGAutoCompleteTextView.className().toString() to LGAutoCompleteTextView::class,
            cocoapods.Topping.LGButton.className().toString() to LGButton::class,
            cocoapods.Topping.LGCheckBox.className().toString() to LGCheckBox::class,
            cocoapods.Topping.LGComboBox.className().toString() to LGComboBox::class,
            cocoapods.Topping.LGCompoundButton.className().toString() to LGCompoundButton::class,
            cocoapods.Topping.LGDatePicker.className().toString() to LGDatePicker::class,
            cocoapods.Topping.LGEditText.className().toString() to LGEditText::class,
            cocoapods.Topping.LGFrameLayout.className().toString() to LGFrameLayout::class,
            cocoapods.Topping.LGHorizontalScrollView.className().toString() to LGHorizontalScrollView::class,
            cocoapods.Topping.LGImageView.className().toString() to LGImageView::class,
            cocoapods.Topping.LGLinearLayout.className().toString() to LGLinearLayout::class,
            cocoapods.Topping.LGListView.className().toString() to LGListView::class,
            cocoapods.Topping.LGMapView.className().toString() to LGMapView::class,
            cocoapods.Topping.LGProgressBar.className().toString() to LGProgressBar::class,
            cocoapods.Topping.LGRadioButton.className().toString() to LGRadioButton::class,
            cocoapods.Topping.LGRecyclerView.className().toString() to LGRecyclerView::class,
            cocoapods.Topping.LGRecyclerViewAdapter.className().toString() to LGRecyclerViewAdapter::class,
            cocoapods.Topping.LGRelativeLayout.className().toString() to LGRelativeLayout::class,
            cocoapods.Topping.LGScrollView.className().toString() to LGScrollView::class,
            cocoapods.Topping.LGTableLayout.className().toString() to LGTableLayout::class,
            cocoapods.Topping.LGTableRow.className().toString() to LGTableRow::class,
            cocoapods.Topping.LGTextView.className().toString() to LGTextView::class,
            cocoapods.Topping.LGToolbar.className().toString() to LGToolbar::class,
            cocoapods.Topping.LGView.className().toString() to LGView::class,
            cocoapods.Topping.LGViewGroup.className().toString() to LGViewGroup::class,
            cocoapods.Topping.LuaColor.className().toString() to LuaColor::class,
            cocoapods.Topping.LuaContext.className().toString() to LuaContext::class,
            cocoapods.Topping.LuaDatabase.className().toString() to LuaDatabase::class,
            cocoapods.Topping.LuaDate.className().toString() to LuaDate::class,
            cocoapods.Topping.LuaDefines.className().toString() to LuaDefines::class,
            cocoapods.Topping.LuaDialog.className().toString() to LuaDialog::class,
            cocoapods.Topping.LuaForm.className().toString() to LuaForm::class,
            cocoapods.Topping.LuaFragment.className().toString() to LuaFragment::class,
            cocoapods.Topping.LuaGraphics.className().toString() to LuaGraphics::class,
            cocoapods.Topping.LuaHttpClient.className().toString() to LuaHttpClient::class,
            cocoapods.Topping.LuaJSONArray.className().toString() to LuaJSONArray::class,
            cocoapods.Topping.LuaJSONObject.className().toString() to LuaJSONObject::class,
            cocoapods.Topping.LuaLog.className().toString() to LuaLog::class,
            cocoapods.Topping.LuaMapCircle.className().toString() to LuaMapCircle::class,
            cocoapods.Topping.LuaMapImage.className().toString() to LuaMapImage::class,
            cocoapods.Topping.LuaMapMarker.className().toString() to LuaMapMarker::class,
            cocoapods.Topping.LuaMapPolygon.className().toString() to LuaMapPolygon::class,
            cocoapods.Topping.LuaMapPolyline.className().toString() to LuaMapPolyline::class,
            cocoapods.Topping.LuaNativeObject.className().toString() to LuaNativeObject::class,
            cocoapods.Topping.LuaObjectStore.className().toString() to LuaObjectStore::class,
            cocoapods.Topping.LuaPoint.className().toString() to LuaPoint::class,
            cocoapods.Topping.LuaRect.className().toString() to LuaRect::class,
            cocoapods.Topping.LuaResource.className().toString() to LuaResource::class,
            cocoapods.Topping.LuaStore.className().toString() to LuaStore::class,
            cocoapods.Topping.LuaStream.className().toString() to LuaStream::class,
            cocoapods.Topping.LuaTabForm.className().toString() to LuaTabForm::class,
            cocoapods.Topping.LuaThread.className().toString() to LuaThread::class,
            cocoapods.Topping.LuaToast.className().toString() to LuaToast::class,
            cocoapods.Topping.LuaTranslator.className().toString() to LuaTranslator::class,
            cocoapods.Topping.LuaViewInflator.className().toString() to LuaViewInflator::class
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
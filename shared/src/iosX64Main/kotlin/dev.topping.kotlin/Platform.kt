package dev.topping.kotlin

import platform.UIKit.UIWindow

actual class Platform actual constructor() {
    actual companion object {
        var luaContext: cocoapods.Topping.LuaContext? = null
        var luaId: String? = null
        private var bindingMap: HashMap<Any, Any>? = null
        private var retBindingMap: HashMap<Any, Any>? = null

        actual fun Init(activityOrWindow: Any, onComplete: GenericOnComplete) {
            KTEntry.Init()
            cocoapods.Topping.CommonDelegate.GetInstance()?.InitMain(activityOrWindow as UIWindow, null)
        }

        actual fun GetRetBindings(): HashMap<Any, Any>? {
            return retBindingMap
        }

        actual fun GetBindings(): HashMap<Any, Any>? {
            if(bindingMap == null)
            {
                bindingMap = hashMapOf(
                        cocoapods.Topping.LGAbsListView::class to LGAbsListView::class,
                        cocoapods.Topping.LGAdapterView::class to LGAdapterView::class,
                        cocoapods.Topping.LGAutoCompleteTextView::class to LGAutoCompleteTextView::class,
                        cocoapods.Topping.LGButton::class to LGButton::class,
                        cocoapods.Topping.LGCheckBox::class to LGCheckBox::class,
                        cocoapods.Topping.LGComboBox::class to LGComboBox::class,
                        cocoapods.Topping.LGCompoundButton::class to LGCompoundButton::class,
                        cocoapods.Topping.LGDatePicker::class to LGDatePicker::class,
                        cocoapods.Topping.LGEditText::class to LGEditText::class,
                        cocoapods.Topping.LGFrameLayout::class to LGFrameLayout::class,
                        cocoapods.Topping.LGHorizontalScrollView::class to LGHorizontalScrollView::class,
                        cocoapods.Topping.LGImageView::class to LGImageView::class,
                        cocoapods.Topping.LGLinearLayout::class to LGLinearLayout::class,
                        cocoapods.Topping.LGListView::class to LGListView::class,
                        cocoapods.Topping.LGMapView::class to LGMapView::class,
                        cocoapods.Topping.LGProgressBar::class to LGProgressBar::class,
                        cocoapods.Topping.LGRadioButton::class to LGRadioButton::class,
                        cocoapods.Topping.LGRecyclerView::class to LGRecyclerView::class,
                        cocoapods.Topping.LGRecyclerViewAdapter::class to LGRecyclerViewAdapter::class,
                        cocoapods.Topping.LGRelativeLayout::class to LGRelativeLayout::class,
                        cocoapods.Topping.LGScrollView::class to LGScrollView::class,
                        cocoapods.Topping.LGTableLayout::class to LGTableLayout::class,
                        cocoapods.Topping.LGTableRow::class to LGTableRow::class,
                        cocoapods.Topping.LGTextView::class to LGTextView::class,
                        cocoapods.Topping.LGToolbar::class to LGToolbar::class,
                        cocoapods.Topping.LGView::class to LGView::class,
                        cocoapods.Topping.LGViewGroup::class to LGViewGroup::class,
                        cocoapods.Topping.LuaColor::class to LuaColor::class,
                        cocoapods.Topping.LuaContext::class to LuaContext::class,
                        cocoapods.Topping.LuaDatabase::class to LuaDatabase::class,
                        cocoapods.Topping.LuaDate::class to LuaDate::class,
                        cocoapods.Topping.LuaDefines::class to LuaDefines::class,
                        cocoapods.Topping.LuaDialog::class to LuaDialog::class,
                        cocoapods.Topping.LuaForm::class to LuaForm::class,
                        cocoapods.Topping.LuaFragment::class to LuaFragment::class,
                        cocoapods.Topping.LuaGraphics::class to LuaGraphics::class,
                        cocoapods.Topping.LuaHttpClient::class to LuaHttpClient::class,
                        cocoapods.Topping.LuaJSONArray::class to LuaJSONArray::class,
                        cocoapods.Topping.LuaJSONObject::class to LuaJSONObject::class,
                        cocoapods.Topping.LuaLog::class to LuaLog::class,
                        cocoapods.Topping.LuaMapCircle::class to LuaMapCircle::class,
                        cocoapods.Topping.LuaMapImage::class to LuaMapImage::class,
                        cocoapods.Topping.LuaMapMarker::class to LuaMapMarker::class,
                        cocoapods.Topping.LuaMapPolygon::class to LuaMapPolygon::class,
                        cocoapods.Topping.LuaMapPolyline::class to LuaMapPolyline::class,
                        cocoapods.Topping.LuaNativeObject::class to LuaNativeObject::class,
                        cocoapods.Topping.LuaObjectStore::class to LuaObjectStore::class,
                        cocoapods.Topping.LuaPoint::class to LuaPoint::class,
                        cocoapods.Topping.LuaRect::class to LuaRect::class,
                        cocoapods.Topping.LuaResource::class to LuaResource::class,
                        cocoapods.Topping.LuaStore::class to LuaStore::class,
                        cocoapods.Topping.LuaStream::class to LuaStream::class,
                        cocoapods.Topping.LuaTabForm::class to LuaTabForm::class,
                        cocoapods.Topping.LuaThread::class to LuaThread::class,
                        cocoapods.Topping.LuaToast::class to LuaToast::class,
                        cocoapods.Topping.LuaTranslator::class to LuaTranslator::class,
                        cocoapods.Topping.LuaViewInflator::class to LuaViewInflator::class
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
package dev.topping.kotlin

import platform.UIKit.UIWindow

actual class Platform actual constructor() {
    actual companion object {
        var luaContext: cocoapods.toppingios.LuaContext? = null
        var luaId: String? = null
        private var bindingMap: HashMap<Any, Any>? = null
        private var retBindingMap: HashMap<Any, Any>? = null

        actual fun Init(activityOrWindow: Any, onComplete: GenericOnComplete) {
            KTEntry.Init()
            cocoapods.toppingios.CommonDelegate.GetInstance()?.InitMain(activityOrWindow as UIWindow, null)
        }

        actual fun GetRetBindings(): HashMap<Any, Any>? {
            return retBindingMap
        }

        actual fun GetBindings(): HashMap<Any, Any>? {
            if(bindingMap == null)
            {
                bindingMap = hashMapOf(
                        cocoapods.toppingios.LGAbsListView::class to LGAbsListView::class,
                        cocoapods.toppingios.LGAdapterView::class to LGAdapterView::class,
                        cocoapods.toppingios.LGAutoCompleteTextView::class to LGAutoCompleteTextView::class,
                        cocoapods.toppingios.LGButton::class to LGButton::class,
                        cocoapods.toppingios.LGCheckBox::class to LGCheckBox::class,
                        cocoapods.toppingios.LGComboBox::class to LGComboBox::class,
                        cocoapods.toppingios.LGCompoundButton::class to LGCompoundButton::class,
                        cocoapods.toppingios.LGDatePicker::class to LGDatePicker::class,
                        cocoapods.toppingios.LGEditText::class to LGEditText::class,
                        cocoapods.toppingios.LGFrameLayout::class to LGFrameLayout::class,
                        cocoapods.toppingios.LGHorizontalScrollView::class to LGHorizontalScrollView::class,
                        cocoapods.toppingios.LGImageView::class to LGImageView::class,
                        cocoapods.toppingios.LGLinearLayout::class to LGLinearLayout::class,
                        cocoapods.toppingios.LGListView::class to LGListView::class,
                        cocoapods.toppingios.LGMapView::class to LGMapView::class,
                        cocoapods.toppingios.LGProgressBar::class to LGProgressBar::class,
                        cocoapods.toppingios.LGRadioButton::class to LGRadioButton::class,
                        cocoapods.toppingios.LGRecyclerView::class to LGRecyclerView::class,
                        cocoapods.toppingios.LGRecyclerViewAdapter::class to LGRecyclerViewAdapter::class,
                        cocoapods.toppingios.LGRelativeLayout::class to LGRelativeLayout::class,
                        cocoapods.toppingios.LGScrollView::class to LGScrollView::class,
                        cocoapods.toppingios.LGTableLayout::class to LGTableLayout::class,
                        cocoapods.toppingios.LGTableRow::class to LGTableRow::class,
                        cocoapods.toppingios.LGTextView::class to LGTextView::class,
                        cocoapods.toppingios.LGToolbar::class to LGToolbar::class,
                        cocoapods.toppingios.LGView::class to LGView::class,
                        cocoapods.toppingios.LGViewGroup::class to LGViewGroup::class,
                        cocoapods.toppingios.LuaColor::class to LuaColor::class,
                        cocoapods.toppingios.LuaContext::class to LuaContext::class,
                        cocoapods.toppingios.LuaDatabase::class to LuaDatabase::class,
                        cocoapods.toppingios.LuaDate::class to LuaDate::class,
                        cocoapods.toppingios.LuaDefines::class to LuaDefines::class,
                        cocoapods.toppingios.LuaDialog::class to LuaDialog::class,
                        cocoapods.toppingios.LuaForm::class to LuaForm::class,
                        cocoapods.toppingios.LuaFragment::class to LuaFragment::class,
                        cocoapods.toppingios.LuaGraphics::class to LuaGraphics::class,
                        cocoapods.toppingios.LuaHttpClient::class to LuaHttpClient::class,
                        cocoapods.toppingios.LuaJSONArray::class to LuaJSONArray::class,
                        cocoapods.toppingios.LuaJSONObject::class to LuaJSONObject::class,
                        cocoapods.toppingios.LuaLog::class to LuaLog::class,
                        cocoapods.toppingios.LuaMapCircle::class to LuaMapCircle::class,
                        cocoapods.toppingios.LuaMapImage::class to LuaMapImage::class,
                        cocoapods.toppingios.LuaMapMarker::class to LuaMapMarker::class,
                        cocoapods.toppingios.LuaMapPolygon::class to LuaMapPolygon::class,
                        cocoapods.toppingios.LuaMapPolyline::class to LuaMapPolyline::class,
                        cocoapods.toppingios.LuaNativeObject::class to LuaNativeObject::class,
                        cocoapods.toppingios.LuaObjectStore::class to LuaObjectStore::class,
                        cocoapods.toppingios.LuaPoint::class to LuaPoint::class,
                        cocoapods.toppingios.LuaRect::class to LuaRect::class,
                        cocoapods.toppingios.LuaResource::class to LuaResource::class,
                        cocoapods.toppingios.LuaStore::class to LuaStore::class,
                        cocoapods.toppingios.LuaStream::class to LuaStream::class,
                        cocoapods.toppingios.LuaTabForm::class to LuaTabForm::class,
                        cocoapods.toppingios.LuaThread::class to LuaThread::class,
                        cocoapods.toppingios.LuaToast::class to LuaToast::class,
                        cocoapods.toppingios.LuaTranslator::class to LuaTranslator::class,
                        cocoapods.toppingios.LuaViewInflator::class to LuaViewInflator::class
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
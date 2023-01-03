package dev.topping.kotlin

import kotlinx.cinterop.StableRef
import kotlinx.cinterop.staticCFunction
import kotlin.reflect.KCallable

actual open class LuaDialog : KTInterface
{
   var luaDialog: cocoapods.Topping.LuaDialog? = null
   actual companion object {
        actual val DIALOG_TYPE_NORMAL: Int = 0x01
        actual val DIALOG_TYPE_PROGRESS: Int = 0x02
        actual val DIALOG_TYPE_PROGRESS_INDETERMINATE: Int = 0x6
        actual val DIALOG_TYPE_DATEPICKER: Int = 0x08
        actual val DIALOG_TYPE_TIMEPICKER: Int = 0x10
       actual fun MessageBox(context: LuaContext?, title: LuaRef?, content: LuaRef?)
       {
           cocoapods.Topping.LuaDialog.MessageBox(context?.luaContext, title?.luaRef, content?.luaRef)
       }
        actual fun MessageBoxInternal(context: LuaContext?, title: String?, content: String?)
        {
            cocoapods.Topping.LuaDialog.MessageBoxInternal(context?.luaContext, title, content)
        }
        actual fun Create(context: LuaContext?, dialogType: Int): LuaDialog?
        {
            val pobj = LuaDialog()
            val pres = cocoapods.Topping.LuaDialog.Create(context?.luaContext, dialogType)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
    actual fun SetPositiveButton(title: LuaRef?, action: LuaTranslator?)
    {
        luaDialog?.SetPositiveButton(title?.luaRef, action?.luaTranslator)
    }
   actual fun SetPositiveButtonInternal(title: String?, action: LuaTranslator?)
   {
       luaDialog?.SetPositiveButtonInternal(title, action?.luaTranslator)
   }
    actual fun SetNegativeButton(title: LuaRef?, action: LuaTranslator?)
    {
        luaDialog?.SetNegativeButton(title?.luaRef, action?.luaTranslator)
    }
   actual fun SetNegativeButtonInternal(title: String?, action: LuaTranslator?)
   {
       luaDialog?.SetNegativeButtonInternal(title, action?.luaTranslator)
   }
   actual fun SetTitle(title: String?)
   {
       luaDialog?.SetTitle(title)
   }
   actual fun SetTitle(titleRef: LuaRef?)
   {
       luaDialog?.SetTitleRef(titleRef?.luaRef)
   }
   actual fun SetMessage(message: String?)
   {
       luaDialog?.SetMessage(message)
   }
   actual fun SetMessage(messageRef: LuaRef?)
   {
       luaDialog?.SetMessageRef(messageRef?.luaRef)
   }
   actual fun SetProgress(value: Int?)
   {
       luaDialog?.SetProgress(value!!)
   }
   actual fun SetMax(value: Int?)
   {
       luaDialog?.SetMax(value!!)
   }
   actual fun SetDate(date: LuaDate?)
   {
       luaDialog?.SetDate(date?.luaDate)
   }
   actual fun SetDateManual(day: Int, month: Int, year: Int)
   {
       luaDialog?.SetDateManual(day, month, year)
   }
   actual fun SetTime(date: LuaDate?)
   {
       luaDialog?.SetTime(date?.luaDate)
   }
   actual fun SetTimeManual(hour: Int, minute: Int)
   {
       luaDialog?.SetTimeManual(hour, minute)
   }
   actual fun Show()
   {
       luaDialog?.Show()
   }
   actual fun Dismiss()
   {
       luaDialog?.Dismiss()
   }
   actual fun SetDateSelectedListener(func: KCallable<Unit>?)
   {
       val kt: KTWrap = KTWrap()
       val lt: cocoapods.Topping.LuaTranslator = cocoapods.Topping.LuaTranslator()
       lt.nobj = StableRef.create(kt).asCPointer()
       lt.kFRetF = kt.Init(this, func)
       luaDialog?.SetDateSelectedListener(lt)
   }
   actual fun SetTimeSelectedListener(func: KCallable<Unit>?)
   {
       val kt: KTWrap = KTWrap()
       val lt: cocoapods.Topping.LuaTranslator = cocoapods.Topping.LuaTranslator()
       lt.nobj = StableRef.create(kt).asCPointer()
       lt.kFRetF = kt.Init(this, func)
       luaDialog?.SetTimeSelectedListener(lt)
   }
    open override fun GetNativeObject(): Any?
   {
       return luaDialog
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaDialog = par as cocoapods.Topping.LuaDialog?
   }
}
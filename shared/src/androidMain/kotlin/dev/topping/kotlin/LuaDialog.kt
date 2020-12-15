package dev.topping.kotlin

import kotlin.reflect.KCallable

actual open class LuaDialog : KTInterface
{
   var luaDialog: dev.topping.android.LuaDialog? = null
   actual companion object {
        actual val DIALOG_TYPE_NORMAL: Int = 0x01
        actual val DIALOG_TYPE_PROGRESS: Int = 0x02
        actual val DIALOG_TYPE_PROGRESS_INDETERMINATE: Int = 0x6
        actual val DIALOG_TYPE_DATEPICKER: Int = 0x08
        actual val DIALOG_TYPE_TIMEPICKER: Int = 0x10
        actual fun MessageBox(context: LuaContext?, title: String?, content: String?)
        {
            dev.topping.android.LuaDialog.MessageBox(context?.luaContext, title, content)
        }
        actual fun Create(context: LuaContext?, dialogType: Int): LuaDialog?
        {
            val pobj = LuaDialog()
            val pres = dev.topping.android.LuaDialog.Create(context?.luaContext, dialogType)
            pobj.SetNativeObject(pres)
            return pobj
        }
   }
   actual fun SetPositiveButton(title: String?, action: LuaTranslator?)
   {
       luaDialog?.SetPositiveButton(title, action?.luaTranslator)
   }
   actual fun SetNegativeButton(title: String?, action: LuaTranslator?)
   {
       luaDialog?.SetNegativeButton(title, action?.luaTranslator)
   }
   actual fun SetTitle(title: String?)
   {
       luaDialog?.SetTitle(title)
   }
   actual fun SetTitleRef(titleRef: LuaRef?)
   {
       luaDialog?.SetTitleRef(titleRef?.luaRef)
   }
   actual fun SetMessage(message: String?)
   {
       luaDialog?.SetMessage(message)
   }
   actual fun SetMessage(messageRef: LuaRef?)
   {
       luaDialog?.SetMessage(messageRef?.luaRef)
   }
   actual fun SetProgress(value: Int?)
   {
       luaDialog?.SetProgress(value)
   }
   actual fun SetMax(value: Int?)
   {
       luaDialog?.SetMax(value)
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
       val kt: KTWrap<Unit> = KTWrap<Unit>()
       val lt: dev.topping.android.LuaTranslator = dev.topping.android.LuaTranslator(kt, kt.Init(this, func))
       luaDialog?.SetDateSelectedListener(lt)
   }
   actual fun SetTimeSelectedListener(func: KCallable<Unit>?)
   {
       val kt: KTWrap<Unit> = KTWrap<Unit>()
       val lt: dev.topping.android.LuaTranslator = dev.topping.android.LuaTranslator(kt, kt.Init(this, func))
       luaDialog?.SetTimeSelectedListener(lt)
   }
    open override fun GetNativeObject(): Any?
   {
       return luaDialog
   }
    open override fun SetNativeObject(par :Any?)
   {
       luaDialog = par as dev.topping.android.LuaDialog?
   }
}
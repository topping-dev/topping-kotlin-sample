package dev.topping.kotlin

expect open class LuaDialog
{
   companion object {
        val DIALOG_TYPE_NORMAL: Int
        val DIALOG_TYPE_PROGRESS: Int
        val DIALOG_TYPE_PROGRESS_INDETERMINATE: Int
        val DIALOG_TYPE_DATEPICKER: Int
        val DIALOG_TYPE_TIMEPICKER: Int
        fun MessageBox(context: LuaContext, title: LuaRef, content: LuaRef)
        fun MessageBoxInternal(context: LuaContext, title: String, content: String)
        fun Create(context: LuaContext, dialogType: Int): LuaDialog
   }
    fun SetPositiveButton(title: LuaRef, action: LuaTranslator?)
   fun SetPositiveButtonInternal(title: String, action: LuaTranslator?)
    fun SetNegativeButton(title: LuaRef, action: LuaTranslator?)
   fun SetNegativeButtonInternal(title: String, action: LuaTranslator?)
   fun SetTitle(title: String)
   fun SetTitle(titleRef: LuaRef)
   fun SetMessage(message: String)
   fun SetMessage(messageRef: LuaRef)
   fun SetProgress(value: Int)
   fun SetMax(value: Int)
   fun SetDate(date: LuaDate)
   fun SetDateManual(day: Int, month: Int, year: Int)
   fun SetTime(date: LuaDate)
   fun SetTimeManual(hour: Int, minute: Int)
   fun Show()
   fun Dismiss()
   fun SetDateSelectedListener(func: ((LuaDialog, Int, Int, Int) -> Unit)?)
   fun SetTimeSelectedListener(func: ((LuaDialog, Int, Int, Int) -> Unit)?)
}
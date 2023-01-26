package dev.topping.kotlin

expect open class LuaDialog
{
   companion object {
        val DIALOG_TYPE_NORMAL: Int
        val DIALOG_TYPE_PROGRESS: Int
        val DIALOG_TYPE_PROGRESS_INDETERMINATE: Int
        val DIALOG_TYPE_DATEPICKER: Int
        val DIALOG_TYPE_TIMEPICKER: Int
        fun messageBox(context: LuaContext, title: LuaRef, content: LuaRef)
        fun messageBoxInternal(context: LuaContext, title: String, content: String)
        fun create(context: LuaContext, dialogType: Int): LuaDialog
   }
    fun setPositiveButton(title: LuaRef, action: LuaTranslator?)
   fun setPositiveButtonInternal(title: String, action: LuaTranslator?)
    fun setNegativeButton(title: LuaRef, action: LuaTranslator?)
   fun setNegativeButtonInternal(title: String, action: LuaTranslator?)
   fun setTitle(title: String)
   fun setTitle(titleRef: LuaRef)
   fun setMessage(message: String)
   fun setMessage(messageRef: LuaRef)
   fun setProgress(value: Int)
   fun setMax(value: Int)
   fun setDate(date: LuaDate)
   fun setDateManual(day: Int, month: Int, year: Int)
   fun setTime(date: LuaDate)
   fun setTimeManual(hour: Int, minute: Int)
   fun show()
   fun dismiss()
   fun setDateSelectedListener(func: ((LuaDialog, Int, Int, Int) -> Unit)?)
   fun setTimeSelectedListener(func: ((LuaDialog, Int, Int, Int) -> Unit)?)
}
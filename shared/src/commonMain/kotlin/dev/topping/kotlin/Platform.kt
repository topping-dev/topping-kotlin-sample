package dev.topping.kotlin

expect class Platform() {
    companion object
    {
        fun GetBindings() : HashMap<Any, Any>?
        fun GetRetBindings() : HashMap<Any, Any>?
        fun Init(activityOrWindow: Any, onComplete: GenericOnComplete)
    }
}
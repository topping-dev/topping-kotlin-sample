package dev.topping.kotlin

expect class Platform() {
    companion object
    {
        fun getBindings() : HashMap<Any, Any>?
        fun getRetBindings() : HashMap<Any, Any>?
        fun init(activityOrWindow: Any, onComplete: GenericOnComplete)
    }
}
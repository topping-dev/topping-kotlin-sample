package dev.topping.kotlin

import kotlin.reflect.KClass

actual class KTClass {
    actual companion object
    {
        actual fun createInstance(cls: KClass<*>): Any?
        {
            return null;
        }
    }
}
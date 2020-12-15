package dev.topping.kotlin

import kotlin.reflect.KClass
import kotlin.reflect.full.createInstance

actual class KTClass {
    actual companion object {
        actual fun createInstance(cls: KClass<*>) : Any?
        {
            return cls.createInstance()
        }
    }
}
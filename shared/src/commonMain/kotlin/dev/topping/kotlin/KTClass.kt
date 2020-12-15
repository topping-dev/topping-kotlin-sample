package dev.topping.kotlin

import kotlin.reflect.KClass

expect class KTClass {
    companion object {
        fun createInstance(cls: KClass<*>): Any?
    }
}
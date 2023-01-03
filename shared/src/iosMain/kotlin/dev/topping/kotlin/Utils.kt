package dev.topping.kotlin

import platform.Foundation.NSDictionary
import platform.Foundation.NSMutableDictionary
import platform.Foundation.NSString

class Utils {
}

fun <String, V> Map<out String, V>.toNSMutableDictionary(): NSMutableDictionary {
    if (isEmpty())
        return NSMutableDictionary()
    val dictionary = NSMutableDictionary()
    entries.forEach {
        dictionary.setObject(it.value, it.key as NSString)
    }
    return dictionary
}

fun <String, V> Map<out String, V>.toNSDictionary(): NSDictionary {
    if (isEmpty())
        return NSMutableDictionary()
    val dictionary = NSMutableDictionary()
    entries.forEach {
        dictionary.setObject(it.value, it.key as NSString)
    }
    return dictionary
}

fun <String, V> MutableMap<out String, V>.toNSMutableDictionary(): NSMutableDictionary {
    if (isEmpty())
        return NSMutableDictionary()
    val dictionary = NSMutableDictionary()
    entries.forEach {
        dictionary.setObject(it.value, it.key as NSString)
    }
    return dictionary
}

fun <String, V> MutableMap<out String, V>.toNSDictionary(): NSDictionary {
    if (isEmpty())
        return NSMutableDictionary()
    val dictionary = NSMutableDictionary()
    entries.forEach {
        dictionary.setObject(it.value, it.key as NSString)
    }
    return dictionary
}
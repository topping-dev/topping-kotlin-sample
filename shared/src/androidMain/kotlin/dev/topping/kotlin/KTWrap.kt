package dev.topping.kotlin

import kotlin.reflect.KCallable
import kotlin.reflect.KClass
import kotlin.reflect.full.superclasses

class KTWrap<T> {
    companion object {
        fun Wrap(objIn: Any?): Any?
        {
            val bindings = Platform.GetBindings()
            if(objIn == null)
                return null

            if(bindings?.containsKey(objIn::class)!!)
            {
                val cls = bindings[objIn::class] as KClass<*>
                val obj = KTClass.createInstance(cls)
                if(obj is KTInterface)
                {
                    (obj as KTInterface).SetNativeObject(objIn)
                    return obj
                }
            }
            else {
                val clsesSuper = objIn::class::superclasses
                clsesSuper.get().forEach {
                    val cls = bindings[objIn::class] as KClass<*>
                    val obj = KTClass.createInstance(cls)
                    if(obj is KTInterface)
                    {
                        (obj as KTInterface).SetNativeObject(objIn)
                        return obj
                    }
                }
            }

            return objIn
        }

        fun UnWrap(objIn: Any?): Any?
        {
           if(objIn is KTInterface) {
               return objIn.GetNativeObject()
           }

            return objIn
        }
    }

    var obj: Any? = null
    var funcStore: KCallable<T>? = null

    fun Init(obj: Any?, func: KCallable<T>?): KCallable<T>
    {
        this.obj = obj
        this.funcStore = func
        return KTWrap<T>::funToCall as KCallable<T>
    }

    private fun findBinding(kClass: KClass<out Any>): Any? {
        val bindings = Platform.GetBindings()
        val retBindings = Platform.GetRetBindings()
        if(bindings?.containsKey(kClass) == true)
        {
            return bindings[kClass]
        }
        else {
            kClass.superclasses.forEach {
                if (bindings?.containsKey(it) == true) {
                    return bindings[it]
                }
            }
        }
        return null
    }

    fun funToCall(vararg vars: Any): T?
    {
        val valsWrapped: ArrayList<Any> = arrayListOf()

        for((count, item) in vars.withIndex())
        {
            if(item == null) {
                valsWrapped.add(vars[count])
                continue
            }
            var bindedClass = findBinding(item::class)
            if(bindedClass != null)
            {
                val cls = bindedClass as KClass<*>
                val obj = KTClass.createInstance(cls)
                if(obj is KTInterface)
                {
                    (obj as KTInterface).SetNativeObject(vars[count])
                    valsWrapped.add(obj)
                }
            }
            else
                valsWrapped.add(vars[count])
        }
        val ret: Any?
        if(obj != null)
            ret = funcStore?.call(obj, *valsWrapped.toTypedArray())
        else
            ret = funcStore?.call(*valsWrapped.toTypedArray())

        val retWrapped: Any?
        if(ret != null) {
            if (ret is KTInterface) {
                retWrapped = (ret as KTInterface).GetNativeObject()
            }
            else
                retWrapped = ret
        }
        else
            retWrapped = null

        return retWrapped as T
    }
}
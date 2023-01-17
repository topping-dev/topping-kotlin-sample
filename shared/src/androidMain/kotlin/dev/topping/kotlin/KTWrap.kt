package dev.topping.kotlin

import kotlin.reflect.KCallable
import kotlin.reflect.KClass
import kotlin.reflect.full.superclasses
import kotlin.jvm.functions.*

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
    var funcStoreL: Function<T>? = null

    fun Init(obj: Any?, func: KCallable<T>?): KCallable<T>
    {
        this.obj = obj
        this.funcStore = func
        return KTWrap<T>::funToCall as KCallable<T>
    }

    fun Init(obj: Any?, func: Function<T>?): KCallable<T>
    {
        this.obj = obj
        this.funcStoreL = func
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
        if(funcStore != null) {
            if (obj != null)
                ret = funcStore?.call(obj, *valsWrapped.toTypedArray())
            else
                ret = funcStore?.call(*valsWrapped.toTypedArray())
        }
        else {
            if(funcStoreL is Function0) {
                ret = (funcStoreL as Function0).invoke()
            }
            else if(funcStoreL is Function1<*, *>) {
                if (obj != null)
                    ret = (funcStoreL as Function1<Any?,Any?>).invoke(obj)
                else
                    ret = (funcStoreL as Function1<Any?,Any?>).invoke(valsWrapped[0])
            }
            else if(funcStoreL is Function2<*, *, *>) {
                if (obj != null)
                    ret = (funcStoreL as Function2<Any?,Any?,Any?>).invoke(obj, valsWrapped[0])
                else
                    ret = (funcStoreL as Function2<Any?,Any?,Any?>).invoke(valsWrapped[0], valsWrapped[1])
            }
            else if(funcStoreL is Function3<*, *, *, *>)
            {
                if (obj != null)
                    ret = (funcStoreL as Function3<Any?,Any?,Any?,Any?>).invoke(obj, valsWrapped[0], valsWrapped[1])
                else
                    ret = (funcStoreL as Function3<Any?,Any?,Any?,Any?>).invoke(valsWrapped[0], valsWrapped[1], valsWrapped[2])
            }
            else if(funcStoreL is Function4<*, *, *, *, *>)
            {
                if (obj != null)
                    ret = (funcStoreL as Function4<Any?,Any?,Any?,Any?,Any?>).invoke(obj, valsWrapped[0], valsWrapped[1], valsWrapped[2])
                else
                    ret = (funcStoreL as Function4<Any?,Any?,Any?,Any?,Any?>).invoke(valsWrapped[0], valsWrapped[1], valsWrapped[2], valsWrapped[3])
            }
            else if(funcStoreL is Function5<*, *, *, *, *, *>)
            {
                if (obj != null)
                    ret = (funcStoreL as Function5<Any?,Any?,Any?,Any?,Any?,Any?>).invoke(obj, valsWrapped[0], valsWrapped[1], valsWrapped[2], valsWrapped[3])
                else
                    ret = (funcStoreL as Function5<Any?,Any?,Any?,Any?,Any?,Any?>).invoke(valsWrapped[0], valsWrapped[1], valsWrapped[2], valsWrapped[3], valsWrapped[4])
            }
            else if(funcStoreL is Function6<*, *, *, *, *, *, *>)
            {
                if (obj != null)
                    ret = (funcStoreL as Function6<Any?,Any?,Any?,Any?,Any?,Any?,Any?>).invoke(obj, valsWrapped[0], valsWrapped[1], valsWrapped[2], valsWrapped[3], valsWrapped[4])
                else
                    ret = (funcStoreL as Function6<Any?,Any?,Any?,Any?,Any?,Any?,Any?>).invoke(valsWrapped[0], valsWrapped[1], valsWrapped[2], valsWrapped[3], valsWrapped[4], valsWrapped[5])
            }
            else if(funcStoreL is Function7<*, *, *, *, *, *, *, *>)
            {
                if (obj != null)
                    ret = (funcStoreL as Function7<Any?,Any?,Any?,Any?,Any?,Any?,Any?,Any?>).invoke(obj, valsWrapped[0], valsWrapped[1], valsWrapped[2], valsWrapped[3], valsWrapped[4], valsWrapped[5])
                else
                    ret = (funcStoreL as Function7<Any?,Any?,Any?,Any?,Any?,Any?,Any?,Any?>).invoke(valsWrapped[0], valsWrapped[1], valsWrapped[2], valsWrapped[3], valsWrapped[4], valsWrapped[5], valsWrapped[6])
            }
            else
            {
                if (obj != null)
                    ret = (funcStoreL as Function8<Any?,Any?,Any?,Any?,Any?,Any?,Any?,Any?,Any?>).invoke(obj, valsWrapped[0], valsWrapped[1], valsWrapped[2], valsWrapped[3], valsWrapped[4], valsWrapped[5], valsWrapped[6])
                else
                    ret = (funcStoreL as Function8<Any?,Any?,Any?,Any?,Any?,Any?,Any?,Any?,Any?>).invoke(valsWrapped[0], valsWrapped[1], valsWrapped[2], valsWrapped[3], valsWrapped[4], valsWrapped[5], valsWrapped[6], valsWrapped[7])
            }

        }

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
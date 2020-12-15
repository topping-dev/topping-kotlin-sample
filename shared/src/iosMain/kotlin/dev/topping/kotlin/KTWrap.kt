package dev.topping.kotlin

import kotlinx.cinterop.*
import kotlin.reflect.KCallable
import kotlin.reflect.KClass
import kotlin.reflect.KFunction
import kotlin.reflect.KFunction1
import kotlin.reflect.KFunction2
import kotlin.reflect.KFunction3
import kotlin.reflect.KFunction4
import kotlin.reflect.KFunction5
import kotlin.reflect.KFunction6
import kotlin.reflect.KFunction7
import kotlin.reflect.KFunction8

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

            return objIn
        }
    }

    var obj: Any? = null
    var funcStore: KFunction<T>? = null
    var funcStore1: KFunction1<Any?, T>? = null
    var funcStore2: KFunction2<Any?, Any?, T>? = null
    var funcStore3: KFunction3<Any?, Any?, Any?, T>? = null
    var funcStore4: KFunction4<Any?, Any?, Any?, Any?, T>? = null
    var funcStore5: KFunction5<Any?, Any?, Any?, Any?, Any?, T>? = null
    var funcStore6: KFunction6<Any?, Any?, Any?, Any?, Any?, Any?, T>? = null
    var funcStore7: KFunction7<Any?, Any?, Any?, Any?, Any?, Any?, Any?, T>? = null
    var funcStore8: KFunction8<Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, T>? = null

    fun Init(obj: Any?, func: KCallable<T>?): CPointer<CFunction<(COpaquePointer?, List<Any?>?) -> COpaquePointer?>> {
        if(func is KFunction<*>)
            Init(obj, func as KFunction<T>)
        else if(func is KFunction1<*, *>)
            Init(obj, func as KFunction1<Any?, T>)
        else if(func is KFunction2<*, *, *>)
            Init(obj, func as KFunction2<Any?, Any?, T>)
        else if(func is KFunction3<*, *, *, *>)
            Init(obj, func as KFunction3<Any?, Any?, Any?, T>)
        else if(func is KFunction4<*, *, *, *, *>)
            Init(obj, func as KFunction4<Any?, Any?, Any?, Any?, T>)
        else if(func is KFunction5<*, *, *, *, *, *>)
            Init(obj, func as KFunction5<Any?, Any?, Any?, Any?, Any?, T>)
        else if(func is KFunction6<*, *, *, *, *, *, *>)
            Init(obj, func as KFunction6<Any?, Any?, Any?, Any?, Any?, Any?, T>)
        else if(func is KFunction7<*, *, *, *, *, *, *, *>)
            Init(obj, func as KFunction7<Any?, Any?, Any?, Any?, Any?, Any?, Any?, T>)
        else /*if(func is KFunction8<*, *, *, *, *, *, *, *, *>)*/
            Init(obj, func as KFunction8<Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, T>)

        return staticCFunction<COpaquePointer?, List<Any?>?, COpaquePointer?> { obj: COpaquePointer?, vars: List<Any?>? ->
            val v = obj?.asStableRef<KTWrap<*>>()
            StableRef.create(v?.get()?.funToCall(vars!!)!!).asCPointer()
        }
    }

    fun Init(obj: Any?, func: KFunction<T>?) {
        this.obj = obj
        this.funcStore = func
    }

    fun Init(obj: Any?, func: KFunction1<Any?, T>?) {
        this.obj = obj
        this.funcStore1 = func
    }

    fun Init(obj: Any?, func: KFunction2<Any?, Any?, T>?) {
        this.obj = obj
        this.funcStore2 = func
    }

    fun Init(obj: Any?, func: KFunction3<Any?, Any?, Any?, T>?) {
        this.obj = obj
        this.funcStore3 = func
    }

    fun Init(obj: Any?, func: KFunction4<Any?, Any?, Any?, Any?, T>?) {
        this.obj = obj
        this.funcStore4 = func
    }

    fun Init(obj: Any?, func: KFunction5<Any?, Any?, Any?, Any?, Any?, T>?) {
        this.obj = obj
        this.funcStore5 = func
    }

    fun Init(obj: Any?, func: KFunction6<Any?, Any?, Any?, Any?, Any?, Any?, T>?) {
        this.obj = obj
        this.funcStore6 = func
    }

    fun Init(obj: Any?, func: KFunction7<Any?, Any?, Any?, Any?, Any?, Any?, Any?, T>?) {
        this.obj = obj
        this.funcStore7 = func
    }

    fun Init(obj: Any?, func: KFunction8<Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, T>?) {
        this.obj = obj
        this.funcStore8 = func
    }

    fun funToCall(vars: List<Any?>?): T?
    {
        val valsWrapped: ArrayList<Any> = arrayListOf()
        val bindings = Platform.GetBindings()
        val retBindings = Platform.GetRetBindings()
        for((count, item) in vars!!.withIndex())
        {
            if(item != null && bindings?.containsKey(item::class)!!)
            {
                val cls = bindings[item::class] as KClass<*>
                val obj = KTClass.createInstance(cls)
                if(obj is KTInterface)
                {
                    val v = vars[count]
                    (obj as KTInterface).SetNativeObject(v)
                    valsWrapped.add(obj)
                }
            }
            else
                valsWrapped.add(vars[count]!!)
        }

        var ret: Any? = null
        if(funcStore1 != null)
        {
            if(obj != null)
                ret = funcStore1?.invoke(obj)
            else
                ret = funcStore1?.invoke(valsWrapped[0])
        }
        else if(funcStore2 != null)
        {
            if(obj != null)
                ret = funcStore2?.invoke(obj, valsWrapped[0])
            else
                ret = funcStore2?.invoke(valsWrapped[0], valsWrapped[1])
        }
        else if(funcStore3 != null)
        {
            if(obj != null)
                ret = funcStore3?.invoke(obj, valsWrapped[0], valsWrapped[1])
            else
                ret = funcStore3?.invoke(valsWrapped[0], valsWrapped[1], valsWrapped[2])
        }
        else if(funcStore4 != null)
        {
            if(obj != null)
                ret = funcStore4?.invoke(obj, valsWrapped[0], valsWrapped[1], valsWrapped[2])
            else
                ret = funcStore4?.invoke(valsWrapped[0], valsWrapped[1], valsWrapped[2], valsWrapped[3])
        }
        else if(funcStore5 != null)
        {
            if(obj != null)
                ret = funcStore5?.invoke(obj, valsWrapped[0], valsWrapped[1], valsWrapped[2], valsWrapped[3])
            else
                ret = funcStore5?.invoke(valsWrapped[0], valsWrapped[1], valsWrapped[2], valsWrapped[3], valsWrapped[4])
        }
        else if(funcStore6 != null)
        {
            if(obj != null)
                ret = funcStore6?.invoke(obj, valsWrapped[0], valsWrapped[1], valsWrapped[2], valsWrapped[3], valsWrapped[4])
            else
                ret = funcStore6?.invoke(valsWrapped[0], valsWrapped[1], valsWrapped[2], valsWrapped[3], valsWrapped[4], valsWrapped[5])
        }
        else if(funcStore7 != null)
        {
            if(obj != null)
                ret = funcStore7?.invoke(obj, valsWrapped[0], valsWrapped[1], valsWrapped[2], valsWrapped[3], valsWrapped[4], valsWrapped[5])
            else
                ret = funcStore7?.invoke(valsWrapped[0], valsWrapped[1], valsWrapped[2], valsWrapped[3], valsWrapped[4], valsWrapped[5], valsWrapped[6])
        }
        else if(funcStore8 != null)
        {
            if(obj != null)
                ret = funcStore8?.invoke(obj, valsWrapped[0], valsWrapped[1], valsWrapped[2], valsWrapped[3], valsWrapped[4], valsWrapped[5], valsWrapped[6])
            else
                ret = funcStore8?.invoke(valsWrapped[0], valsWrapped[1], valsWrapped[2], valsWrapped[3], valsWrapped[4], valsWrapped[5], valsWrapped[6], valsWrapped[7])
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
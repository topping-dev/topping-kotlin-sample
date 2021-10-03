package dev.topping.kotlin

import kotlinx.cinterop.*
import platform.Foundation.NSLog
import platform.Foundation.NSNumber
import platform.Foundation.numberWithInt
import platform.darwin.NSObject
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

class KTWrap {
    companion object {
        fun Wrap(objIn: Any?): Any?
        {
            if(objIn == null)
                return null

            val bindings = Platform.GetBindings()

            var itemName : String = objIn.toString()
            itemName = itemName.split(":")[0]
            itemName = itemName.substring(1)

            if(bindings?.containsKey(itemName)!!)
            {
                val cls = bindings[itemName] as KClass<*>
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
    var func: KCallable<Any?>? = null
    var funcStore: KFunction<Any?>? = null
    var funcStore1: KFunction1<Any?, Any?>? = null
    var funcStore2: KFunction2<Any?, Any?, Any?>? = null
    var funcStore3: KFunction3<Any?, Any?, Any?, Any?>? = null
    var funcStore4: KFunction4<Any?, Any?, Any?, Any?, Any?>? = null
    var funcStore5: KFunction5<Any?, Any?, Any?, Any?, Any?, Any?>? = null
    var funcStore6: KFunction6<Any?, Any?, Any?, Any?, Any?, Any?, Any?>? = null
    var funcStore7: KFunction7<Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?>? = null
    var funcStore8: KFunction8<Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?>? = null

    fun Init(obj: Any?, func: KCallable<Any?>?): CPointer<CFunction<(COpaquePointer?, Int, List<Any?>?) -> NSObject?>> {
        this.obj = obj
        this.func = func

        return staticCFunction<COpaquePointer?, Int, List<Any?>?, NSObject?> { obj: COpaquePointer?, self: Int, vars: List<Any?>? ->
            val v = obj?.asStableRef<KTWrap>()
            v?.get()?.funToCall(self, vars!!)!!
        }
    }

    fun Init(obj: Any?, func: KFunction<Any?>?) {
        this.obj = obj
        this.funcStore = func
    }

    fun Init(obj: Any?, func: KFunction1<Any?, Any?>?) {
        this.obj = obj
        this.funcStore1 = func
    }

    fun Init(obj: Any?, func: KFunction2<Any?, Any?, Any?>?) {
        this.obj = obj
        this.funcStore2 = func
    }

    fun Init(obj: Any?, func: KFunction3<Any?, Any?, Any?, Any?>?) {
        this.obj = obj
        this.funcStore3 = func
    }

    fun Init(obj: Any?, func: KFunction4<Any?, Any?, Any?, Any?, Any?>?) {
        this.obj = obj
        this.funcStore4 = func
    }

    fun Init(obj: Any?, func: KFunction5<Any?, Any?, Any?, Any?, Any?, Any?>?) {
        this.obj = obj
        this.funcStore5 = func
    }

    fun Init(obj: Any?, func: KFunction6<Any?, Any?, Any?, Any?, Any?, Any?, Any?>?) {
        this.obj = obj
        this.funcStore6 = func
    }

    fun Init(obj: Any?, func: KFunction7<Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?>?) {
        this.obj = obj
        this.funcStore7 = func
    }

    fun Init(obj: Any?, func: KFunction8<Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?>?) {
        this.obj = obj
        this.funcStore8 = func
    }

    fun funToCall(self: Int, vars: List<Any?>?): NSObject?
    {
        val valsWrapped: ArrayList<Any> = arrayListOf()
        val bindings = Platform.GetBindings()
        val retBindings = Platform.GetRetBindings()
        for((count, item) in vars!!.withIndex())
        {
			var itemName : String? = null
			if(item != null)
			{
				itemName = item.toString();
				itemName = itemName.split(":")[0];
				itemName = itemName.substring(1);
			}
            if(item != null && bindings?.containsKey(itemName as String)!!)
            {
                val cls = bindings[itemName as String] as KClass<*>
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
        var varsSize = vars.size
        if(self == 0)
            varsSize++
        if(varsSize == 0)
            Init(this.obj, this.func as KFunction<Any?>)
        else if(varsSize == 1)
            Init(this.obj, this.func as KFunction1<Any?, Any?>)
        else if(varsSize == 2)
            Init(this.obj, this.func as KFunction2<Any?, Any?, Any?>)
        else if(varsSize == 3)
            Init(this.obj, this.func as KFunction3<Any?, Any?, Any?, Any?>)
        else if(varsSize == 4)
            Init(this.obj, this.func as KFunction4<Any?, Any?, Any?, Any?, Any?>)
        else if(varsSize == 5)
            Init(this.obj, this.func as KFunction5<Any?, Any?, Any?, Any?, Any?, Any?>)
        else if(varsSize == 6)
            Init(this.obj, this.func as KFunction6<Any?, Any?, Any?, Any?, Any?, Any?, Any?>)
        else if(varsSize == 7)
            Init(this.obj, this.func as KFunction7<Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?>)
        else /*if(func is KFunction8<*, *, *, *, *, *, *, *, *>)*/
            Init(this.obj, this.func as KFunction8<Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?>)
        if(self == 1)
            this.obj = null
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
        ////TODO:ret is Unit not working ??
        if(ret != null && ret.toString() != "kotlin.Unit") {
            if (ret is KTInterface) {
                retWrapped = (ret as KTInterface).GetNativeObject()
            }
            else
                retWrapped = ret
        }
        else
            retWrapped = NSNumber.numberWithInt(1)

        return retWrapped as NSObject?
    }
}

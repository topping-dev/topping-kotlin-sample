package dev.topping.kotlin

actual open class ILGRecyclerViewAdapter actual constructor(adapter: Any) : KTInterface {
    var iLgRecyclerViewAdapter: cocoapods.Topping.ILGRecyclerViewAdapter? = null
    private var adapter: LGRecyclerViewAdapter

    init {
        this.adapter = KTWrap.Wrap(adapter) as LGRecyclerViewAdapter
        iLgRecyclerViewAdapter = cocoapods.Topping.ILGRecyclerViewAdapter()
        iLgRecyclerViewAdapter?.ltOnCreateViewHolder = ::onCreateViewHolder.toLuaTranslator(null)
        iLgRecyclerViewAdapter?.ltOnBindViewHolder = ::onBindViewHolder.toLuaTranslator(null)
        iLgRecyclerViewAdapter?.ltGetItemViewType = ::getItemViewType.toLuaTranslator(null)
        iLgRecyclerViewAdapter?.ltGetItemCount = ::getItemCount.toLuaTranslator(null)
    }

    actual open fun onCreateViewHolder(parent: LGView, viewType: Int, context: LuaContext) {}
    actual open fun onBindViewHolder(view: LGView, position: Int) {}
    actual open fun getItemViewType(position: Int) : Int { return 0 }
    actual open fun getItemCount() : Int { return 0 }
    actual fun getAdapter(): LGRecyclerViewAdapter { return adapter }
    open override fun GetNativeObject(): Any?
    {
        return iLgRecyclerViewAdapter
    }
    open override fun SetNativeObject(par :Any?)
    {
        iLgRecyclerViewAdapter = par as cocoapods.Topping.ILGRecyclerViewAdapter?
    }
}
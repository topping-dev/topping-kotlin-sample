package dev.topping.kotlin.androidApp

import android.os.Bundle
import dev.topping.android.LuaForm
import dev.topping.android.backend.LuaInterface
import dev.topping.kotlin.Platform
import dev.topping.kotlin.GenericOnComplete

class MainActivity : LuaForm(), LuaInterface {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.empty)

        Platform.init(this, object : GenericOnComplete {
            override fun onComplete() {

            }
        })
    }

    override fun GetId(): String {
        return "Main"
    }
}

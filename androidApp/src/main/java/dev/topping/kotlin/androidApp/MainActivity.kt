package dev.topping.kotlin.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.topping.kotlin.Platform
import dev.topping.kotlin.GenericOnComplete

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Platform.Init(this, object : GenericOnComplete {
            override fun onComplete() {

            }
        })
    }
}

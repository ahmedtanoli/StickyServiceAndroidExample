package com.phonecheck.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    companion object {
        @JvmField
        val ACTION_MAIN = "com.phonecheck"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startService(Intent(this, KeepAliveService::class.java).setAction(ACTION_MAIN))

    }
}
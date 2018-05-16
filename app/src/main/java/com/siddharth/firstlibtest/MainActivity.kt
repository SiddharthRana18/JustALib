package com.siddharth.firstlibtest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.siddharth.mylib.JustALib
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        click.setOnClickListener {
            JustALib.showToast("Yay!", this)
        }
    }
}

package com.siddharth.mylib

import android.content.Context
import android.widget.Toast

class JustALib {

    companion object {
        fun showToast(message: String, context: Context) {
            Toast.makeText(context, message, Toast.LENGTH_LONG).show()
        }
    }

}

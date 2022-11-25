package com.mking1102.koin_example

import android.content.Context
import android.widget.Toast

class TestDependency(private val context: Context) {
    fun bark() {
        Toast.makeText(context, "Woof", Toast.LENGTH_LONG).show()
    }
}
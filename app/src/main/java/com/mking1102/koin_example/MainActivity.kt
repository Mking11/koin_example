package com.mking1102.koin_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.work.impl.model.Dependency
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class MainActivity : AppCompatActivity() {

    private val dependency: TestDependency by inject { parametersOf(this) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dependency.bark()
        setContentView(R.layout.activity_main)
    }
}
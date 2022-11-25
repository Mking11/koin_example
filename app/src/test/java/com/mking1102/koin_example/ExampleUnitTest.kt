package com.mking1102.koin_example

import org.junit.Test
import org.koin.core.context.startKoin
import org.koin.test.KoinTest
import org.koin.test.get
import kotlin.test.assertSame


class ExampleUnitTest : KoinTest {
    @Test
    fun addition_isCorrect() {
        startKoin {
            modules(dependency)
        }
        val dependency: TestDependency = get()
        assertSame(dependency.bark(), "Woof")
    }
}
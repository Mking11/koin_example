package com.mking1102.koin_example

import org.koin.dsl.module


val dependency = module{
    single {  TestDependency() }
}

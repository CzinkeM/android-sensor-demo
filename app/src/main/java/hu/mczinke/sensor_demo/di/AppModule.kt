package hu.mczinke.sensor_demo.di

import org.koin.dsl.module

val appModule = module {
    viewModelModule
    sensorModule
}
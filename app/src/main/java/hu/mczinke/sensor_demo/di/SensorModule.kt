package hu.mczinke.sensor_demo.di

import hu.mczinke.sensor_demo.sensor.AccelerometersSensor
import hu.mczinke.sensor_demo.sensor.GyroscopeSensor
import hu.mczinke.sensor_demo.sensor.ProximitySensor
import org.koin.dsl.module

val sensorModule = module {
    single { GyroscopeSensor(get()) }
    single { AccelerometersSensor(get()) }
    single { ProximitySensor(get()) }

}
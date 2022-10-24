package hu.mczinke.sensor_demo

import android.app.Application
import hu.mczinke.sensor_demo.di.appModule
import hu.mczinke.sensor_demo.di.sensorModule
import hu.mczinke.sensor_demo.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            //sensorModule
            modules(sensorModule, viewModelModule)
        }
    }
}
package hu.mczinke.sensor_demo.di

import hu.mczinke.sensor_demo.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module{
        viewModel<MainViewModel> { MainViewModel(get()) }
}
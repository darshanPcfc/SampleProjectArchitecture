package com.example.sampleprojectarchitecture.di

import org.koin.android.ext.koin.androidApplication
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by Darshan Patel
 * Usage: fetching instance of view model for all view models
 * How to call: inject it through coin
 * Useful parameter: will return context and repository instance to call repository api
 */

val viewModelsInjection = module {
    //viewModel { MainActivityViewModel(androidApplication(), get()) }
    //viewModel { SearchViewModel(androidApplication(), get()) }
}
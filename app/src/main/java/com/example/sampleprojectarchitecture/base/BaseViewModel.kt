package com.example.sampleprojectarchitecture.base

import androidx.databinding.ObservableBoolean
import androidx.lifecycle.ViewModel

import java.lang.ref.WeakReference

/**
 * Created by Darshan Patel
 * Usage: abstract base view model for all application view models
 * How to call: extend it with your view models
 * Useful parameter: observable interface which you need to connect with your fragment
 */
abstract class BaseViewModel<N> : ViewModel() {

    val isLoading = ObservableBoolean()

    private var mNavigator: WeakReference<N>? = null

    override fun onCleared() {
        super.onCleared()
    }

    fun setIsLoading(isLoading: Boolean) {
        this.isLoading.set(isLoading)
    }

    fun getNavigator(): N? {
        return mNavigator?.get()
    }

    fun setNavigator(navigator: N) {
        this.mNavigator = WeakReference(navigator)
    }

}

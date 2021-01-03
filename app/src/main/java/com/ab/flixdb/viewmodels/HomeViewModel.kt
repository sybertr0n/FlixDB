package com.ab.flixdb.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class HomeViewModel(application: Application) : AndroidViewModel(application) {

    init {

    }





    /**
     * Factory class for creating HomeViewModel with reference to Application
     */
    class Factory(val app: Application): ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(HomeViewModel::class.java)) {
                @Suppress("UNCHECKED_CAST")
                return HomeViewModel(app) as T
            }

            throw IllegalArgumentException("Unable to Construct HomeViewModel")
        }

    }
}
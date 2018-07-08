package com.brainasaservice.profile.viewmodel

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.brainasaservice.common.SchedulerConfiguration

class ProfileViewModelFactory(
        private val schedulers: SchedulerConfiguration
): ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(ProfileViewModel::class.java)) {
            return ProfileViewModel(
                    schedulers
            ) as T
        }
        throw IllegalArgumentException()
    }

}

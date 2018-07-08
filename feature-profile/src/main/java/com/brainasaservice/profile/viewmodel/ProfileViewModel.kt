package com.brainasaservice.profile.viewmodel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.brainasaservice.common.SchedulerConfiguration

class ProfileViewModel(
        schedulers: SchedulerConfiguration
) : ViewModel() {

    private val nameLiveData: LiveData<String> = MutableLiveData<String>().apply {
        value = "My name is Name"
    }

    fun observeName(): LiveData<String> = nameLiveData
}
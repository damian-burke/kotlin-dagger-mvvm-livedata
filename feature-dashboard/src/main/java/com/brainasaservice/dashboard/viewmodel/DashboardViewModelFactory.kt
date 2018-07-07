package com.brainasaservice.dashboard.viewmodel

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.brainasaservice.common.SchedulerConfiguration
import com.brainasaservice.dashboard.repository.DashboardRepository

class DashboardViewModelFactory(
        private val dashboardRepository: DashboardRepository,
        private val schedulers: SchedulerConfiguration
): ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(DashboardViewModel::class.java)) {
            return DashboardViewModel(
                    dashboardRepository,
                    schedulers
            ) as T
        }
        throw IllegalArgumentException()
    }

}
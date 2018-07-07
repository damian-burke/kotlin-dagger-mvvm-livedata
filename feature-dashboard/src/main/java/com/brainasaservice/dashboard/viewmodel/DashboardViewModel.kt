package com.brainasaservice.dashboard.viewmodel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.brainasaservice.common.SchedulerConfiguration
import com.brainasaservice.dashboard.domain.TimerLiveData
import com.brainasaservice.dashboard.repository.DashboardRepository
import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import timber.log.Timber
import java.util.concurrent.TimeUnit

class DashboardViewModel(
        dashboardRepository: DashboardRepository,
        schedulers: SchedulerConfiguration
) : ViewModel() {

    private val timerLiveData: TimerLiveData = TimerLiveData(dashboardRepository, schedulers)

    fun observeText(): LiveData<String> = timerLiveData
}
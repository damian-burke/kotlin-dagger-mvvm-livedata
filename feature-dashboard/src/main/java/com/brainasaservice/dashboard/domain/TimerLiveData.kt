package com.brainasaservice.dashboard.domain

import android.arch.lifecycle.LiveData
import com.brainasaservice.common.SchedulerConfiguration
import com.brainasaservice.dashboard.repository.DashboardRepository
import io.reactivex.Observable
import io.reactivex.disposables.Disposable
import timber.log.Timber
import java.util.concurrent.TimeUnit

class TimerLiveData(
        private val dashboardRepository: DashboardRepository,
        private val schedulers: SchedulerConfiguration
) : LiveData<String>() {

    private var disposable: Disposable? = null

    override fun onActive() {
        super.onActive()
        disposable = Observable.interval(0, 1, TimeUnit.SECONDS)
                .flatMapSingle { dashboardRepository.getText() }
                .subscribeOn(schedulers.computation)
                .observeOn(schedulers.ui)
                .subscribe({
                    this.value = it
                }, {
                    Timber.e(it, "???")
                })
    }

    override fun onInactive() {
        super.onInactive()
        disposable?.dispose()
    }
}
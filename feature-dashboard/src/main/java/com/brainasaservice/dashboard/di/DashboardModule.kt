package com.brainasaservice.dashboard.di

import com.brainasaservice.common.SchedulerConfiguration
import com.brainasaservice.dashboard.repository.DashboardRepository
import com.brainasaservice.dashboard.repository.DashboardRepositoryImpl
import com.brainasaservice.dashboard.viewmodel.DashboardViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class DashboardModule {
    @Provides
    fun providesDashboardRepository(): DashboardRepository = DashboardRepositoryImpl()

    @Provides
    fun providesDashboardViewModelFactory(
            dashboardRepository: DashboardRepository,
            schedulers: SchedulerConfiguration
    ): DashboardViewModelFactory = DashboardViewModelFactory(
            dashboardRepository,
            schedulers
    )
}

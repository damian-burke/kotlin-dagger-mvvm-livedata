package com.brainasaservice.profile.di

import com.brainasaservice.common.SchedulerConfiguration
import com.brainasaservice.profile.viewmodel.ProfileViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ProfileModule {
    @Provides
    fun providesProfileViewModelFactory(
            schedulers: SchedulerConfiguration
    ): ProfileViewModelFactory = ProfileViewModelFactory(
            schedulers
    )
}

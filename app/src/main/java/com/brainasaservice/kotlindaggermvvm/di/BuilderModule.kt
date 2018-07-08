package com.brainasaservice.kotlindaggermvvm.di

import com.brainasaservice.dashboard.di.DashboardModule
import com.brainasaservice.dashboard.ui.DashboardFragment
import com.brainasaservice.profile.di.ProfileModule
import com.brainasaservice.profile.ui.ProfileFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class BuilderModule {
    @ContributesAndroidInjector(modules = [DashboardModule::class])
    internal abstract fun bindDashboardFragment(): DashboardFragment

    @ContributesAndroidInjector(modules = [ProfileModule::class])
    internal abstract fun bindProfileFragment(): ProfileFragment
}
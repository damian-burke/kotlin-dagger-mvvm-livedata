package com.brainasaservice.kotlindaggermvvm.di

import com.brainasaservice.dashboard.di.DashboardModule
import com.brainasaservice.dashboard.ui.DashboardActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class BuilderModule {
    @ContributesAndroidInjector(modules = [DashboardModule::class])
    internal abstract fun bindDashboardActivity(): DashboardActivity
}
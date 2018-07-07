package com.brainasaservice.kotlindaggermvvm.di

import android.content.Context
import com.brainasaservice.common.SchedulerConfiguration
import dagger.Module
import com.brainasaservice.kotlindaggermvvm.App
import dagger.Provides
import io.reactivex.Scheduler
import javax.inject.Singleton
import io.reactivex.schedulers.Schedulers
import io.reactivex.android.schedulers.AndroidSchedulers

@Module
class AppModule {
    @Provides
    fun provideContext(application: App): Context {
        return application.applicationContext
    }

    @Provides
    @Singleton
    fun providesSchedulerConfiguration(): SchedulerConfiguration = object : SchedulerConfiguration {
        override var io: Scheduler = Schedulers.io()
        override var computation: Scheduler = Schedulers.computation()
        override var ui: Scheduler = AndroidSchedulers.mainThread()
    }
}
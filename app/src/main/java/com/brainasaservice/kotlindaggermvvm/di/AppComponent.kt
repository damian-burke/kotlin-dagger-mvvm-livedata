package com.brainasaservice.kotlindaggermvvm.di

import com.brainasaservice.kotlindaggermvvm.App

import javax.inject.Singleton

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    AppModule::class,
    BuilderModule::class
])
interface AppComponent: AndroidInjector<App> {
    @Component.Builder
    abstract class Builder: AndroidInjector.Builder<App>()
}

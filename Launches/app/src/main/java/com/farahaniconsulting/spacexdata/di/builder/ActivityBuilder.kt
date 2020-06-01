package com.farahaniconsulting.spacexdata.di.builder

import com.farahaniconsulting.spacexdata.view.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [MainActivityProviders::class])
    abstract fun buildMainActivity(): MainActivity
}
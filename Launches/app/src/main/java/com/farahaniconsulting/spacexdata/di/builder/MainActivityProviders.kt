package com.farahaniconsulting.spacexdata.di.builder

import com.farahaniconsulting.spacexdata.view.launches.LaunchesFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityProviders {
    @ContributesAndroidInjector
    abstract fun provideWeatherInfoFragment(): LaunchesFragment
}
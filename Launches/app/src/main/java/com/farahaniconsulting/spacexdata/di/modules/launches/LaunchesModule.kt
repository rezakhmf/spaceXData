package com.farahaniconsulting.spacexdata.di.modules.launches

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class LaunchesModule {

    @Provides
    @Singleton
    fun provideLaunchesEndpoints(retrofit: Retrofit) : LaunchesAPIService {
        return retrofit.create(LaunchesAPIService::class.java)
    }
}
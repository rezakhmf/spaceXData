package com.farahaniconsulting.spacexdata.di.modules

import android.content.Context
import com.farahaniconsulting.spacexdata.SpaceXDataLaunchApp
import com.farahaniconsulting.spacexdata.di.builder.ActivityBuilder
import com.farahaniconsulting.spacexdata.di.builder.ViewModelBuilder
import com.farahaniconsulting.spacexdata.di.modules.launches.LaunchesModule
import com.farahaniconsulting.spacexdata.di.modules.network.NetworkModule
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module(includes = [NetworkModule::class, LaunchesModule::class, ActivityBuilder::class, ViewModelBuilder::class])
class SpaceXDataLaunchModule {

    @Provides
    @Singleton
    fun provideContext(app: SpaceXDataLaunchApp) : Context {
        return app
    }
}
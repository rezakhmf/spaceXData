package com.farahaniconsulting.spacexdata.di.components

import com.farahaniconsulting.spacexdata.SpaceXDataLaunchApp
import com.farahaniconsulting.spacexdata.di.modules.SpaceXDataLaunchModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, SpaceXDataLaunchModule::class])
interface SpaceXDataLaunchComponent: AndroidInjector<SpaceXDataLaunchApp> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: SpaceXDataLaunchApp): Builder

        fun build(): SpaceXDataLaunchComponent
    }
}
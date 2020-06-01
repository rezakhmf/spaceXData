package com.farahaniconsulting.spacexdata

import android.content.Context
import androidx.multidex.MultiDex
import com.farahaniconsulting.spacexdata.di.components.DaggerSpaceXDataLaunchComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class SpaceXDataLaunchApp: DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerSpaceXDataLaunchComponent
            .builder()
            .application(this)
            .build()
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }
}
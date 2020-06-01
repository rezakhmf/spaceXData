package com.farahaniconsulting.spacexdata.di.builder

import androidx.lifecycle.ViewModel
import com.farahaniconsulting.spacexdata.di.qualifier.ViewModelKey
import com.farahaniconsulting.spacexdata.view.launches.LaunchesViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class AppViewModelBuilder {
    @Binds
    @IntoMap
    @ViewModelKey(LaunchesViewModel::class)
    abstract fun bindWeatherInfoViewModel(weatherInfoViewModel: LaunchesViewModel) : ViewModel
}
package com.farahaniconsulting.spacexdata.di.builder

import com.farahaniconsulting.spacexdata.repository.BaseLaunchRepository
import com.farahaniconsulting.spacexdata.repository.LaunchRepository
import dagger.Binds
import dagger.Module

@Module
abstract class RepositoryBuilder {

    @Binds
    abstract fun bindsWeatherRepository(weatherRepository: LaunchRepository) : BaseLaunchRepository
}
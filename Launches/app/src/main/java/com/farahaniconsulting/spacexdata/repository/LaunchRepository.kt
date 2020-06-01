package com.farahaniconsulting.spacexdata.repository

import com.farahaniconsulting.spacexdata.di.modules.launches.LaunchesAPIService
import com.farahaniconsulting.spacexdata.repository.launches.model.LaunchModel
import javax.inject.Inject

class LaunchRepository @Inject constructor(private val launchesAPIService: LaunchesAPIService): BaseLaunchRepository {

    override suspend fun getLaunches(): ArrayList<LaunchModel?> {
        return launchesAPIService.getAllLaunches()
    }
}
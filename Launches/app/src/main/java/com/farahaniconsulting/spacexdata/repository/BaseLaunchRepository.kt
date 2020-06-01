package com.farahaniconsulting.spacexdata.repository

import com.farahaniconsulting.spacexdata.repository.launches.model.LaunchModel

interface BaseLaunchRepository {
    suspend fun getLaunches(): ArrayList<LaunchModel?>
}
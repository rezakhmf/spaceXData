package com.farahaniconsulting.spacexdata.di.modules.launches

import com.farahaniconsulting.spacexdata.di.modules.network.API
import com.farahaniconsulting.spacexdata.repository.launches.model.LaunchModel
import retrofit2.http.GET
import retrofit2.http.Query

interface LaunchesAPIService {
    @GET(API.ALL_LAUNCHES)
    suspend fun getAllLaunches() : ArrayList<LaunchModel?>
}
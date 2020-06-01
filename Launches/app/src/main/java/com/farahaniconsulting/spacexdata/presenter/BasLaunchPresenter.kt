package com.farahaniconsulting.spacexdata.presenter

import com.farahaniconsulting.spacexdata.repository.launches.model.LaunchModel

interface BasLaunchPresenter {
    suspend fun getLaunches(): ArrayList<LaunchModel?>
}
package com.farahaniconsulting.spacexdata.presenter

import com.farahaniconsulting.spacexdata.repository.LaunchRepository
import com.farahaniconsulting.spacexdata.repository.launches.model.LaunchModel
import javax.inject.Inject

class LaunchesPresenter @Inject constructor(private val launchRepository: LaunchRepository) :
    BasLaunchPresenter {

    override suspend fun getLaunches(): ArrayList<LaunchModel?> {
        return launchRepository.getLaunches()
    }

}
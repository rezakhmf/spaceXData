package com.farahaniconsulting.spacexdata.view.launches

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.farahaniconsulting.spacexdata.presenter.LaunchesPresenter
import com.farahaniconsulting.spacexdata.repository.launches.model.LaunchModel
import javax.inject.Inject

class LaunchesViewModel @Inject constructor(private val launchesPresenter: LaunchesPresenter) :
    ViewModel() {

    private val TAG = LaunchesViewModel::class.java.simpleName

    init {
        Log.d(TAG, "is loaded")
    }

    val launchesData: LiveData<ArrayList<LaunchModel?>> = liveData {
        val data = launchesPresenter.getLaunches()
        emit(data)
    }


}
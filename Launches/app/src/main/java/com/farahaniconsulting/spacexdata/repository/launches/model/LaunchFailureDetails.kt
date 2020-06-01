package com.farahaniconsulting.spacexdata.repository.launches.model


import com.google.gson.annotations.SerializedName

data class LaunchFailureDetails(
    @SerializedName("altitude")
    val altitude: Any?,
    @SerializedName("reason")
    val reason: String?,
    @SerializedName("time")
    val time: Int?
)
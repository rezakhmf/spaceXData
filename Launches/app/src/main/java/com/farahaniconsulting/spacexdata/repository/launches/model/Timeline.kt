package com.farahaniconsulting.spacexdata.repository.launches.model


import com.google.gson.annotations.SerializedName

data class Timeline(
    @SerializedName("webcast_liftoff")
    val webcastLiftoff: Int?
)
package com.farahaniconsulting.spacexdata.view.fragmentFactory

import com.farahaniconsulting.spacexdata.view.launches.LaunchesFragment

object FragmentFactorySpaceXData {

    fun getLaunchesFragment(supportFragmentManager: androidx.fragment.app.FragmentManager): LaunchesFragment {
        var fragment = supportFragmentManager.findFragmentByTag(LaunchesFragment.FRAGMENT_NAME)
        if (fragment == null) {
            fragment = LaunchesFragment()
        }
        return fragment as LaunchesFragment
    }
}
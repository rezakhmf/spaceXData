package com.farahaniconsulting.spacexdata.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.farahaniconsulting.spacexdata.R
import com.farahaniconsulting.spacexdata.view.fragmentFactory.FragmentFactorySpaceXData
import com.farahaniconsulting.spacexdata.view.launches.LaunchesFragment
import com.farahaniconsulting.spacexdata.view.launches.LaunchesViewModel
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel: LaunchesViewModel by viewModels {viewModelFactory}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        viewModel.launchesData.observe(this, Observer {
            it?.let {

            }
        })

        initFragment()
    }

    private fun initFragment() {
        val launchesFragment = FragmentFactorySpaceXData.getLaunchesFragment(supportFragmentManager)

        val fragmentTransaction = supportFragmentManager.beginTransaction()
            .replace(
                R.id.frameLayout_launches_container, launchesFragment,
                LaunchesFragment.FRAGMENT_NAME)

        fragmentTransaction.commit()
    }
}

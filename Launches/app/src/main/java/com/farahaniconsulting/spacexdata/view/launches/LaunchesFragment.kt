package com.farahaniconsulting.spacexdata.view.launches

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.farahaniconsulting.spacexdata.R
import com.farahaniconsulting.spacexdata.presenter.utils.ifLet
import com.farahaniconsulting.spacexdata.repository.launches.model.LaunchModel
import com.farahaniconsulting.spacexdata.view.launches.adapter.LaunchesAdapter
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.fragment_launches_rv.*
import kotlinx.android.synthetic.main.fragment_launches_rv.view.*
import kotlinx.android.synthetic.main.fragment_launches_rv.view.rv_launches
import javax.inject.Inject
import kotlin.math.log

class LaunchesFragment : DaggerFragment() {

    private val TAG: String = LaunchesFragment::class.java.simpleName

    companion object {
        val FRAGMENT_NAME: String = LaunchesFragment::class.java.name
    }

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    val viewModel: LaunchesViewModel by viewModels { viewModelFactory }

    val adapter: LaunchesAdapter by lazy { LaunchesAdapter(arrayListOf()) }

    init {
        Log.d(TAG, "is loaded")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_launches_rv, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(viewModel) {
            launchesData.observe(viewLifecycleOwner, Observer { launches ->
                initView(ArrayList(launches.filterNotNull()))
            })
        }

    }

    private fun initView(launches: ArrayList<LaunchModel>) {
        rv_launches.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        rv_launches.adapter = adapter

        if (launches.isNotEmpty()) {
            adapter.clear()
            adapter.add(launches)
        } else {
            Toast.makeText(
                context,
                context?.getString(R.string.empty_list),
                android.widget.Toast.LENGTH_LONG
            ).show()
        }
    }
}
package com.farahaniconsulting.spacexdata.view.launches.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.farahaniconsulting.spacexdata.BR
import com.farahaniconsulting.spacexdata.databinding.FragmentLaucnItemBinding
import com.farahaniconsulting.spacexdata.repository.launches.model.LaunchModel
import com.farahaniconsulting.spacexdata.view.launches.DataBindingViewHolder

class LaunchesAdapter(private var items: ArrayList<LaunchModel> = arrayListOf()) : RecyclerView.Adapter<LaunchesAdapter.LaunchesViewHolder>()  {


    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: LaunchesViewHolder, position: Int) {
        holder.onBind(items[position])
        holder.dataBinding.executePendingBindings()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LaunchesViewHolder {
        val binding = FragmentLaucnItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LaunchesViewHolder(binding)
    }

    inner class LaunchesViewHolder(dataBinding: ViewDataBinding) : DataBindingViewHolder<LaunchModel?>(dataBinding) {
        override fun onBind(t: LaunchModel?) {
            dataBinding.setVariable(BR.launch ,t)
        }
    }

    fun add(list: ArrayList<LaunchModel>) {
        items.addAll(list)
        notifyDataSetChanged()
    }

    fun clear() {
        items.clear()
        notifyDataSetChanged()
    }

}
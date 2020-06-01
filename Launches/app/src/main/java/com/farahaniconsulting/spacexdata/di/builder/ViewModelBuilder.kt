package com.farahaniconsulting.spacexdata.di.builder

import androidx.lifecycle.ViewModelProvider
import com.farahaniconsulting.spacexdata.view.launches.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module(includes = [ RepositoryBuilder::class, AppViewModelBuilder::class])
abstract class ViewModelBuilder {

    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory
}
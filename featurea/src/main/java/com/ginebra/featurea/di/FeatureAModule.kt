package com.ginebra.featurea.di

import com.ginebra.di.FeatureAComponent
import com.ginebra.domain.repositories.Repository
import com.ginebra.domain.usecases.GetSomeValueUseCase
import com.ginebra.featurea.MainPresenter
import com.ginebra.featurea.MainView
import com.ginebra.featurea.data.RepositoryAImpl
import com.ginebra.featurea.domain.repositories.RepositoryA

class FeatureAModule constructor(private val repository: Repository) : FeatureAComponent {

    private val repositoryA: RepositoryA by lazy {
        RepositoryAImpl()
    }

    private fun provideGetSomeValueUseCase(): GetSomeValueUseCase {
        return GetSomeValueUseCase(repository)
    }

    internal fun provideMainPresenter(view: MainView): MainPresenter {
        return MainPresenter(view, provideGetSomeValueUseCase(), repositoryA)
    }

}
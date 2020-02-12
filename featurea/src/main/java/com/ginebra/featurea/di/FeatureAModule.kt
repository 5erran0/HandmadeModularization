package com.ginebra.featurea.di

import com.ginebra.di.FeatureAComponent
import com.ginebra.domain.repositories.Repository
import com.ginebra.domain.usecases.GetSomeValueUseCase

class FeatureAModule constructor(private val repository: Repository) : FeatureAComponent {

    internal fun provideGetSomeValueUseCase(): GetSomeValueUseCase {
        return GetSomeValueUseCase(repository)
    }

}
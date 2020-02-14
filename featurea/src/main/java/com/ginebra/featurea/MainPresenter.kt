package com.ginebra.featurea

import com.ginebra.domain.usecases.GetSomeValueUseCase
import com.ginebra.featurea.domain.repositories.RepositoryA

internal class MainPresenter constructor(
    private val view: MainView,
    private val useCase: GetSomeValueUseCase,
    private val repositoryA: RepositoryA
) {

    fun onStart() {
        view.showValue(useCase.getSomeValue())
    }
}
package com.ginebra.featurea

import com.ginebra.domain.usecases.GetSomeValueUseCase

internal class MainPresenter constructor(
    private val view: MainView,
    private val useCase: GetSomeValueUseCase
) {

    fun onStart() {
        view.showValue(useCase.getSomeValue())
    }
}
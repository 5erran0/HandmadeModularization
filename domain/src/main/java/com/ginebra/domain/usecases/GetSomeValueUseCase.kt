package com.ginebra.domain.usecases

import com.ginebra.domain.repositories.Repository

class GetSomeValueUseCase constructor(private val repository: Repository) {

    fun getSomeValue(): String {
        return repository.getSomeValue()
    }
}
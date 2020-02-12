package com.ginebra.data

import com.ginebra.domain.repositories.Repository

internal class RepositoryImpl : Repository {
    override fun getSomeValue(): String {
        return "Hello World"
    }
}
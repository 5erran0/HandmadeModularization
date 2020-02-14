package com.ginebra.featurea.data

import com.ginebra.featurea.domain.repositories.RepositoryA

internal class RepositoryAImpl: RepositoryA {
    override fun getAValue(): String {
        return "Value A"
    }
}
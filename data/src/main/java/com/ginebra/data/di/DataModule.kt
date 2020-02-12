package com.ginebra.data.di

import com.ginebra.data.RepositoryImpl
import com.ginebra.di.DataComponent
import com.ginebra.domain.repositories.Repository

class DataModule: DataComponent {

    override fun provideRepository(): Repository {
        return RepositoryImpl()
    }
}
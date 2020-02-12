package com.ginebra.di

import com.ginebra.domain.repositories.Repository

interface DataComponent {
    fun provideRepository(): Repository
}
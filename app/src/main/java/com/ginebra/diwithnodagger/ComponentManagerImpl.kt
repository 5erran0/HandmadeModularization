package com.ginebra.diwithnodagger

import com.ginebra.data.di.DataModule
import com.ginebra.di.ComponentManager
import com.ginebra.di.DataComponent
import com.ginebra.di.FeatureAComponent
import com.ginebra.featurea.di.FeatureAModule

class ComponentManagerImpl : ComponentManager {

    override val dataComponent: DataComponent by lazy {
        DataModule()
    }

    override val featureAComponent: FeatureAComponent by lazy {
        FeatureAModule(dataComponent.provideRepository())
    }
}
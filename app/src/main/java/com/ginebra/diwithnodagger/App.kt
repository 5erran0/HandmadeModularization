package com.ginebra.diwithnodagger

import android.app.Application
import com.ginebra.di.ComponentManager
import com.ginebra.di.DIApp

class App : Application(), DIApp {

    override lateinit var componentManager: ComponentManager

    override fun onCreate() {
        super.onCreate()
        componentManager = ComponentManagerImpl()
    }
}
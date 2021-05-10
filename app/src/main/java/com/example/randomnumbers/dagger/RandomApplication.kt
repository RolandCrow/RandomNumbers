package com.example.randomnumbers.dagger

import android.app.Application

class RandomApplication: Application() {
    lateinit var applicationComponents: ApplicationComponents // инъекция всех компонентов
    // собранных воедино

    override fun onCreate() {
        super.onCreate()
        applicationComponents = DaggerApplicationComponent.create()
    }
}

package com.example.randomnumbers.dagger

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponents { // присоединяем числа

    fun createMainSubcomponent(): MainSubcomponent // создает под компонент
}
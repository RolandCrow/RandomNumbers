package com.example.randomnumbers.dagger

import com.example.randomnumbers.MainActivity
import dagger.Subcomponent

@MainScope
@Subcomponent(modules = [MainModule::class])
interface MainSubcomponent { // под компонент для инъекции в главную активность

    fun inject(mainActivity: MainActivity)
}
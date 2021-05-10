package com.example.randomnumbers.dagger

import com.example.randomnumbers.repository.NumberRepository
import com.example.randomnumbers.repository.NumberRepositoryImplementation
import dagger.Module
import dagger.Provides
import java.util.*

@Module
class ApplicationModule { // главная по providers

    @Provides
    fun provideRandom() : Random = Random() // вводим случайность


    @Provides
    fun provideNumberRepository(random: Random) : NumberRepository =
        NumberRepositoryImplementation(random) // проводим случайное число


}
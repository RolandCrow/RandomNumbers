package com.example.randomnumbers.dagger

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.randomnumbers.MainViewModel
import com.example.randomnumbers.repository.NumberRepository
import dagger.Module
import dagger.Provides

@Suppress("UNCHECKED_CAST")
@Module
class MainModule { // создаем фабрику из репозитория с числом

    @Provides
    fun provideMainViewModelFactory(numberRepository: NumberRepository):ViewModelProvider.Factory {
        return object : ViewModelProvider.Factory {
            override fun <T : ViewModel?> create(modelClass: Class<T>): T {
                return MainViewModel(numberRepository) as T
            }

        }
    }

}
package com.example.randomnumbers

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.randomnumbers.repository.NumberRepository

class MainViewModel(private val numberRepository: NumberRepository): ViewModel() { // создаем вью
    // модел для отображения результатов работы репозитории
    private val numberLiveData = MutableLiveData<Int>() // изменяемый массив
    fun getLiveData() : LiveData<Int> = numberLiveData; // передаем в функцию с LiveData
    fun generateNextNumber() {
        numberLiveData.postValue(numberRepository.generatedNextNumber()) // генерируем случайное
    // число из другого класса

    }

}
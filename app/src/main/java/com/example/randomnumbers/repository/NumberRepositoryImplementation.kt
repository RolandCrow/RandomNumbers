package com.example.randomnumbers.repository

import java.util.*

class NumberRepositoryImplementation(private val random: Random): NumberRepository {
    override fun generatedNextNumber(): Int {
        return random.nextInt() // иницируем получение случайного числа
    }


}
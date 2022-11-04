package com.example.performancetracker.DOMAIN.USECASES

import com.example.performancetracker.DOMAIN.REPOSITORY.SportRepository

class DeleteExerciseByName(private val repository: SportRepository) {
    suspend operator fun invoke(Name:String){
        repository.deleteByExerciseName(Name)
    }
}
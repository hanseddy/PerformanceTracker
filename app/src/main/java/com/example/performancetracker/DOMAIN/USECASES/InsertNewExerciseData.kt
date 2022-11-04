package com.example.performancetracker.DOMAIN.USECASES

import com.example.performancetracker.DOMAIN.MODEL.Sport
import com.example.performancetracker.DOMAIN.REPOSITORY.SportRepository

class InsertNewExerciseData(private val repository: SportRepository) {
    suspend operator fun invoke(sport: Sport){
        repository.InsertDataSport(sport)
    }
}
package com.example.performancetracker.DOMAIN.USECASES.GLOBAL_USESCASES

import com.example.performancetracker.DATA.DATAUTILS.SportDate
import com.example.performancetracker.DOMAIN.MODEL.Sport
import com.example.performancetracker.DOMAIN.REPOSITORY.SportRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import java.sql.Time
import java.util.Calendar

class GetExerciseListOfTheDay(private val repository: SportRepository) {

    private var SportListAtDate:MutableList<Sport> ?= null
    suspend operator fun invoke(date: SportDate): List<Sport> {
       // pour chacun des objet dans la list de la class Sport
        for(sportData in repository.getAllSportData()){
            if (Time(sportData.Date).day.equals(date.day) &&
                Time(sportData.Date).month.equals(date.month )&&
                Time(sportData.Date).year.equals(date.year) ){

                SportListAtDate?.add(sportData)

            }else{
                /*do nothing*/
            }
        }
        return SportListAtDate!!.toList()
    }
}
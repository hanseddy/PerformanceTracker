package com.example.performancetracker.DOMAIN.REPOSITORY

import com.example.performancetracker.DATA.ROOM.SportDAO
import com.example.performancetracker.DATA.ROOM.SportDatabase
import com.example.performancetracker.DOMAIN.MODEL.Sport
import kotlinx.coroutines.flow.Flow

interface SportRepository {

    suspend fun getAllSportData():List<Sport>

    suspend fun getSportDataById(id:Int):Sport

    suspend fun InsertDataSport(sport: Sport)

    suspend fun deleteSportData(sport: Sport)

}
package com.example.performancetracker.DATA.REPOSITORYIMPL

import com.example.performancetracker.DATA.ROOM.SportDAO
import com.example.performancetracker.DOMAIN.MODEL.Sport
import com.example.performancetracker.DOMAIN.REPOSITORY.SportRepository
import kotlinx.coroutines.flow.Flow

class SportRepositoryImpl(private val dao: SportDAO): SportRepository {
    override suspend fun getAllSportData(): List<Sport> {
        return dao.getAllSportData()
    }

    override suspend fun getSportDataById(id: Int):Sport {
        return dao.getSportDataByIds(id)
    }

    override suspend fun InsertDataSport(sport: Sport) {
        dao.insertSportData(sport)
    }

    override suspend fun deleteSportData(sport: Sport) {
        dao.deleteSportData(sport)
    }

    override suspend fun deleteByExerciseName(Name: String) {
        dao.deleteByExerciseName(Name)
    }
}
package com.example.performancetracker.DATA.ROOM

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.performancetracker.DOMAIN.MODEL.Sport
import kotlinx.coroutines.flow.Flow

@Dao
interface SportDAO {
    @Query("SELECT * FROM Sport")
    fun getAllSportData(): Flow<List<Sport>>

    @Query("SELECT * FROM Sport WHERE Id IN (:id)")
    suspend fun getSportDataByIds(id: Int): Sport

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSportData( sport: Sport)

    @Delete
    suspend fun deleteSportData(sport: Sport)
}
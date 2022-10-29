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
    fun getAllSportData(): Flow<Sport>

    @Query("SELECT * FROM Sport WHERE Id IN (:id)")
    fun getSportDataByIds(id: Int): Sport

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertSportData( sport: Sport)

    @Delete
    fun deleteSportData(sport: Sport)
}
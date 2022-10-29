package com.example.performancetracker.DATA.ROOM

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.performancetracker.DOMAIN.MODEL.Sport


@Database(entities = [Sport::class], version = 1, exportSchema = false)
abstract class SportDatabase:RoomDatabase() {

    abstract val sportDAO:SportDAO

    companion object{
        const val DATABASE_NAME= "sport_db"
    }
}


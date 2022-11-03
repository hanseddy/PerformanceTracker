package com.example.performancetracker.DATA.ROOM

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.performancetracker.DOMAIN.MODEL.Sport
import com.example.performancetracker.DOMAIN.UTILS.Converter


@Database(entities = [Sport::class], version = 1, exportSchema = false)
@TypeConverters(Converter::class)
abstract class SportDatabase:RoomDatabase() {

    abstract val sportDAO:SportDAO

    companion object{
        const val DATABASE_NAME= "sport_db"
    }
}


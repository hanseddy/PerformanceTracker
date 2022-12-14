package com.example.performancetracker.DOMAIN.UTILS

import androidx.room.TypeConverter
import com.example.performancetracker.DOMAIN.MODEL.Sport

class Converter {
    @TypeConverter
    fun toMUSCULARGROUP(value : String) = enumValueOf<Sport.Companion.MUSCULARGROUP>(value)

    @TypeConverter
    fun fromMUSCULARGROUP(value: Sport.Companion.MUSCULARGROUP) = value.name

    @TypeConverter
    fun toSUBMUSCULARGROUP(value : String) = enumValueOf<Sport.Companion.SUBMUSCULARGROUP>(value)

    @TypeConverter
    fun fromSUBMUSCULARGROUP(value: Sport.Companion.SUBMUSCULARGROUP) = value.name

    @TypeConverter
    fun toEXOTYPES(value : String) = enumValueOf<DomUtils.Companion.EXOTYPES>(value)

    @TypeConverter
    fun fromEXOTYPES(value: DomUtils.Companion.EXOTYPES) = value.name
}
package com.example.performancetracker.DOMAIN.MODEL

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.performancetracker.DATA.DATAUTILS.SportDate
import java.util.*

@Entity
data class Sport(
    @PrimaryKey val Id: Int,
    val MuscularGroupe: MUSCULARGROUP,
    val SubMuscularGroupe:SUBMUSCULARGROUP,
    val Exercice: String,
    val RepNumGoal: Int,
    val RepNumDone: Int,
    val restTime:Int,
    val Date: Long,
    val weight:Float
){

    companion object{
        enum class MUSCULARGROUP {
            PECTORAUX ,DOS ,JAMBES ,BRAS ,EPAULES ,CEINTUREABDOMINAL
        }
        enum class SUBMUSCULARGROUP {
            BICEPS ,TRICEPS ,DELTOIDE ,AVANTBRAS ,PECTORALSUP ,PECTORALINF ,PECTORALEXT,
            TRAPEZE ,GRANDDORSAL ,LOMBAIRE ,OBLIQUE ,GRANDROND ,QUADRICEPS ,MOLLET ,ADDUCTEUR,
            FESSIER
        }
    }

}

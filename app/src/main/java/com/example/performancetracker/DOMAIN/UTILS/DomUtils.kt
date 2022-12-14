package com.example.performancetracker.DOMAIN.UTILS

import com.example.performancetracker.DOMAIN.MODEL.Sport

class DomUtils {
    companion object{
        /**
         * calculate the sport energie consumption per exercise
         */
        fun ExerciseToKcal(sport: Sport):Float{
           return when(sport.ExerciseType){
               EXOTYPES.BENCHPRESS          -> (1f.times(sport.RepNumDone)).times(sport.seriesNum)
               EXOTYPES.BICEPSCURL          -> (2f.times(sport.RepNumDone)).times(sport.seriesNum)
               EXOTYPES.DEADLIFT            -> (2.3f.times(sport.RepNumDone)).times(sport.seriesNum)
               EXOTYPES.PULLUP              -> (2.1f.times(sport.RepNumDone)).times(sport.seriesNum)
               EXOTYPES.ROWING              -> (0.6f.times(sport.RepNumDone)).times(sport.seriesNum)
               EXOTYPES.SQUAT               -> (1.5f.times(sport.RepNumDone)).times(sport.seriesNum)
               EXOTYPES.DIPS                -> (1.3f.times(sport.RepNumDone)).times(sport.seriesNum)
               EXOTYPES.PAPILLONPEC         -> (0.5f.times(sport.RepNumDone)).times(sport.seriesNum)
               EXOTYPES.TRICEPSEXTENTION    -> (0.6f.times(sport.RepNumDone)).times(sport.seriesNum)
               EXOTYPES.PRESSJAMBE          -> (0.8f.times(sport.RepNumDone)).times(sport.seriesNum)
               EXOTYPES.FENTE               -> (0.7f.times(sport.RepNumDone)).times(sport.seriesNum)
               EXOTYPES.PUSHUP              -> (0.8f.times(sport.RepNumDone)).times(sport.seriesNum)
            }
        }

        /**
         * calculate the total kcal of exercise during a day of training
         */
        fun TotalExerciseOfTheDayToKcal(trainingOfDay:List<Sport>):Float{
            return trainingOfDay.map {
                ExerciseToKcal(it)
            }.sum()
        }


        /**
        * type de donnée qui decris les differents groupe musculaire pricipal
        */
        enum class EXOTYPES {
            PULLUP, DEADLIFT, ROWING, BICEPSCURL, DIPS, TRICEPSEXTENTION,
            SQUAT, PRESSJAMBE, FENTE, BENCHPRESS, PAPILLONPEC, PUSHUP
        }
    }
}
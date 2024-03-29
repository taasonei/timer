package com.github.taasonei.timer.util

import android.content.Context
import androidx.core.content.edit
import androidx.preference.PreferenceManager
import com.github.taasonei.timer.TimerActivity

class PrefUtil {
    companion object {

        private const val TIMER_LENGTH_ID = "com.github.taasonei.timer.timer_length"
        fun getTimerLength(context: Context): Int {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            return preferences.getInt(TIMER_LENGTH_ID, 10)
        }

        private const val PREVIOUS_TIMER_LENGTH_SECONDS_ID =
            "com.github.taasonei.timer.previous_timer_length"

        fun getPreviousTimerLengthSeconds(context: Context): Long {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            return preferences.getLong(PREVIOUS_TIMER_LENGTH_SECONDS_ID, 0)
        }

        fun setPreviousTimerLengthSeconds(seconds: Long, context: Context) {
            val editor = PreferenceManager.getDefaultSharedPreferences(context).edit {
                putLong(PREVIOUS_TIMER_LENGTH_SECONDS_ID, seconds)
            }
        }

        private const val TIMER_STATE_ID = "com.github.taasonei.timer.timer_state"

        fun getTimerState(context: Context): TimerActivity.TimerState {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            val ordinal = preferences.getInt(TIMER_STATE_ID, 0)
            return TimerActivity.TimerState.values()[ordinal]
        }

        fun setTimerState(state: TimerActivity.TimerState, context: Context) {
            val editor = PreferenceManager.getDefaultSharedPreferences(context).edit {
                putInt(TIMER_STATE_ID, state.ordinal)
            }
        }

        private const val SECONDS_REMAINING_ID = "com.github.taasonei.timer.seconds_remaining"

        fun getSecondsRemaining(context: Context): Long {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            return preferences.getLong(SECONDS_REMAINING_ID, 0)
        }

        fun setSecondsRemaining(seconds: Long, context: Context) {
            val editor = PreferenceManager.getDefaultSharedPreferences(context).edit {
                putLong(SECONDS_REMAINING_ID, seconds)
            }
        }

        private const val ALARM_SET_TIME_ID = "com.github.taasonei.timer.backgrounded_time"

        fun getAlarmSetTime(context: Context): Long {
            val preferences = PreferenceManager.getDefaultSharedPreferences(context)
            return preferences.getLong(ALARM_SET_TIME_ID, 0)
        }

        fun setAlarmSetTime(time: Long, context: Context) {
            val editor = PreferenceManager.getDefaultSharedPreferences(context).edit {
                putLong(ALARM_SET_TIME_ID, time)
            }
        }
    }
}

package com.github.taasonei.myapplication

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.github.taasonei.myapplication.util.PrefUtil

class TimerExpiredReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        PrefUtil.setTimerState(TimerActivity.TimerState.Stopped, context)
        PrefUtil.setAlarmSetTime(0, context)
    }
}
package com.vngrs.android.pomodoro.wear;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.vngrs.android.pomodoro.shared.PomodoroMaster;
import com.vngrs.android.pomodoro.shared.model.ActivityType;


/**
 * Example shell activity which simply broadcasts to our receiver and exits.
 */
public class PomodoroWearBroadcastActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent i = new Intent();
        i.setAction(PomodoroMaster.ACTION_START);
        i.putExtra(PomodoroMaster.EXTRA_ACTIVITY_TYPE, ActivityType.POMODORO.value());
        sendBroadcast(i);
        finish();
    }
}